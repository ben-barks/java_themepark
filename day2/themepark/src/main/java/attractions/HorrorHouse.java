package attractions;

import visitors.Visitor;

public class HorrorHouse extends Attraction{

    public HorrorHouse(String name) {
        super(name);
    }

    @Override
    public int getRating() {
        return 4;
    }
    @Override
    public double defaultPrice() {
        return 2.50;
    }

    @Override
    public double priceFor(Visitor visitor) {
        if (visitor.age < 18){
            return 1.25;
        }
        else{ return 3.25;}
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.age < 18) {
            return false;
        }
        else {return true;}
    }

}
