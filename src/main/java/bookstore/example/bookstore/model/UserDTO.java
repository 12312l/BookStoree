package bookstore.example.bookstore.model;

import java.util.Date;

public class UserDTO {
    private String fullname;
    private String username;
    private String password;
    private String email;
    private String phone;
    private String address;
    private String gender;
    private Date dob;
    private String role;

    public UserDTO(String fullname, String username, String password, String email, String phone, String address, String gender, Date dob) {
        this.fullname = fullname;
        this.username = username;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.gender = gender;
        this.dob = dob;
    }

    public UserDTO() {

    }

    public String getFullname() {
        return fullname;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public String getGender() {
        return gender;
    }

    public java.sql.Date getDob() {
        return dob != null ? new java.sql.Date(dob.getTime()) : null; // Chuyển từ java.util.Date sang java.sql.Date
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
