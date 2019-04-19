package usecase;

/**
 * ユーザ作成リクエスト.
 */
public class UserCreateRequest {
    private String userName;

    public UserCreateRequest(String userName){
        this.userName = userName;
    }

    public String getUserName() {
        return this.userName;
    }
}
