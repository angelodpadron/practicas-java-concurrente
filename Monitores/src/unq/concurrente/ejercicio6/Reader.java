package unq.concurrente.ejercicio6;

public class Reader extends Thread{

    private int threadId;
    private RW accessMonitor;

    public Reader(int threadId, RW accessMonitor){
        this.threadId = threadId;
        this.accessMonitor = accessMonitor;
    }

    public void run() {
        System.out.println("Thread " + this.threadId + " attempting to read...");
        try {
            accessMonitor.beginRead();
            String lastEntry = accessMonitor.data.get(accessMonitor.data.size()-1);
            System.out.println("Thread " + this.threadId + ": last entry: " + lastEntry);
            System.out.println("Thread " + this.threadId + ": data size: " + accessMonitor.data.size());
        } catch (Exception e) {
            System.out.println("Reader thread " + this.threadId + " failed.");
            e.printStackTrace();
        }
    }
}
