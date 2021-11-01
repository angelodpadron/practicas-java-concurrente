package unq.concurrente.ejercicio5;

public class Event {

    private int publications;

    public Event() {
        this.publications = 0;
    }

    public synchronized void publish(){
        publications++;
        notifyAll();
    }

    public synchronized void subscribe() throws InterruptedException {
        int arrivalPublications = publications;
        while (arrivalPublications == publications){
            wait();
        }

    }

}
