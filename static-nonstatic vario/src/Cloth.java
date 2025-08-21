public class Cloth {
    static String cloth_size = "L";
    String cloth_colour;
    int cloth_cost;

    public static void main(String[] args) {
        Cloth cloth = new Cloth();
        cloth.cloth_colour = "Red";
        cloth.cloth_cost = 1500;

        System.out.println("***********************************************");
        System.out.println("The Cloth size is: " + cloth_size);
        System.out.println("The Cloth colour is: " + cloth.cloth_colour);
        System.out.println("The Cloth cost is: " + cloth.cloth_cost);
        System.out.println("***********************************************");
    }
}
