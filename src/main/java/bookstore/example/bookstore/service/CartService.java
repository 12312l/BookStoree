package bookstore.example.bookstore.service;

import bookstore.example.bookstore.model.CartDTO;
import bookstore.example.bookstore.repository.entity.CartEntity;

import java.util.List;

public interface CartService {
    List<CartDTO> findCartIDByUserID(int userId);

}
