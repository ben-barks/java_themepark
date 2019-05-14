package stalls;

import stalls.AlcoholStall;
import visitors.Visitor;

public class AlcoholStall extends Stall {
    private String name;
    private String ownerName;
    private String parkingSpot;

    public AlcoholStall(String name, String ownerName, String parkingSpot) {
        super(name, ownerName, parkingSpot);
    }

    @Override
    public int getRating() {
        return 5;
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.age < 18) {
            return false;
        }
        else {return true;}
    }
}
