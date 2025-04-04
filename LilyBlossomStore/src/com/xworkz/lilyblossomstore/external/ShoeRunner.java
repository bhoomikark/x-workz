package com.xworkz.lilyblossomstore.external;
import com.xworkz.lilyblossomstore.internal.shoe.Shoe;
import com.xworkz.lilyblossomstore.internal.shoe.Sneakers;
public class ShoeRunner {
    public static void main(String[] args) {
       {
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
