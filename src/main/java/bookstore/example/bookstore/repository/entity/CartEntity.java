package bookstore.example.bookstore.repository.entity;

public class CartEntity {
    private int id;
    private int userId;
    private String productId;
    private int number;
    private ProductEntity productEntity;
    public CartEntity() {
    }

    public CartEntity(int id, int userId, String productId, int number) {
        this.id = id;
        this.userId = userId;
        this.productId = productId;
        this.number = number;
    }

    public int getId() {
        return id;
    }

    public int getUserId() {
        return userId;
    }

    public String getProductId() {
        return productId;
    }

    public int getNumber() {
        return number;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public ProductEntity getProductEntity() {
        return productEntity;
    }

    public void setProductEntity(ProductEntity productEntity) {
        this.productEntity = productEntity;
    }
}
