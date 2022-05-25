package threads;

import java.util.Vector;

public class Producteur {
    private Vector<String> messages;
    private static int nbreMessagesEmis = 0;

    public Producteur(int capacite) {
        messages = new Vector<>(capacite);
    }

    public void putMessage(String msg) throws CapacityException {
        synchronized (this){
            if (messages.capacity() > nbreMessagesEmis){
                messages.add(msg);
                nbreMessagesEmis++;
                System.out.println("Nombre de messages dans le vector: "+ nbreMessagesEmis);
            }
            else{
                throw new CapacityException();
            }
            this.notify();
        }
    }

    public String  getMessage() throws InterruptedException {
        synchronized (this){
            if (messages.isEmpty())
                this.wait();
            String message = messages.lastElement();
            messages.remove(message);
            nbreMessagesEmis--;
            System.out.println("Nombre de messages dans le vector: "+ nbreMessagesEmis);
            return message;
        }
    }

}

