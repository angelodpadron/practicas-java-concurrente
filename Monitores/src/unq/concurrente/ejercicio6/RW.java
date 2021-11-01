package unq.concurrente.ejercicio6;

import java.util.ArrayList;

public class RW {

    // data field
    public ArrayList<String> data;

    private int currentReaders;
    private int currentWriters;

    // writers priority
    private int waitingWriters;

    public RW() {
        this.data = new ArrayList<String>();
        this.currentReaders = 0;
        this.currentWriters = 0;
        this.waitingWriters = 0;
    }

    public synchronized void beginRead() throws InterruptedException {
        while(!canRead()){
            wait();
        }
        currentReaders++;
    }

    public synchronized void endRead(){
        currentReaders--;
        if(currentReaders == 0){
            notify();
        }
    }

    public synchronized void beginWrite() throws InterruptedException {
        waitingWriters++;
        while(!canWrite()){
            wait();
        }
        waitingWriters--;
        currentWriters++;
    }

    public synchronized void endWrite(){
        currentWriters--;
        notifyAll();
    }

    private boolean canRead(){
        return currentWriters == 0 && waitingWriters == 0;
    }

    private boolean canWrite(){
        return currentWriters == 0 && currentReaders == 0;
    }
}
