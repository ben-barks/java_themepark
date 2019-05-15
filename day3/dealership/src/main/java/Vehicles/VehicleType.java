package Vehicles;

public enum VehicleType {
    PANZER_502(1500.00, 50.00),
    FLAME_TANK(3000.00, 75.00),
    CRUISER_TANK(1000.00, 20.00),
    HARLEY_DAVIDSON(2000.00, 40.00),
    SUZUKI_FZ50(4500.00, 56.00),
    COUGAR100(2853.00, 70.00),
    ASTON_MARTIN(3800.00, 15.00),
    DODGE(2700.00, 46.00),
    FERRARI(2745.00, 37.00);

    private final double bookValue;
    private final double rentValue;

    VehicleType(double bookValue, double rentValue) {
        this.bookValue = bookValue;
        this.rentValue = rentValue;
    }



    public double getBookValue() {
        return bookValue;
    }

    public double getRentValue() {
        return rentValue;
    }
}