import org.junit.Before;
import org.junit.Test;
import stalls.TobaccoStall;
import visitors.Visitor;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;
    Visitor visitor;

    @Before
    public void before(){
        tobaccoStall = new TobaccoStall("tracing a ladder to the stars", "Brian Slade", "A37");
        visitor = new Visitor(34, 184, 10.00);
    }

    @Test
    public void hasName(){
        assertEquals("tracing a ladder to the stars", tobaccoStall.getName());
    }

    @Test
    public void hasOwner(){
        assertEquals("Brian Slade", tobaccoStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot(){
        assertEquals("A37", tobaccoStall.getParkingSpot());
    }

    @Test
    public void visitorIsAllowed(){
        assertEquals(true, tobaccoStall.isAllowedTo(visitor));
    }

    @Test
    public void hasRating(){
        assertEquals(2, tobaccoStall.getRating());
    }
}
