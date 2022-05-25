package threads;

public class ThreadConsommateur extends  Thread{
    Producteur p;
    public ThreadConsommateur(Producteur p) {
        this.p = p;
    }

    public void run(){
        while (true){
            try {
                System.out.println( p.getMessage());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            try {
                sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
