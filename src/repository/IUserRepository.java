package repository;

import Entity.User;

public interface IUserRepository {
    public User findByUserName(String userId);
    public void save(User user);
}
