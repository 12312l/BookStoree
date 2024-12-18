package bookstore.example.bookstore.repository.entity;

public class ProductEntity {
    private String productId;
    private String productName;
    private String productAuthor;
    private int productQuantity;
    private double productPrice;
    private String productImage;
    private String productDescribe;
    private int categoryId;

    // Constructor không tham số
    public ProductEntity() {
    }

    // Constructor đầy đủ tham số
    public ProductEntity(String productId, String productName, String productAuthor, int productQuantity,
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

    public ProductEntity(int categoryId, String productDescribe, String productImage, double productPrice, int productQuantity, String productAuthor, String productName, String productId) {
        this.categoryId = categoryId;
        this.productDescribe = productDescribe;
        this.productImage = productImage;
        this.productPrice = productPrice;
        this.productQuantity = productQuantity;
        this.productAuthor = productAuthor;
        this.productName = productName;
        this.productId = productId;
    }

    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductAuthor() {
        return productAuthor;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public String getProductImage() {
        return productImage;
    }

    public String getProductDescribe() {
        return productDescribe;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductAuthor(String productAuthor) {
        this.productAuthor = productAuthor;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }

    public void setProductDescribe(String productDescribe) {
        this.productDescribe = productDescribe;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }
}
