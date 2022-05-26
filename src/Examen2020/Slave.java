package Examen2020;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Slave extends Master{
    public static void main(String [] args){
        String s = null;
        try {
            s = new Slave().doFileStuff();
        }catch (IOException e){
            s = "b";
        }
        System.out.println(s);
    }
    String doFileStuff() throws NumberFormatException, FileNotFoundException {
        System.out.println("methode fille appelée");
        return "b";
    }
}
