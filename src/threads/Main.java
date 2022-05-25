package threads;

import java.util.Vector;

public class Main {
    public static void main(String [] args){
        //tester threads
            /*for (int i = 0; i < 5; i++)
                new SimpleThread().start();
            System.out.println("All Threads Started");*/

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
    }


}
