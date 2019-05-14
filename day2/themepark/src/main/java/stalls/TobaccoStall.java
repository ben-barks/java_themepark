package stalls;

import visitors.Visitor;

public class TobaccoStall extends Stall{
    public TobaccoStall(String name, String ownerName, String parkingSpot) {
        super(name, ownerName, parkingSpot);
    }

    @Override
    public int getRating() {
        return 2;
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        if(visitor.age < 18) {
            return false;
        }
        else {return true;}
    }
}
