import attractions.HorrorHouse;
import org.junit.Before;
import org.junit.Test;
import visitors.Visitor;
import attractions.Attraction;

import static org.junit.Assert.assertEquals;

public class HorrorHouseTest {

    HorrorHouse horrorHouse;
    Visitor visitor;

    @Before
    public void before(){
        horrorHouse = new HorrorHouse("Dracula's Lair");
        visitor = new Visitor(41, 165, 10.00);
    }

    @Test
    public void hasName(){
        assertEquals("Dracula's Lair", horrorHouse.getName());
    }

    @Test
    public void hasRating(){
        assertEquals(4, horrorHouse.getRating());
    }

    @Test
    public void hasDefaultPrice(){
        assertEquals(2.50, horrorHouse.defaultPrice(), 0.1);
    }

    @Test
    public void hasPriceFor(){
        horrorHouse.priceFor(visitor);
        assertEquals(3.25, horrorHouse.priceFor(visitor), 0.1);
    }

    @Test
    public void visitorIsAllowedTo(){
        assertEquals(true, horrorHouse.isAllowedTo(visitor));
    }
}
