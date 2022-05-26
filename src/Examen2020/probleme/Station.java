package Examen2020.probleme;

public class Station {
    protected String nom;
    protected int numero;
    protected int x;
    protected int y;

    public Station(String nom, int numero, int x, int y) {
        this.nom = nom;
        this.numero = numero;
        this.x = x;
        this.y = y;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }


    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Station{" +
                "nom='" + nom + '\'' +
                ", numero=" + numero +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
