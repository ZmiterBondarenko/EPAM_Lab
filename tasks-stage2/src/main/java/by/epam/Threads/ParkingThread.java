package by.epam.Threads;
import java.util.concurrent.Semaphore;

public class ParkingThread {
    private static final int PARKING_PLACES = 5;
    private static final int CARS = 10;

    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(PARKING_PLACES, true);
        for (int i = 1; i <= CARS; i++) {
            new Parking("Car number " + i, semaphore).start();
        }
    }
}
