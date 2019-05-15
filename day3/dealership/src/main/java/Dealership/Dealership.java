package Dealership;

import DealershipComponents.Customer;
import DealershipComponents.Mechanic;
import Vehicles.Vehicle;

import java.util.ArrayList;
import java.util.Collection;

public class Dealership {

    private ArrayList<Vehicle> stockOfVehicles;
    private double till;
    private Mechanic mechanic;
    private ArrayList<Customer> listOfCustomers;

    public Dealership(double till) {
        this.stockOfVehicles = new ArrayList<>();
        this.till = till;
        this.mechanic = new Mechanic();
        this.listOfCustomers = new ArrayList<>();
    }

    public int getStockOfVehicles() {
        return stockOfVehicles.size();
    }

    public double getTill() {
        return till;
    }

    public Mechanic getMechanic() {
        return mechanic;
    }

    public int getListOfCustomers() {
        return listOfCustomers.size();
    }

    public void addCustomerToDealership(Customer customer){
        listOfCustomers.add(customer);
    }

    public void removeCustomerFromDealership(Customer customer){
        listOfCustomers.remove(customer);
    }

    public void buyVehicle(Vehicle vehicle){
        stockOfVehicles.add(vehicle);
    }

    public void fullService(Vehicle vehicle){
        mechanic.repairDamage(vehicle);
    }

    public void payMechanic(int amount){
        changeTill(mechanic.getHoursWorked()*amount);

    }

    public void changeTill(double amount){
        till -= amount;
    }
}
