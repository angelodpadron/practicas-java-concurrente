package unq.concurrente.ejercicio3;

public class Consumer extends Thread{

    private Buffer buffer;

    public Consumer(Buffer buffer){
        this.buffer = buffer;
    }

    public void run(){
        while (true){
            try {
                int value = this.buffer.read();
                System.out.println("Value: " + value);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
