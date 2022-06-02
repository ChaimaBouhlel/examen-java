package threads.ModeleProdCons;

public class CapacityException extends Exception {
    public String message = "Capacité insuffisante, vous ne pouvez pas ajouter ce message. \n Les messages émis doivent etre consommés!";
    public CapacityException(){
        System.out.println(message);
    }
}
