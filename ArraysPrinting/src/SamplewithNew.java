public class SamplewithNew {
    public static void main(String[] args) {
        byte[] arr=new byte[3];
        arr[0]=10;
        arr[1]=20;
        arr[3]=30;
        System.out.println("----------------------------------");
        System.out.println("It is the byte type of data with new Keyword");
        System.out.println("*****************************");
        System.out.println("index \t array");
        System.out.println("*****************************");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(i+"\t"+arr[i]);
        }
    }
}
