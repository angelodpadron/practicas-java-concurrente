package unq.concurrente.ejercicio4;

public class Barrera {

    private int remainingThreads;

    public Barrera(int threads) {
        this.remainingThreads = threads;
    }

    public synchronized void esperar() throws InterruptedException {
        remainingThreads--;
        while (remainingThreads > 0) wait();
        notifyAll();
    }
}
