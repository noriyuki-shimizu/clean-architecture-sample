package domain.dto;

import java.util.Date;

public class UserCreateOutputData {
    private int userId;
    private Date created;

    public UserCreateOutputData(int userId, Date created) {
        this.userId = userId;
        this.created = created;
    }

    public int getUserId() {
        return userId;
    }

    public Date getCreated() {
        return created;
    }
}
