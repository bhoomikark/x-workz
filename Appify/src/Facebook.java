public class Facebook {
    static void signUp() {
        System.out.println("Signing up");
    }
    static void login() {
        System.out.println("Logging In");
    }
    static void homePage() {
        System.out.println("WELCOME TO HOME PAGE");
    }
    static void logout() {
        System.out.println("Logging Out!!");
    }

    public static void main(String[] args) {
        System.out.println("********* Facebook Flow *********");
        signUp();
        login();
        homePage();
        logout();
        System.out.println("*********************************");
    }
}
