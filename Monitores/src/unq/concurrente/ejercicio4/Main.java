package unq.concurrente.ejercicio4;

public class Main {

    public static void main(String[] args) {

        Barrera barrera = new Barrera(3);

        Dummy d1 = new Dummy(barrera, "a", 1);
        Dummy d2 = new Dummy(barrera, "b", 2);
        Dummy d3 = new Dummy(barrera, "c", 3);

        d1.start();
        d2.start();
        d3.start();

    }

}
