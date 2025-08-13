public class Amazon {
    static void signUp()
    {
        System.out.println("Signing up");
    }
    static void login()
    {
        System.out.println("Logging In");
    }
    static void homePage()
    {
        System.out.println("WELCOME TO HOME PAGE");
    }
    static void order()
    {
        System.out.println("Add items to cart");
    }
    static void logout()
    {
        System.out.println("Logging Out!!");
    }

    public static void main(String[] args) {
        System.out.println("********* Main Starts *********");
        signUp();
        login();
        homePage();
        order();
        logout();
        System.out.println("********* Main Ends *********");
    }



}
