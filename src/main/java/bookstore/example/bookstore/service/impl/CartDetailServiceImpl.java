package bookstore.example.bookstore.service.impl;

import bookstore.example.bookstore.repository.CartDetailRepository;
import bookstore.example.bookstore.repository.entity.CartEntity;

import java.util.List;

public class CartDetailServiceImpl implements CartDetailRepository {
    @Override
    public List<CartEntity> getProductInCart(int userId) {
        return List.of();
    }
}
