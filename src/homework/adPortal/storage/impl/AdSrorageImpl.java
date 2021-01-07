package homework.adPortal.storage.impl;

import homework.adPortal.model.Ad;
import homework.adPortal.model.Category;
import homework.adPortal.model.User;
import homework.adPortal.storage.AdStorage;

import java.util.LinkedList;
import java.util.List;

public class AdSrorageImpl implements AdStorage {

    private List <Ad> adList = new LinkedList<>();

    @Override
    public void add(Ad ad) {
        adList.add(ad);
    }

    @Override
    public void printMyAd(User user) {
        System.out.println(adList);
    }

    @Override
    public void printAllAd() {
        for (Ad ad : adList) {
            if (ad.getUser().equals(ad)){
                System.out.println(ad);
            }
        }

    }

    @Override
    public void printByCategory(Category category) {
        for (Ad ad : adList) {
            if (ad.getCategory() == category){
                System.out.println(ad);
            }
        }
    }

    @Override
    public void deletMyAds(User user) {

        for (Ad ad : adList) {
            if (ad.getUser().equals(user)){
                adList.remove(ad);
            }
        }
    }

    @Override
    public void deletAdByTitle(String title, User carenUser) {
        for (Ad ad : adList) {
            if (ad.getTitle().equals(title) && ad.getUser().equals(carenUser)){
                adList.remove(ad);
            }
        }
    }
}
