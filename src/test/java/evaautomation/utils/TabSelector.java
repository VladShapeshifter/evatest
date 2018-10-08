package evaautomation.utils;

public class TabSelector {
    private static int currentTab;
    private static int accountsQty;
    private static boolean isItLastAccount;
    private static boolean isItPrevAccount;

    public static void setCurrentTab(int currentTab) {
        TabSelector.currentTab = currentTab;
    }

    public static void setAccountsQty(int accountsQty) {
        TabSelector.accountsQty = accountsQty;
    }

    public static int getCurrentTab() {
        return currentTab;
    }

    public static int getAccountsQty() {
        return accountsQty;
    }

    public static boolean isItLastAccount() {
        if (currentTab < accountsQty) {
            isItLastAccount = false;
        } else {
            isItLastAccount = true;
        }
        return isItLastAccount;
    }

    public static boolean isItPrevAccount() {
        if (currentTab == accountsQty - 1) {
            isItPrevAccount = true;
        }
        return isItPrevAccount;
    }
}
