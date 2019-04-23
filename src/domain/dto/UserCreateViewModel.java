package domain.dto;

public class UserCreateViewModel {

    private String userId;
    private String createdDate;

    public UserCreateViewModel(String userId, String createdDate) {
        this.userId = userId;
        this.createdDate = createdDate;
    }

    public String getUserId() {
        return userId;
    }

    public String getCreatedDate() {
        return createdDate;
    }
}
