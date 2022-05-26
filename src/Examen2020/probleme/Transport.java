package Examen2020.probleme;

public abstract class Transport {
    protected int numero;
    Transport(int n){
        this.numero = n;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "numero=" + numero +
                '}';
    }
}
