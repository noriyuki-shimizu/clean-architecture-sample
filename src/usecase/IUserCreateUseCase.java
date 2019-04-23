package usecase;

import domain.dto.UserCreateInputData;

public interface IUserCreateUseCase {
    public void handle(UserCreateInputData inputData);
}
