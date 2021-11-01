package unq.concurrente.ejercicio2;

public class Semaphore {

    private int permissions;

    public Semaphore(int permissions) {
        this.permissions = permissions;
    }

    public synchronized void acquire() throws InterruptedException {
        while (this.permissions == 0){
            wait();
        }
        this.permissions--;
    }

    public synchronized void release(){
        this.permissions++;
        notify();
    }
}