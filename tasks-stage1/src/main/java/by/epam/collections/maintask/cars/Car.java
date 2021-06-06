package by.epam.collections.maintask.cars;

public abstract class Car {
    private String brand;
    private String model;
    private String carID;
    private float fuelConsumption;
    protected double price;
    private int maxSpeed;
    protected int maxPassengers;

    public Car(String brand, String model, String carID, float fuelConsumption, double price, int maxSpeed, int maxPassengers) {
        this.brand = brand;
        this.model = model;
        this.carID = carID;
        this.fuelConsumption = fuelConsumption;
        this.price = price;
        this.maxSpeed = maxSpeed;
        this.maxPassengers = maxPassengers;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getCarID() {
        return carID;
    }

    public float getFuelConsumption() {
        return fuelConsumption;
    }

    public double getPrice() {
        return price;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setCarID(String carID) {
        this.carID = carID;
    }

    public void setFuelConsumption(float fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    @Override
    public String toString() {
        return  "\n"+"brand=" + brand +
                ", model=" + model +
                ", carID=" + carID +
                ", maxFuelConsumption=" + fuelConsumption +
                ", price=" + price +
                ", maxSpeed=" + maxSpeed +
                ", maxPassengers=" + maxPassengers;
    }
}




