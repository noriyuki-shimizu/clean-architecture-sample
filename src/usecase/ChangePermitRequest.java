package usecase;

/**
 * DTO (Data Transfer Object) 
 */
public class ChangePermitRequest {

    private String userId;

    private Object role;

    public ChangePermitRequest(String userId, Object role) {
        this.userId = userId;
        this.role = role;
    }

    public String getUserId() {
        return userId;
    }

    public Object getRole() {
        return role;
    }

}
