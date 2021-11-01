package unq.concurrente.ejercicio2;

public class Main {

    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(1);

        MutexConsumer mc1 = new MutexConsumer(semaphore,0);
        MutexConsumer mc2 = new MutexConsumer(semaphore,1);

        mc1.start();
        mc2.start();

    }
}
