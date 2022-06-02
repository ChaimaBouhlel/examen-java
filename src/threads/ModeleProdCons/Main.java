package threads.ModeleProdCons;

import threads.ModeleProdCons.Producteur;
import threads.ModeleProdCons.ThreadConsommateur;
import threads.ModeleProdCons.ThreadProducteur;

public class Main {
    public static void main(String [] args){
        System.out.println("On initialise un producteur avec un vecteur de messages de capacité 10");
// Si le nombre de message depasse la capacité du vecteur, un exception est donc levée et gérée
        Producteur p = new Producteur(10);
        ThreadProducteur threadProducteur = new ThreadProducteur(p);
        ThreadConsommateur threadConsommateur = new ThreadConsommateur(p);
        threadProducteur.start();
        threadConsommateur.start();
        System.out.println("Les deux threads commencent");
    }


}
