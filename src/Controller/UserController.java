package Controller;

import usecase.IUserCreateUseCase;
import usecase.UserCreateRequest;
import usecase.UserCreateResponse;

public class UserController {

    private usecase.IUserCreateUseCase usecase;

    public UserController(IUserCreateUseCase usecase){
        this.usecase = usecase;
    }

    public String action(String param) {
        String userName = param;

        UserCreateRequest request = new UserCreateRequest(userName);
        UserCreateResponse response = usecase.Handle(request);

        String userId = response.getUserId();

        return userId;
    }
}
