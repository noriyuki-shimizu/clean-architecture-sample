package domain.dto;

public class UserCreateInputData {
    private String userName;

    public UserCreateInputData(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }
}
