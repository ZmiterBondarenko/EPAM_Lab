package by.epam.Threads;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class Parking extends Thread {
    private Semaphore semaphore;
    private static final int WAIT_TIME = 2000;
    private static final int PARKING_TIME = 1000;

    Parking(String name, Semaphore semaphore) {
        super(name);
        this.semaphore = semaphore;
    }

    private void checkFreeParkingPlace() throws InterruptedException {
        if (semaphore.availablePermits() == 0) {
            System.out.println(Thread.currentThread().getName() + " is in queue. Waiting for free parking place");
            try {
                TimeUnit.MILLISECONDS.sleep(WAIT_TIME);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (semaphore.availablePermits() == 0)
            {
                throw new InterruptedException();
            }
        }
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " try to parking");
        try {
            checkFreeParkingPlace();
            semaphore.acquire();
            System.out.println(Thread.currentThread().getName() + " parked");
            sleep(PARKING_TIME);
            System.out.println(Thread.currentThread().getName() + " leave parking place");
            semaphore.release();

        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " can't parking. So it leave parking");
            Thread.currentThread().interrupt();
        }
    }
}

