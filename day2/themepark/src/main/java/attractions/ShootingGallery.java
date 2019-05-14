package attractions;

import visitors.Visitor;

public class ShootingGallery extends Attraction{

    public ShootingGallery(String name) {
        super(name);
    }

    @Override
    public double defaultPrice() {
        return 3.25;
    }

    @Override
    public double priceFor(Visitor visitor) {
        if(visitor.age < 18) {
            return 7.50;
        }
        else {return 4.00;}
    }

    @Override
    public int getRating() {
        return 3;
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        if(visitor.age < 18) {
            return false;
        }
        else {return true;}
    }
}
