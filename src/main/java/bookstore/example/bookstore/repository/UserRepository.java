package bookstore.example.bookstore.repository;

import bookstore.example.bookstore.repository.entity.UserEntity;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface UserRepository {
    List<UserEntity> findAll(String username, String password);

    boolean existsByUsername(String username);

    void save(UserEntity userEntity);
}
