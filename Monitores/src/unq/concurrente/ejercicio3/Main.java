package unq.concurrente.ejercicio3;

public class Main {

    public static void main(String[] args) {

        Buffer buffer = new Buffer(25);
        Productor productor = new Productor(buffer);
        Consumer consumer = new Consumer(buffer);

        /* Un solo productor */

        consumer.start();
        productor.run();

    }
}
