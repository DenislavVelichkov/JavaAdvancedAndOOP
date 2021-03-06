package JavaOOP.Polymorphism_11.Exercise.Vehicles_Extendet_2;

public class Truck extends VehicleImpl {

    public Truck(double fuelQuantity, double fuelConsumption, int tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity);
    }

    @Override
    protected void setFuelConsumption(double fuelConsumption) {
        super.setFuelConsumption(fuelConsumption + 1.6);
    }

    @Override
    public void refuel(double liters) {
        super.refuel(liters * 0.95);
    }

    @Override
    public String drive(double distance) {
        return "Truck " + super.drive(distance);
    }

}
