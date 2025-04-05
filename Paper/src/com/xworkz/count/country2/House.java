package com.xworkz.count.country2;

public class House {
    String owner;
    String location;
    Room[] rooms;

    House(String owner, String location, Room[] rooms) {
        this.owner = owner;
        this.location = location;
        this.rooms = rooms;
    }

    void display() {
        System.out.println("House: Owner=" + owner + ", Location=" + location);
        for (Room room : rooms) {
            room.display();
        }
    }
}
