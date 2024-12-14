package bookstore.example.bookstore.service.impl;

import bookstore.example.bookstore.model.CartDTO;
import bookstore.example.bookstore.repository.CartRepository;
import bookstore.example.bookstore.repository.entity.CartEntity;
import bookstore.example.bookstore.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CartServiceImpl implements CartService {
    @Autowired
    private CartRepository cartRepository;

    @Override
    public List<CartDTO> findCartIDByUserID(int userId) {
        List<CartEntity> cartEntities = cartRepository.findCartIDByUserID(userId);
        List<CartDTO> result = new ArrayList<>();
        for(CartEntity item : cartEntities){
            CartDTO cartDTO = new CartDTO();
            cartDTO.setUserId(item.getUserId());
            cartDTO.setId(item.getId());
            cartDTO.setProductId(item.getProductId());
            cartDTO.setNumber(item.getNumber());
//            cartDTO.setProductTotalPrice(item.getNumber()* cartDTO.getProductPrice());
//            result.add(cartDTO);
            if(item.getProductEntity() !=null){
                cartDTO.setProductName(item.getProductEntity().getProductName());
                cartDTO.setProductAuthor(item.getProductEntity().getProductAuthor());
                cartDTO.setProductQuantity(item.getProductEntity().getProductQuantity());
                cartDTO.setProductPrice(item.getProductEntity().getProductPrice());
                cartDTO.setProductImage(item.getProductEntity().getProductImage());
                cartDTO.setProductDescribe(item.getProductEntity().getProductDescribe());
                cartDTO.setCategoryId(item.getProductEntity().getCategoryId());
            }
            cartDTO.setProductTotalPrice(item.getNumber()* cartDTO.getProductPrice());
            result.add(cartDTO);
        }
        return  result;
    }

}
