package bookstore.example.bookstore.model;

public class ProductDTO {
    private String productId;
    private String productName;
    private String productAuthor;
    private int productQuantity;
    private double productPrice;
    private String productImage;
    private String productDescribe;
    private int categoryId;

    // Constructor không tham số
    public ProductDTO() {
    }

    // Constructor đầy đủ tham số
    public ProductDTO(String productId, String productName, String productAuthor, int productQuantity,
                         double productPrice, String productImage, String productDescribe, int categoryId) {
        this.productId = productId;
        this.productName = productName;
        this.productAuthor = productAuthor;
        this.productQuantity = productQuantity;
        this.productPrice = productPrice;
        this.productImage = productImage;
        this.productDescribe = productDescribe;
        this.categoryId = categoryId;
    }

    // Getter và Setter cho tất cả các thuộc tính
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductAuthor() {
        return productAuthor;
    }

    public void setProductAuthor(String productAuthor) {
        this.productAuthor = productAuthor;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductImage() {
        return productImage;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }

    public String getProductDescribe() {
        return productDescribe;
    }

    public void setProductDescribe(String productDescribe) {
        this.productDescribe = productDescribe;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }
}
