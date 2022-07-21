import java.util.Random;
import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {
        Semaphore nsSemaphore = new Semaphore(1);
        Semaphore weSemaphore = new Semaphore(1);
        NordSouthDirection nordSouthDirection = new NordSouthDirection();
        WestEastDirection westEastDirection = new WestEastDirection();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int nr = random.nextInt();
            if (nr % 2 == 0) {
                try {
                    nsSemaphore.acquire();
                    nordSouthDirection.run();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                nsSemaphore.release();
            } else {
                try {
                    weSemaphore.acquire();
                    westEastDirection.run();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                weSemaphore.release();
            }
        }
    }
}
