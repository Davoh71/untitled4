package homework.adPortal;

public interface Command {
    //main comands
    int EXIT = 0;
    int LOGIN = 1;
    int REGISTR = 2;
    int MAIN_PRIN_ALL_ADS = 3;
    //user comands
    int LOGAUT = 0;
    int ADD = 1;
    int PRINT_ALL_ADS = 2;
    int PRINT_ALL_MY_ADS = 3;
    int PRINT_ALL_MY_CATEGORY = 4;
    int DELET_MY_ALL_ADS = 5;
    int DELET_MY_ALL_BY_TITL = 6;

    static void printMainComands(){
        System.out.println("Please input " +EXIT + " for Exit");
        System.out.println("Please input " +LOGIN + " for Login");
        System.out.println("Please input " +REGISTR + " for Register");
        System.out.println("Please input " +MAIN_PRIN_ALL_ADS + " for PRIN_ALL_ADS");
    }
    static void printUsersComands(){
        System.out.println("Please input " +LOGAUT+ "for Logaut");
        System.out.println("Please input " +ADD+ "for ADD");
        System.out.println("Please input " +PRINT_ALL_ADS+ "for PRINT_ALL_ADS");
        System.out.println("Please input " +PRINT_ALL_MY_ADS+ "for PRINT_ALL_MY_ADS");
        System.out.println("Please input " +PRINT_ALL_MY_CATEGORY+ "for PRINT_ALL_MY_CATEGORY");
        System.out.println("Please input " +DELET_MY_ALL_ADS+ "for DELET_MY_ALL_ADS");
        System.out.println("Please input " +DELET_MY_ALL_BY_TITL+ "for DELET_MY_ALL_BY_TITL");
    }
}
