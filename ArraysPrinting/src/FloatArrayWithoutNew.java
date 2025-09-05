public class FloatArrayWithoutNew {
    public static void main(String[] args) {
        float[] arr = {10.5f, 20.5f, 30.5f};

        System.out.println("----------------------------------");
        System.out.println("It is the float type of data without new Keyword");
        System.out.println("*****************************");
        System.out.println("index \t array");
        System.out.println("*****************************");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + "\t" + arr[i]);
        }
    }
}