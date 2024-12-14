package bookstore.example.bookstore.api;

import bookstore.example.bookstore.model.UserDTO;
import bookstore.example.bookstore.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
public class UserAPI {

@Autowired
private UserService userService;

    @PostMapping(value = "/api/user/login")
    public List<UserDTO> getUser(@RequestBody UserDTO userDTO) {
        List<UserDTO> result = userService.findAll(userDTO.getUsername(), userDTO.getPassword());
        return result;
    }

    @PostMapping(value = "/api/user/register")
    public String register(@RequestBody UserDTO userDTO) {
        try {
            userService.register(userDTO);
            return "Đăng ký thành công!";
        } catch (Exception e) {
            return "Đăng ký thất bại: " + e.getMessage();
        }
    }
}
