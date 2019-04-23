package presenter;

import domain.dto.UserCreateOutputData;

public interface IUserCreatePresenter {
    public void complete(UserCreateOutputData outputData);
}
