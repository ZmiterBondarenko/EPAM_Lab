package by.epam.collections.maintask.cars;
import by.epam.collections.maintask.classification.ClassificationPassengerCar;

public class PassengerCar extends Car {
    private ClassificationPassengerCar type;
    public PassengerCar(String brand, String model, String carID, float fuelConsumption, double price, int maxSpeed, int maxPassengers,ClassificationPassengerCar type) {
        super (brand, model, carID, fuelConsumption, price, maxSpeed, maxPassengers);
        this.type = type;
    }
}

