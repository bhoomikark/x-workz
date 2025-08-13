public class ZestMoney {
    static void signUp() {
        System.out.println("Signing up");
    }
    static void login() {
        System.out.println("Logging In");
    }
    static void homePage() {
        System.out.println("WELCOME TO HOME PAGE");
    }
    static void applyLoan() {
        System.out.println("Applying for a loan");
    }
    static void logout() {
        System.out.println("Logging Out!!");
    }

    public static void main(String[] args) {
        System.out.println("********* ZestMoney Flow *********");
        signUp();
        login();
        homePage();
        applyLoan();
        logout();
        System.out.println("**********************************");
    }
}