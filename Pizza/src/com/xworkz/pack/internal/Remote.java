package com.xworkz.pack.internal;

public class Remote {

        private String brand;
        private String type;
        private final Panel panel;  // Remote contains a Panel object

        // Constructor
        public Remote(String brand, String type, Panel panel) {
            this.brand = brand;
            this.type = type;
            this.panel = panel;
        }

        // Getter-Setter Method
        public String getBrand() {
            return brand;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public void showRemote() {
            System.out.println("Remote Details:");
            System.out.println("Brand: " + this.brand);
            System.out.println("Type: " + this.type);
            System.out.println("=========================");
            System.out.println("Connecting Panel with Remote:");
            this.panel.setMaterial("Glass");
            this.panel.showPanel();
        }
    }


