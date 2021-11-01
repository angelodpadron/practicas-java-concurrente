package unq.concurrente.ejercicio6;

public class Main {

    public static void main(String[] args){

        RW monitor = new RW();

        Writer writer0 = new Writer(0, monitor);
        Writer writer1 = new Writer(1, monitor);

        Reader reader0 = new Reader(0, monitor);
        Reader reader1 = new Reader(1, monitor);
        Reader reader2 = new Reader(2, monitor);
        Reader reader3 = new Reader(3, monitor);

        writer0.start();
        writer1.start();

        reader0.start();
        reader1.start();
        reader2.start();
        reader3.start();

    }

}
