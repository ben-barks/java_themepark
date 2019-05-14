import attractions.ShootingGallery;
import org.junit.Before;
import org.junit.Test;
import visitors.Visitor;

import static org.junit.Assert.assertEquals;

public class ShootingGalleryTest {

    ShootingGallery shootingGallery;
    Visitor visitor;

    @Before
    public void before(){
        shootingGallery = new ShootingGallery("Trump's eye");
        visitor = new Visitor(20, 174, 10.00);
    }

    @Test
    public void hasName(){
        assertEquals("Trump's eye", shootingGallery.getName());
    }

    @Test
    public void hasRating(){
        assertEquals(3, shootingGallery.getRating());
    }

    @Test
    public void hasDefaultPrice(){
        assertEquals(3.25, shootingGallery.defaultPrice(), 0.1);
    }

    @Test
    public void hasPriceFor(){
        shootingGallery.priceFor(visitor);
        assertEquals(4.00, shootingGallery.priceFor(visitor), 0.1);
    }

    @Test
    public void visitorIsAllowedTo(){
        assertEquals(true, shootingGallery.isAllowedTo(visitor));
    }
}