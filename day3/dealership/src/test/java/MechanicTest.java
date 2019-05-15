import DealershipComponents.Mechanic;
import Vehicles.Tank;
import Vehicles.Vehicle;
import Vehicles.VehicleType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MechanicTest {

    Mechanic mechanic;
    Tank tank;

    @Before
    public void before(){
        mechanic = new Mechanic();
        tank = new Tank(VehicleType.PANZER_502, "Black", "Big", 6);
    }

    @Test
    public void checkMechanicCanRepair(){
        mechanic.repairDamage(tank);
        assertEquals(1, tank.getDamage());
        assertEquals(1350, tank.getPrice(), 0.1);
        assertEquals(5, mechanic.getHoursWorked());
    }
}
