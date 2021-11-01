package unq.concurrente.ejercicio3;

public class Buffer {

    private int begin;
    private int end;
    private int[] buffer;

    public Buffer(int size) {
        this.begin = 0;
        this.end = 0;
        this.buffer = new int[size+1];
    }

    public synchronized void write(int value) throws InterruptedException {
        while (isFull()){
            wait();
        }
        buffer[begin] = value;
        begin = next(begin);
        notifyAll();

    }

    public synchronized int read() throws InterruptedException {
        while (isEmpty()){
            wait();
        }
        int res = buffer[end];
        end = next(end);
        notifyAll();
        return res;

    }

    private int next(int i){
        return (i+1) % buffer.length;
    }

    private boolean isFull(){
        return (next(begin) == end);
    }

    private boolean isEmpty(){
        return (begin == end);
    }


}
