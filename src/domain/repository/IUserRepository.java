package domain.repository;

import domain.entity.User;

public interface IUserRepository {
    public User findByUserName(String userName);
    public void save(User user);
}
