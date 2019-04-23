package domain.repository.impl;

import domain.entity.User;
import domain.repository.IUserRepository;

public class UserRepository implements IUserRepository {

    private static int index = 0;

    @Override
    public User findByUserName(String userName) {
        // DB処理...
        index ++;
        User user = new User(index, userName);

        return user;
    }

    @Override
    public void save(User user) {
        System.out.println("セーブしました。");
    }
}
