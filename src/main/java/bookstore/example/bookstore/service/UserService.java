package bookstore.example.bookstore.service;

import bookstore.example.bookstore.model.UserDTO;

import java.util.List;

public interface UserService {
    List<UserDTO> findAll(String username, String password);

    void register(UserDTO userDTO);
}
