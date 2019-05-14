import org.junit.Before;
import org.junit.Test;
import stalls.AlcoholStall;
import visitors.Visitor;

import static org.junit.Assert.assertEquals;

public class AlcoholStallTest {

    AlcoholStall alcoholStall;
    Visitor visitor;

    @Before
    public void before(){
        alcoholStall = new AlcoholStall("Charging Station", "Barbara", "B32");
        visitor = new Visitor(34,173,10.00);
    }

    @Test
    public void hasName(){
        assertEquals("Charging Station", alcoholStall.getName());
    }

    @Test
    public void hasOwner(){
        assertEquals("Barbara", alcoholStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot(){
        assertEquals("B32", alcoholStall.getParkingSpot());
    }

    @Test
    public void visitorIsAllowed(){
        assertEquals(true, alcoholStall.isAllowedTo(visitor));
    }

    @Test
    public void hasRating(){
        assertEquals(5, alcoholStall.getRating());
    }

}
