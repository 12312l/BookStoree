package bookstore.example.bookstore.service.impl;

import bookstore.example.bookstore.model.UserDTO;
import bookstore.example.bookstore.repository.entity.UserEntity;
import bookstore.example.bookstore.repository.UserRepository;
import bookstore.example.bookstore.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public void register(UserDTO userDTO) {
        if (userRepository.existsByUsername(userDTO.getUsername())) {
            throw new IllegalArgumentException("Username đã tồn tại!");
        }

        UserEntity userEntity = new UserEntity();
        userEntity.setFullname(userDTO.getFullname());
        userEntity.setUsername(userDTO.getUsername());
        userEntity.setPassword(userDTO.getPassword());
        userEntity.setEmail(userDTO.getEmail());
        userEntity.setPhone(userDTO.getPhone());
        userEntity.setAddress(userDTO.getAddress());
        userEntity.setGender(userDTO.getGender());
        userEntity.setDob(userDTO.getDob());

        userRepository.save(userEntity);
    }

    @Autowired
    private UserRepository userRepository;


    @Override
    public List<UserDTO> findAll(String username, String password) {
        List<UserEntity> userEntities =userRepository.findAll(username, password);
        List<UserDTO> result = new ArrayList<UserDTO>();
        for(UserEntity item : userEntities){
            UserDTO userDTO = new UserDTO();
            userDTO.setFullname(item.getFullname());
            userDTO.setUsername(item.getUsername());
            userDTO.setPassword(item.getPassword());
            userDTO.setEmail(item.getEmail());
            userDTO.setPhone(item.getPhone());
            userDTO.setAddress(item.getAddress());
            userDTO.setGender(item.getGender());
            userDTO.setDob(item.getDob());
            result.add(userDTO);
            if (item.getAccount() != null) {
                userDTO.setRole(item.getAccount().getRole());
            }

        }
        return result;
    }
}
