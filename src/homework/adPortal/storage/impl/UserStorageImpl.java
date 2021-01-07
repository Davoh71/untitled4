package homework.adPortal.storage.impl;

import homework.adPortal.model.User;
import homework.adPortal.storage.UserStorage;

import java.util.HashMap;
import java.util.Map;

public class UserStorageImpl implements UserStorage {

    private Map<String , User> userMap = new HashMap<>();

    @Override
    public void add(User user) {

    }

    @Override
    public User getByPhone(String phone) {
        return userMap.get(phone);
    }

}
