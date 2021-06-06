package by.epam.collections.maintask;
import by.epam.collections.maintask.cars.Bus;
import by.epam.collections.maintask.cars.Car;
import by.epam.collections.maintask.cars.PassengerCar;
import by.epam.collections.maintask.classification.ClassificationBus;
import by.epam.collections.maintask.classification.ClassificationPassengerCar;

import java.util.Arrays;
import java.util.List;
public class App {
    static List<Car> cars = Arrays.asList(
            new PassengerCar("VOLKSWAGEN", "Polo", "1111AA",9.5f, 30500, 164, 4, ClassificationPassengerCar.SEDAN),
            new PassengerCar("VOLKSWAGEN", "Polo", "2222AA",7.5f, 20500, 180, 4, ClassificationPassengerCar.SEDAN),
            new PassengerCar("NISSAN", "Almera", "3333AA",11.5f, 35500, 200, 4, ClassificationPassengerCar.UNIVERSAL),
            new PassengerCar("MAZDA", "6", "4444AA",6.0f, 32500, 210, 4, ClassificationPassengerCar.SEDAN),
            new Bus("MERCEDESBENZ", "Sprinter", "5555AA",12.0f, 42000, 220, 18, ClassificationBus.MINIBUS),
            new Bus("VOLKSWAGEN", "Caravelle", "6666AA",11.0f, 50000, 225, 8, ClassificationBus.MINIBUS),
            new Bus("MAN", "SU283", "7777AA",15.0f, 120000, 120, 45, ClassificationBus.BUS),
            new Bus("NEOPLAN", "Starliner", "8888AA",14.0f, 150000, 140, 63, ClassificationBus.BUS),
            new Bus("SETRA", "S431DT", "9999AA",13.5f, 140000, 140, 75, ClassificationBus.BUS)
    );

    public static void main(String[] args) {
        System.out.println(cars.toString());
        Garage garage =new Garage(cars);
        System.out.println("\n TotalPrice of cars:" + garage.totalPrice() );
        System.out.println("\n List of cars sorted by fuel consumption:" + garage.sortByFuelConsamption().toString() );
        System.out.println("\n Find a car with specified range of speed parameters");
        System.out.println("Input min speed ");
        int min = garage.getInputValue();
        System.out.println("Input max speed ");
        int max = garage.getInputValue();
        System.out.println("\n List of cars with range of speed "+ min+" - "+max+": "+ garage.findBySpeedRange(min, max));
    }
}
