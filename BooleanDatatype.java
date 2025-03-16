// Boolean Data Type Class
class BooleanDatatype {
    public static void main(String[] args) {
        System.out.println("Boolean Data Type Before Reinitialization:");
        boolean isPass = true;
        boolean isRainy = false;
        boolean isMarried = false;
        boolean isLoggedIn = true;
        boolean hasLicense = false;

        System.out.println("Is Pass: " + isPass);
        System.out.println("Is Rainy: " + isRainy);
        System.out.println("Is Married: " + isMarried);
        System.out.println("Is Logged In: " + isLoggedIn);
        System.out.println("Has License: " + hasLicense);

        // Reinitialization
        isPass = false;
        isRainy = true;
        isMarried = true;
        isLoggedIn = false;
        hasLicense = true;

        System.out.println("\nBoolean Data Type After Reinitialization:");
        System.out.println("Is Pass: " + isPass);
        System.out.println("Is Rainy: " + isRainy);
        System.out.println("Is Married: " + isMarried);
        System.out.println("Is Logged In: " + isLoggedIn);
        System.out.println("Has License: " + hasLicense);
    }
}
