package homework.adPortal;

import homework.adPortal.model.Ad;
import homework.adPortal.model.Category;
import homework.adPortal.model.Gender;
import homework.adPortal.model.User;
import homework.adPortal.storage.impl.AdSrorageImpl;
import homework.adPortal.storage.impl.UserStorageImpl;

import java.util.Date;
import java.util.Scanner;

public class AdPortalTest implements Command {
    private static Scanner scanner = new Scanner(System.in);
    private static AdSrorageImpl adSrorage = new AdSrorageImpl();
    private static UserStorageImpl userStorage = new UserStorageImpl();
    private static User carenUser = null;

    public static void main(String[] args) {
        boolean isRun = true;
        while (isRun) {
            Command.printMainComands();
            int comands;
            try {
                comands = Integer.parseInt(scanner.nextLine());

            } catch (NumberFormatException e) {
                comands = -1;
            }
            switch (comands) {
                case EXIT:
                    isRun = false;
                    break;
                case LOGIN:
                    login();
                    break;
                case REGISTR:
                    register();
                    break;
                case MAIN_PRIN_ALL_ADS:
                    adSrorage.printAllAd();
                    break;
                default:
                    System.out.println("Invalid commad please try adine!");
            }
        }
    }


    private static void login() {
        System.out.println("Please input poneNumbr,pasword");
        String userCred = scanner.nextLine();
        String[] userData = userCred.split(",");
        User user = userStorage.getByPhone(userData[0]);
        if (user == null) {
            System.out.println("User does not exists");
        } else {
            if (user.getPasword().equals(userData[1])) {
                System.out.println("Welcome" + user.getName() + "!");
                carenUser = user;
                userLogin();
            } else {
                System.out.println("Padsword is inccorect");
            }
        }
    }


    private static void register() {
        System.out.println("Please input name,surname,gender,age,phoneNumbr,pasword");
        String userData = scanner.nextLine();
        String[] userDataArray = userData.split(",");
        try {
            User user = new User(userDataArray[0], userDataArray[1],Gender.valueOf(userDataArray[2]),
                    Integer.parseInt(userDataArray[3]), userDataArray[4], userDataArray[5]);
            userStorage.add(user);
            System.out.println("Register was success ! ");
        } catch (IndexOutOfBoundsException e) {
            System.out.println(" Error ");
        }
    }

    private static void userLogin() {
        boolean isRun = true;
        while (isRun) {
            Command.printUsersComands();
            int comand;
            try {
                comand = Integer.parseInt(scanner.nextLine());

            } catch (NumberFormatException e) {
                comand = -1;
            }
            switch (comand) {
                case LOGAUT:
                    carenUser = null;
                    isRun = false;
                    break;
                case ADD:
                    addAd();
                    break;
                case PRINT_ALL_ADS:
                    adSrorage.printAllAd();
                case PRINT_ALL_MY_ADS:
                    adSrorage.deletMyAds(carenUser);
                    break;
                case PRINT_ALL_MY_CATEGORY:
                    printAdsByCategory();
                    break;
                case DELET_MY_ALL_ADS:
                    adSrorage.deletMyAds(carenUser);
                    break;
                case DELET_MY_ALL_BY_TITL:
                    deletMyAllByTitl();
                    break;
                default:
                    System.out.println("Invalid commad please try adine!");
            }
        }
    }

    private static void deletMyAllByTitl() {
        System.out.println("Please select your ad titl");
        adSrorage.printMyAd(carenUser);
        String titl = scanner.nextLine();
        adSrorage.deletAdByTitle(titl, carenUser);
    }

    private static void printAdsByCategory() {
        System.out.println("Here is categoryList");
        for (Category valu : Category.values()) {
            System.out.println(valu);
        }
        String catDat = scanner.nextLine();
        adSrorage.printByCategory(Category.valueOf(catDat));

    }

    private static void addAd() {
        System.out.println("Please input Title,Text,Prce,Category");
        System.out.println("Here is categoryList");
        for (Category valu : Category.values()) {
            System.out.println(valu);
        }
        String adData = scanner.nextLine();
        String[] adDataArrat = adData.split(",");
        Ad ad = new Ad(adDataArrat[0], adDataArrat[1], Double.parseDouble(adDataArrat[2]),
                new Date(), Category.valueOf(adDataArrat[3]), carenUser);
        adSrorage.add(ad);
        System.out.println("Ad was addad ! ");

    }

}
