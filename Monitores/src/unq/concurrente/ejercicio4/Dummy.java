package unq.concurrente.ejercicio4;

public class Dummy extends Thread{

    private Barrera barrera;
    private String str;
    private int num;

    public Dummy(Barrera barrera, String str, int num) {
        this.barrera = barrera;
        this.str = str;
        this.num = num;
    }

    public void run(){
        System.out.println(this.str);
        try {
            this.barrera.esperar();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(this.num);
    }
}
