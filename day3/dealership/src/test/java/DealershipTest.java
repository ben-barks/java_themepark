import Dealership.Dealership;
import Vehicles.Tank;
import Vehicles.VehicleType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    Dealership dealership;
    Tank tank;



    @Before
    public void before(){
        dealership = new Dealership(10000.00);
        tank = new Tank(VehicleType.PANZER_502, "Black", "Big", 6);
    }

    @Test
    public void hasStock(){
        assertEquals(0, dealership.getStockOfVehicles());
    }

    @Test
    public void hasTill(){
        assertEquals(10000.00, dealership.getTill(), 0.1);
    }

    @Test
    public void canGetListOfCustomers(){
        assertEquals(0, dealership.getListOfCustomers());
    }

    @Test
    public void canRepairTank(){
        dealership.fullService(tank);

        assertEquals(1, tank.getDamage());
        assertEquals(1350, tank.getPrice(), 0.1);
        assertEquals(5, dealership.getMechanic().getHoursWorked());

    }

    @Test
    public void canPayMechanicForWork(){
        dealership.fullService(tank);
        dealership.payMechanic(10);
        assertEquals(9950, dealership.getTill(), 0.1);
    }
}
