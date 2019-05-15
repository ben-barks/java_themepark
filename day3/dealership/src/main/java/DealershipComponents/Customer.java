package DealershipComponents;

import Vehicles.Vehicle;

import java.util.ArrayList;

public class Customer {

    private double wallet;
    private ArrayList<Vehicle> vehicles;

    public Customer(double wallet) {
        this.wallet = wallet;
        this.vehicles = new ArrayList<>();
    }

    public double getWallet() {
        return wallet;
    }

    public void setWallet(double wallet) {
        this.wallet = wallet;
    }

    public int getVehicles() {
        return vehicles.size();
    }

    public void setVehicles(Vehicle vehicle) {
        vehicles.add(vehicle);
    }
}
