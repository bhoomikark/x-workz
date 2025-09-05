public class FloatArrayWithNew {
    public static void main(String[] args) {
        float[] arr = new float[3];
        arr[0] = 10.5f;
        arr[1] = 20.5f;
        arr[2] = 30.5f;

        System.out.println("----------------------------------");
        System.out.println("It is the float type of data with new Keyword");
        System.out.println("*****************************");
        System.out.println("index \t array");
        System.out.println("*****************************");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + "\t" + arr[i]);
        }
    }
}
