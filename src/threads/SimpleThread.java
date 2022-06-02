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

    public static void main(String []args){
        //tester threads
            /*for (int i = 0; i < 5; i++)
                new SimpleThread().start();
            System.out.println("All Threads Started");*/

        //tester Vector
        /*
        Vector<String> messages;
        messages = new Vector<>(3);
        messages.add("a");
        messages.add("b");
        messages.add("b");
        messages.add("a");
        messages.add("a");
        for (String msg : messages)
            System.out.println(msg);
        System.out.println(messages.capacity());
        messages.add("aa");
        messages.add("aa");
        System.out.println(messages.capacity());
         */
    }


}