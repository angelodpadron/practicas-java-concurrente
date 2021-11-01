package unq.concurrente.ejercicio2;

public class MutexConsumer extends Thread {

        private Semaphore semaphore;
        private int id;

        public MutexConsumer(Semaphore semaphore, int id) {
            this.semaphore = semaphore;
            this.id = id;
        }

        public void run(){
            try {
                semaphore.acquire();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread "+ id +" ejecutando...");
            semaphore.release();
        }
}
