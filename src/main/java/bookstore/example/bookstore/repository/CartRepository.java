package bookstore.example.bookstore.repository;

import bookstore.example.bookstore.repository.entity.CartEntity;

import java.util.List;

public interface CartRepository {
    List<CartEntity> findCartIDByUserID(int userId);

    List<CartEntity> getProductInCart(int userId);
}
