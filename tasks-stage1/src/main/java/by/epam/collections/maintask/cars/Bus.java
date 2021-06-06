package by.epam.collections.maintask.cars;
import by.epam.collections.maintask.classification.ClassificationBus;

public class Bus extends Car {
    private ClassificationBus type;
    public Bus (String brand, String model, String carID, float fuelConsumption, double price, int maxSpeed, int maxPassengers, ClassificationBus type) {
        super (brand, model, carID, fuelConsumption, price, maxSpeed, maxPassengers);
        this.type = type;
    }
}


