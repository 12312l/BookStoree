package bookstore.example.bookstore.repository;

import bookstore.example.bookstore.repository.entity.CartEntity;

import java.util.List;

public interface CartDetailRepository {
    List<CartEntity> getProductInCart(int userId);
}
