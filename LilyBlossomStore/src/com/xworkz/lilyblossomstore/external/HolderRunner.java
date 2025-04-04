package com.xworkz.lilyblossomstore.external;

import com.xworkz.lilyblossomstore.internal.holder.Holder;
import com.xworkz.lilyblossomstore.internal.holder.PenHolder;

public class HolderRunner {
    public static void main(String[] args) {
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
