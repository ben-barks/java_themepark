package attractions;

import visitors.IReviewed;
import visitors.ISecurity;

public abstract class Attraction implements ITicketed, ISecurity, IReviewed {
    String name;

    public Attraction(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
