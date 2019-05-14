package stalls;

import visitors.IReviewed;
import visitors.ISecurity;

public abstract class Stall implements ISecurity, IReviewed {
    private String name;
    private String ownerName;
    private String parkingSpot;

    public Stall(String name, String ownerName, String parkingSpot) {
        this.name = name;
        this.ownerName = ownerName;
        this.parkingSpot = parkingSpot;
    }

    public String getName() {
        return name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getParkingSpot() {
        return parkingSpot;
    }
}
