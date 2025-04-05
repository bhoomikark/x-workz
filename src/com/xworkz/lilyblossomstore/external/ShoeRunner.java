package com.xworkz.lilyblossomstore.external;
import com.xworkz.lilyblossomstore.internal.shoe.Shoe;
import com.xworkz.lilyblossomstore.internal.shoe.Sneakers;
public class ShoeRunner {
    public static void main(String[] args) {
       {
           System.out.println("Parent reference - Parent object");
           Shoe shoe1 = new Shoe();
           shoe1.wear();
           shoe1.remove();
           shoe1.clean();
           shoe1.polish();
           shoe1.repair();

           Shoe shoe = new Sneakers();
            shoe.wear();
            shoe.remove();
            shoe.clean();
            shoe.polish();
            shoe.repair();

            System.out.println("-----------");

            Sneakers sneakers = new Sneakers();
            sneakers.wear();
            sneakers.remove();
            sneakers.clean();
            sneakers.polish();
            sneakers.repair();
        }
    }
}
