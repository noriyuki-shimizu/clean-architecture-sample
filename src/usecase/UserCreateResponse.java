package usecase;

/**
 * ユーザ作成レスポンス
 */
public class UserCreateResponse {
    private String userId;

    public UserCreateResponse(String userId) {
        this.userId = userId;
    }

    public String getUserId() {
        return userId;
    }

}
