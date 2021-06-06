package by.epam.collections.maintask;
import by.epam.collections.maintask.cars.Car;

import java.util.*;

public class Garage {
    private List<? extends Car> cars;

    public double totalPrice(){
        double totalPrice = 0.0;
        for (Car car : cars)
            totalPrice += car.getPrice();
        return totalPrice;
    }

    public Garage sortByFuelConsamption() {
        Collections.sort(cars, new Comparator<Car>() {
            public int compare(Car o1, Car o2) {
                return (int) Math.round(100*(o1.getFuelConsumption() - o2.getFuelConsumption()));
            }
        });
        return this;
    }

    public int getInputValue(){
        Scanner in = new Scanner(System.in);
        int speed = in.nextInt();
        return speed;
    }

    public List<Car> findBySpeedRange(int minSpeed, int maxSpeed) {
        while (maxSpeed < minSpeed) {
            System.out.println("Entered value is incorrect, \n" + "input correct value of max speed");
            maxSpeed = getInputValue();}
        List<Car> foundCars = new ArrayList<Car>();
        for (Car car : cars) {
            if (car.getMaxSpeed() >= minSpeed && car.getMaxSpeed() <= maxSpeed) {
                foundCars.add(car);
            }
        }
        return foundCars;
    }

    public Garage(List<? extends Car> cars) {
        this.cars = cars;
    }

    @Override
    public String toString() {
        return  cars.toString();
    }
}

