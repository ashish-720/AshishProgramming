package learning.collectionsLL;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

class Room {
    private String roomName;
    private String roomType;
    private int roomCapacity;
    private double ratePerDay;

    public Room(String roomName, String roomType, int roomCapacity, double ratePerDay) {
        this.roomName = roomName;
        this.roomType = roomType;
        this.roomCapacity = roomCapacity;
        this.ratePerDay = ratePerDay;
    }

    public double getRate() {
        return ratePerDay;
    }
}


public class TajHotelRoom {
    public static void main(String[] args) {
        Room dining = new Room("Hyderabad", "DiningRoom", 100, 239.90);
        Room living = new Room("Himachal Pradesh", "LivingRoom", 20, 139.80);
        Room guest = new Room("Delhi", "GuestRoom", 40, 500.90);
        Room study = new Room("Odisha", "StudyRoom", 23, 100.90);
        Room playing = new Room("Karnatka", "PlayingRoom", 200, 50.00);
        Collection<Room> rooms = new ArrayList<Room>();
        rooms.add(dining);
        rooms.add(living);
        rooms.add(guest);
        rooms.add(study);
        rooms.add(playing);
        calculateCostOfStaying(rooms);
    }


    public static void calculateCostOfStaying(Collection<Room> rooms) {
        double costOfStaying = 0.0;
        for (Room eachRoom : rooms) {
            costOfStaying += eachRoom.getRate();
        }
        System.out.println("This total cost of living for available rooms in Hotel Taj for a day is : Rs " + costOfStaying);
    }
}

