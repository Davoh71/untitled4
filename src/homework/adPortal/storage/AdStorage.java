package homework.adPortal.storage;

import homework.adPortal.model.Ad;
import homework.adPortal.model.Category;
import homework.adPortal.model.User;

public interface AdStorage {

    void add(Ad ad);

    void printMyAd(User user);

    void printAllAd();

    void printByCategory(Category category);

    void deletMyAds(User user);

    void deletAdByTitle(String title, User carenUser);

}
