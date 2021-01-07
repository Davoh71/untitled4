package homework.adPortal.storage;

import homework.adPortal.model.User;

public interface UserStorage {

        void add(User user);

        User getByPhone(String phone);



}
