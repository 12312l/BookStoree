package bookstore.example.bookstore.repository.entity;

import java.sql.Date;

public class BillDetailEntity {
    private int id;
    private String productId;
    private int quantity;
    private double total;
    private Date doe;

    public BillDetailEntity() {
    }

    public int getId() {
        return id;
    }

    public String getProductId() {
        return productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getTotal() {
        return total;
    }

    public Date getDoe() {
        return doe;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void setDoe(Date doe) {
        this.doe = doe;
    }
}
