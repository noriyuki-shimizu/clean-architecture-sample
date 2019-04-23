package controller;

import domain.dto.UserCreateInputData;
import usecase.IUserCreateUseCase;

public class UserController {
    private IUserCreateUseCase userCreateUseCase;

    public UserController(IUserCreateUseCase userCreateUseCase) {
        this.userCreateUseCase = userCreateUseCase;
    }

    public void CreateUser(String userName) {
        UserCreateInputData inputData = new UserCreateInputData(userName);
        userCreateUseCase.handle(inputData);
    }
}
