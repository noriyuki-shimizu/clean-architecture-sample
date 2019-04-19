package repository;

import Entity.User;

public class UserRepository implements IUserRepository {
    @Override
    public User findByUserName(String userId) {
        // ユーザIDからユーザ名を取得する処理
        return null;
    }

    @Override
    public void save(User user) {
        // ユーザの登録処理
    }
}
