package bookstore.example.bookstore.repository.impl;

import bookstore.example.bookstore.repository.UserRepository;
import bookstore.example.bookstore.repository.entity.AccountEntity;
import bookstore.example.bookstore.repository.entity.UserEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepositoryImpl implements UserRepository {
    private final JdbcTemplate jdbcTemplate;

    public UserRepositoryImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<UserEntity> findAll(String username, String password) {
        String sql = "SELECT u.*, a.role FROM user u " +
                "JOIN account a ON u.id = a.user_id " +
                "WHERE u.username = ? AND u.password = ?";

        return jdbcTemplate.query(sql, new Object[]{username, password}, (rs, rowNum) -> {
            UserEntity user = new UserEntity();
            user.setFullname(rs.getString("fullname"));
            user.setUsername(rs.getString("username"));
            user.setPassword(rs.getString("password"));
            user.setEmail(rs.getString("email"));
            user.setPhone(rs.getString("phone"));
            user.setAddress(rs.getString("address"));
            user.setGender(rs.getString("gender"));
            user.setDob(rs.getDate("dob"));

            AccountEntity accountEntity = new AccountEntity();
            String role = rs.getString("role");
            accountEntity.setRole(role);
            accountEntity.setUserId(user.getId());

            user.setAccount(accountEntity);

            return user;
        });
    }


    @Override
    public void save(UserEntity userEntity) {
        String userSql = "INSERT INTO user (fullname, username, password, email, phone, address, gender, dob) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        jdbcTemplate.update(userSql, userEntity.getFullname(), userEntity.getUsername(), userEntity.getPassword(),
                userEntity.getEmail(), userEntity.getPhone(), userEntity.getAddress(),
                userEntity.getGender(), new java.sql.Date(userEntity.getDob().getTime()));

        String getUserIdSql = "SELECT id FROM user WHERE username = ?";
        int userId = jdbcTemplate.queryForObject(getUserIdSql, new Object[]{userEntity.getUsername()}, Integer.class);

        String accountSql = "INSERT INTO account (role, user_id) VALUES (?, ?)";
        jdbcTemplate.update(accountSql, "user", userId);
    }


    @Override
    public boolean existsByUsername(String username) {
        String sql = "SELECT COUNT(*) FROM user WHERE username = ?";

        int count = jdbcTemplate.queryForObject(sql, new Object[]{username}, Integer.class);

        return count > 0;
    }
}
