package Examen2020.probleme;

public class Terminal extends Station{
    public Terminal(String nom, int numero, int x, int y) {
        super(nom, numero, x, y);
    }

    @Override
    public String toString() {
        return "Terminal" + super.toString();
    }
}
