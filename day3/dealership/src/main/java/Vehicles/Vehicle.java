package Vehicles;

public abstract class Vehicle {

    private double price;
    private String color;
    private String engine;
    private int damage;
    private VehicleType vehicleType;

    public Vehicle(VehicleType vehicleType, String color, String engine, int damage) {
        this.vehicleType = vehicleType;
        this.price = evaluatePrice();
        this.color = color;
        this.engine = engine;
        this.damage = damage;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public double evaluatePrice(){
        return vehicleType.getBookValue() - this.calculateDamage();
    }

    public double calculateDamage(){
        return (vehicleType.getBookValue() * 0.1) * damage;
    }
}
