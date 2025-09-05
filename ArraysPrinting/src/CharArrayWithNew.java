public class CharArrayWithNew {
    public static void main(String[] args) {
        char[] arr = new char[3];
        arr[0] = 'A';
        arr[1] = 'B';
        arr[2] = 'C';

        System.out.println("----------------------------------");
        System.out.println("It is the char type of data with new Keyword");
        System.out.println("*****************************");
        System.out.println("index \t array");
        System.out.println("*****************************");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + "\t" + arr[i]);
        }
    }
}