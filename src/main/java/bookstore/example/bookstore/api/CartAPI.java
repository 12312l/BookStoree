package bookstore.example.bookstore.api;

import bookstore.example.bookstore.model.CartDTO;
import bookstore.example.bookstore.service.CartService;
import bookstore.example.bookstore.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CartAPI {
    @Autowired
    private CartService cartService;

    @GetMapping(value = "/api/cart/displayCart")
    public List<CartDTO> displayCart(@RequestParam("userId") int userId){
        List<CartDTO> result = cartService.findCartIDByUserID(userId);
        return result;
    }
}
