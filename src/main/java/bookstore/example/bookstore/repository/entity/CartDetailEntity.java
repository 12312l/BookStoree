package bookstore.example.bookstore.repository.entity;

public class CartDetailEntity {
    private int id; // Khóa chính
    private String productId; // Khóa ngoại tham chiếu tới bảng product
    private int number; // Số lượng sản phẩm trong giỏ hàng

    // Constructor không tham số
    public CartDetailEntity() {
    }

    // Constructor đầy đủ tham số
    public CartDetailEntity(int id, String productId, int number) {
        this.id = id;
        this.productId = productId;
        this.number = number;
    }

    // Getter và Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
