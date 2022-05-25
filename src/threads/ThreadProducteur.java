package threads;

public class ThreadProducteur extends Thread{
    Producteur p ;
    public ThreadProducteur(Producteur p) {
        this.p = p;
    }

    public void run(){
        while (true){
            try {
                p.putMessage("Tourne en rond");
            } catch (CapacityException e) {
            }
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

