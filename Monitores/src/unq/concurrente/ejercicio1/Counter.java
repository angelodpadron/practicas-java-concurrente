package unq.concurrente.ejercicio1;

public class Counter {

    private int counter = 0;

    public synchronized void increase(){
        this.counter++;
    }

    public synchronized void decrease(){
        this.counter--;
    }

    public synchronized void print(){
        System.out.println(this.counter);
    }

}