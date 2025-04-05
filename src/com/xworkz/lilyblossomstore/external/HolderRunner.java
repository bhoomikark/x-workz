package com.xworkz.lilyblossomstore.external;

import com.xworkz.lilyblossomstore.internal.holder.Holder;
import com.xworkz.lilyblossomstore.internal.holder.PenHolder;

public class HolderRunner {
    public static void main(String[] args) {
        System.out.println("Parent reference - Parent object");
        Holder holder1 = new Holder();
        holder1.hold();
        holder1.remove();
        holder1.clean();
        holder1.store();
        holder1.organize();

        Holder holder = new PenHolder();
        holder.hold();
        holder.remove();
        holder.clean();
        holder.store();
        holder.organize();

        System.out.println("-----------");

        PenHolder penHolder = new PenHolder();
        penHolder.hold();
        penHolder.remove();
        penHolder.clean();
        penHolder.store();
        penHolder.organize();
    }
}
