// Class 1: Laptop
class Laptop {
    static void brand() { System.out.println("Dell Laptop"); }
    static void processor() { System.out.println("Intel i5 Processor"); }
    static void ram() { System.out.println("8GB RAM"); }
    static void storage() { System.out.println("512GB SSD"); }
    static void battery() { System.out.println("6-hour Battery"); }
}

// Class 2: Lollipop
class Lollipop {
    static void taste() { System.out.println("Mango Lollipop"); }
    static void color() { System.out.println("Yellow Color"); }
    static void shape() { System.out.println("Round Shape"); }
    static void size() { System.out.println("Small Size"); }
    static void price() { System.out.println("5 Rupees"); }

    static void useLaptop() {
        System.out.println("\nUsing laptop while eating a lollipop:");
        Laptop.brand();
        Laptop.processor();
        Laptop.ram();
        Laptop.storage();
        Laptop.battery();
    }
}

// Class 3: MNCCompany
class MNCCompany {
    static void name() { System.out.println("Google Company"); }
    static void employees() { System.out.println("150,000 Employees"); }
    static void revenue() { System.out.println("Huge Revenue"); }
    static void ceo() { System.out.println("Sundar Pichai is CEO"); }
    static void location() { System.out.println("Offices Worldwide"); }

    static void useLaptop() {
        System.out.println("\nEmployees use laptops for work:");
        Laptop.brand();
        Laptop.processor();
        Laptop.ram();
        Laptop.storage();
        Laptop.battery();
    }
}

// Class 4: ICC
class ICC {
    static void event() { System.out.println("Cricket World Cup"); }
    static void ranking() { System.out.println("International Team Ranking"); }
    static void umpires() { System.out.println("Appoints Umpires"); }
    static void rules() { System.out.println("Makes Cricket Rules"); }

    static void workWithMNC() {
        System.out.println("\nICC works with MNCs for sponsorships:");
        MNCCompany.name();
        MNCCompany.employees();
        MNCCompany.revenue();
        MNCCompany.ceo();
        MNCCompany.location();
    }
}

// Class 5: RCB
class RCB {
    static void team() { System.out.println("Royal Challengers Bangalore"); }
    static void captain() { System.out.println("Faf du Plessis"); }
    static void player() { System.out.println("Virat Kohli - Star Player"); }
    static void stadium() { System.out.println("Chinnaswamy Stadium"); }
    static void fans() { System.out.println("Millions of Fans"); }
}

// Class 6: IplCup
class IplCup {
    static void teams() { System.out.println("10 IPL Teams"); }
    static void trophy() { System.out.println("IPL Winner Trophy"); }
    static void sponsors() { System.out.println("Big Sponsors"); }
    static void format() { System.out.println("T20 Cricket"); }

    static void playRCB() {
        System.out.println("\nRCB plays in IPL:");
        RCB.team();
        RCB.captain();
        RCB.player();
        RCB.stadium();
        RCB.fans();
    }
}

// Class 7: Globe
class Globe {
    static void continents() { System.out.println("7 Continents"); }
    static void oceans() { System.out.println("5 Oceans"); }
    static void equator() { System.out.println("Equator Divides Earth"); }
    static void countries() { System.out.println("195 Countries"); }
}

// Class 8: Supra
class Supra {
    static void model() { System.out.println("Toyota Supra"); }
    static void engine() { System.out.println("Turbo Engine"); }
    static void speed() { System.out.println("250 km/h Speed"); }
    static void price() { System.out.println("$50,000 Price"); }

    static void knownWorldwide() {
        System.out.println("\nSupra is famous worldwide:");
        Globe.continents();
        Globe.oceans();
        Globe.equator();
        Globe.countries();
    }
}

// Class 9: Icecream
class Icecream {
    static void flavor() { System.out.println("Chocolate Flavor"); }
    static void price() { System.out.println("$3 Price"); }
    static void brand() { System.out.println("Amul Brand"); }
}

// Class 10: Atom
class Atom {
    static void electrons() { System.out.println("Electrons in Atom"); }
    static void protons() { System.out.println("Protons in Atom"); }
    static void neutrons() { System.out.println("Neutrons in Atom"); }

    static void inEverything() {
        System.out.println("\nAtoms are in everything, even ice cream:");
        Icecream.flavor();
        Icecream.price();
        Icecream.brand();
    }
}

// Main Class
public class CallingMethods {
    public static void main(String[] args) {
        System.out.println("\n### Lollipop using Laptop ###");
        Lollipop.useLaptop();

        System.out.println("\n### MNC using Laptop ###");
        MNCCompany.useLaptop();

        System.out.println("\n### ICC working with MNC ###");
        ICC.workWithMNC();

        System.out.println("\n### IPL featuring RCB ###");
        IplCup.playRCB();

        System.out.println("\n### Supra famous worldwide ###");
        Supra.knownWorldwide();

        System.out.println("\n### Atom present in Ice Cream ###");
        Atom.inEverything();
		
    }
}
