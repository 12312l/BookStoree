package bookstore.example.bookstore.model;

public class CartDTO {
    private int id;
    private int userId;
    private String productId;
    private int number;
    private String productName;
    private String productAuthor;
    private int productQuantity;
    private double productPrice;
    private String productImage;
    private String productDescribe;
    private int categoryId;
    private double productTotalPrice;
    public CartDTO() {
    }

    public CartDTO(int id, int userId, String productId, int number) {
        this.id = id;
        this.userId = userId;
        this.productId = productId;
        this.number = number;

    }

    public String getProductName() {
        return productName;
    }

    public double getProductTotalPrice() {
        return productTotalPrice;
    }

    public void setProductTotalPrice(double productTotalPrice) {
        this.productTotalPrice = productTotalPrice;
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

    public String getProductName(String productName) {
        return this.productName;
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
