package unq.concurrente.ejercicio3;

public class Productor extends Thread {

    private Buffer buffer;

    public Productor(Buffer buffer) {
        this.buffer = buffer;
    }

    public void run(){
        for (int i = 0; i < 100; i++){
            try {
                this.buffer.write(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
