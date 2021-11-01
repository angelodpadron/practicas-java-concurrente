package unq.concurrente.ejercicio6;

public class Writer extends Thread{

    private int threadId;
    private RW accessMonitor;

    public Writer(int threadId, RW accessMonitor){
        this.threadId = threadId;
        this.accessMonitor = accessMonitor;
    }

    public void run(){
        System.out.println("Thread " + this.threadId + " attempting to write...");
        try {
            this.accessMonitor.beginWrite();
            this.accessMonitor.data.add("Writer thread " + this.threadId + " was here!");
            System.out.println("Done for writer thread " + threadId);
            this.accessMonitor.endWrite();
        } catch (InterruptedException e) {
            System.out.println("Writer thread " + this.threadId + " failed.");
            e.printStackTrace();
        }
    }


}
