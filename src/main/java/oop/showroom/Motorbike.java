package oop.showroom;

public class Motorbike extends Vehicle {
    private String motorbikeType;
    private String motorbikeDrive;


    public Motorbike(String brand, String model, String colour, String engine, double mileage, String gearBoxType, boolean isUsed, String motorbikeType, String motorbikeDrive) {
        super(brand, model, colour, engine, mileage, gearBoxType, isUsed);
        this.motorbikeType = motorbikeType;
        this.motorbikeDrive = motorbikeDrive;
    }
}
