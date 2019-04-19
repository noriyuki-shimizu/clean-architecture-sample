package Entity;

public class User {
    private String userId;
    private String userName;

    public User(String userName) {
        this.userName = userName;
    }

    public String getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }
}
