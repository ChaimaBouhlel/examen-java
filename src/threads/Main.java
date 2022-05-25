package threads;

public class Main {
    public static void main(String [] args){


            for (int i = 0; i < 5; i++)
                new SimpleThread().start();
            System.out.println("All Threads Started");


    }
}
