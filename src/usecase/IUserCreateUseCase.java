package usecase;

public interface IUserCreateUseCase {
    public UserCreateResponse Handle(UserCreateRequest request);
}
