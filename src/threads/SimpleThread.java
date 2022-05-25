package threads;

public class SimpleThread extends Thread {
    private int countDown = 5;
    private static int threadCount = 0;
    private final int threadNumber = ++threadCount;

    public SimpleThread() {
        System.out.println("Making " + threadNumber);
    }

    public void run(){
        while(true) {
            System.out.println("Thread " + threadNumber + "(" + countDown + ")");
            if (--countDown == 0) return;
            Thread.yield();
        }
    }


}