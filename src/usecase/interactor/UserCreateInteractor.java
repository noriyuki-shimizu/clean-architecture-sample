package usecase.interactor;

import domain.dto.UserCreateInputData;
import domain.dto.UserCreateOutputData;
import domain.entity.User;
import domain.repository.IUserRepository;
import presenter.IUserCreatePresenter;
import usecase.IUserCreateUseCase;

import java.util.Date;

public class UserCreateInteractor implements IUserCreateUseCase {

    private IUserRepository userRepository;
    private IUserCreatePresenter presenter;

    public UserCreateInteractor(IUserRepository userRepository, IUserCreatePresenter presenter) {
        this.userRepository = userRepository;
        this.presenter = presenter;
    }

    public void handle(UserCreateInputData inputData) {
        String userName = inputData.getUserName();
        User deplicateUser = userRepository.findByUserName(userName);

        if (deplicateUser != null) {
            throw new RuntimeException("duplicated");
        }

        User user = new User(userName);
        userRepository.save(user);

        UserCreateOutputData outputData = new UserCreateOutputData(user.getId(), new Date());
        presenter.complete(outputData);

    }
}
