package JavaOOP.Polymorphism_11.Exercise.Vehicles_Extendet_2;

public class Car extends VehicleImpl {

    public Car(double fuelQuantity, double fuelConsumption, int tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity);
    }

    @Override
    protected void setFuelConsumption(double fuelConsumption) {
        super.setFuelConsumption(fuelConsumption + 0.9);

    }

    @Override
    public String drive(double distance) {
        return "Car " + super.drive(distance);
    }
}