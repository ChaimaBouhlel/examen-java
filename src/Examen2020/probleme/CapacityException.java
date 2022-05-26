package Examen2020.probleme;

public class CapacityException extends Exception {
    public String message = "Capacité insuffisante, vous ne pouvez pas ajouter un autre element!";
    public CapacityException(){
        System.out.println(message);
    }
}
