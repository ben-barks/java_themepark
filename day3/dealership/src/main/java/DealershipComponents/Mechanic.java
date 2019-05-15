package DealershipComponents;

import Vehicles.Vehicle;

public class Mechanic {

    private int hoursWorked;

    public Mechanic(){
        this.hoursWorked = 0;
    }

    public void repairDamage(Vehicle vehicle){
        this.hoursWorked = vehicle.getDamage() - 1;
        vehicle.setDamage(1);
        vehicle.setPrice(vehicle.evaluatePrice());

    }

    public int getHoursWorked() {
        return hoursWorked;
    }
}
