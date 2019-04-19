package usecase.Interactor;

import Entity.User;
import repository.IUserRepository;
import usecase.IUserCreateUseCase;
import usecase.UserCreateRequest;
import usecase.UserCreateResponse;

public class UserCreateInteractor implements IUserCreateUseCase {

    private static IUserRepository userRepository;

    public UserCreateInteractor(IUserRepository userRepository){
        this.userRepository = userRepository;
    }

    public UserCreateResponse Handle(UserCreateRequest request){
        var username = request.getUserName();
        var duplicateUser = userRepository.findByUserName(username);
        if(duplicateUser != null){
            throw new NullPointerException("duplicated");
        }

        var user = new User(username);
        userRepository.save(user);

        return new UserCreateResponse(user.getUserId());
    }

}
