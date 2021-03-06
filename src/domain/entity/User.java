package domain.entity;

public class User {
    private int id;
    private String userName;

    public User(int id, String userName) {
        this.id = id;
        this.userName = userName;
    }

    public User(String userName) {
        this.userName = userName;
    }

    public int getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }
}
