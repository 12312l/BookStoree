package bookstore.example.bookstore.repository.entity;

import java.sql.Date;

public class BillEntity {
    private int id;
    private int userId;
    private int quantity;
    private double total;
    private String methodPay;
    private Date doe; // Date of Entry (ngày lập hóa đơn)


    public BillEntity() {

    }

    public int getId() {
        return id;
    }

    public int getUserId() {
        return userId;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getTotal() {
        return total;
    }

    public String getMethodPay() {
        return methodPay;
    }

    public Date getDoe() {
        return doe;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void setMethodPay(String methodPay) {
        this.methodPay = methodPay;
    }

    public void setDoe(Date doe) {
        this.doe = doe;
    }
}
