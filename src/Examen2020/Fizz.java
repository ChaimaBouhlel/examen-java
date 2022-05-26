package Examen2020;

public class Fizz {
    int x = 5;
    public static void main(String []a){
        final Fizz f1 = new Fizz();
        Fizz f2 = new Fizz();
        Fizz f3 = switchFizz(f1,f2);
        System.out.println((f1==f3)+ " " + (f1.x == f3.x));
    }
    static Fizz switchFizz(Fizz x, Fizz y){
        final Fizz z = x;
        System.out.println(z.x);
        return z;
    }
}
