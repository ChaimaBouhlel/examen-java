package threads;

import java.util.Vector;

public class Producteur {
    private Vector<String> messages;
    public Producteur(int capacite){
        messages = new Vector<>(capacite);
    }
    public void putMessage(String msg){
        messages.add(msg);
    }
}
