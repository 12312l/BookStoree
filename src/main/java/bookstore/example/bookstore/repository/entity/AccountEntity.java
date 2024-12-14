package bookstore.example.bookstore.repository.entity;

public class AccountEntity {
    private int id;       // ID của AccountEntity
    private String role;  // Vai trò người dùng (user, admin, etc.)
    private int userId;   // Khoá ngoại liên kết với bảng user
    private UserEntity user;  // Thêm thuộc tính user liên kết với UserEntity

    // Constructors, Getters và Setters
    public AccountEntity() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }
}
