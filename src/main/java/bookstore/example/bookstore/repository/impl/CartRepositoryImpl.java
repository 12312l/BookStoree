package bookstore.example.bookstore.repository.impl;

import bookstore.example.bookstore.repository.CartRepository;
import bookstore.example.bookstore.repository.entity.CartEntity;
import bookstore.example.bookstore.repository.entity.ProductEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CartRepositoryImpl implements CartRepository {
    private final JdbcTemplate jdbcTemplate;

    public CartRepositoryImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

//    @Override
//    public List<CartEntity> findCartIDByUserID(int userId) {
//        String sql = "SELECT id, user_id FROM cart WHERE user_id = ?";
//        return jdbcTemplate.query(sql, new Object[]{userId}, (rs, rowNum) -> {
//            CartEntity cartEntity = new CartEntity();
//            cartEntity.setId(rs.getInt("id"));
//            cartEntity.setUserId(rs.getInt("user_id"));
//            return cartEntity; // Add this return statement
//        });
//    }

//    @Override
//    public List<CartEntity> findCartIDByUserID(int userId) {
//        String sql = """
//            SELECT
//                p.product_id,
//                p.product_name,
//                p.product_author,
//                c.number AS product_quantity,
//                p.product_price,
//                p.product_image,
//                p.product_describe,
//                p.category_id
//            FROM cart c
//            JOIN product p ON c.product_id = p.product_id
//            WHERE c.user_id = ?
//        """;
//        return jdbcTemplate.query(sql, new Object[]{userId}, (rs, rowNum) -> {
//            CartEntity cartEntity = new CartEntity();
//            cartEntity.setId(rs.getInt("id"));
//            cartEntity.setUserId(rs.getInt("user_id"));
//            cartEntity.setProductId(rs.getString("product_id"));
//            cartEntity.setNumber(rs.getInt("number"));
//
//            ProductEntity productEntity = new ProductEntity();
//            productEntity.setProductName(rs.getString("product_name"));
//            productEntity.setProductAuthor(rs.getString("product_author"));
//
//            cartEntity.setProductEntity(productEntity);
//            return cartEntity; // Add this return statement
//        });
//    }

    @Override
    public List<CartEntity> findCartIDByUserID(int userId) {
        String sql = """
        SELECT 
            c.id AS cart_id, 
            c.user_id,
            c.product_id,
            c.number ,
            p.product_name,
            p.product_author,
            p.product_quantity,
            p.product_price,
            p.product_image,
            p.product_describe,
            p.category_id
        FROM cart c
        JOIN product p ON c.product_id = p.product_id
        WHERE c.user_id = ?
    """;

        return jdbcTemplate.query(sql, new Object[]{userId}, (rs, rowNum) -> {
            CartEntity cartEntity = new CartEntity();
            cartEntity.setId(rs.getInt("cart_id")); // Lấy id giỏ hàng
            cartEntity.setUserId(rs.getInt("user_id"));
            cartEntity.setProductId(rs.getString("product_id"));
            cartEntity.setNumber(rs.getInt("number"));

            ProductEntity productEntity = new ProductEntity();
            productEntity.setProductName(rs.getString("product_name"));
            productEntity.setProductAuthor(rs.getString("product_author"));
            productEntity.setProductQuantity(rs.getInt("product_quantity"));
            productEntity.setProductPrice(rs.getDouble("product_price"));
            productEntity.setProductImage(rs.getString("product_image"));
            productEntity.setProductDescribe(rs.getString("product_describe"));
            productEntity.setCategoryId(rs.getInt("category_id"));

            cartEntity.setProductEntity(productEntity);

            return cartEntity;
        });
    }

    @Override
    public List<CartEntity> getProductInCart(int userId) {
        return List.of();
    }
}

