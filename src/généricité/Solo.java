package généricité;

public class Solo<T>{
    private T valeur;
    public Solo(){
        this.valeur = null;
    }
    public Solo(T val){
        this.valeur = val;
    }
    public void setValeur(T val){
        this.valeur = val;
    }
    public T getValeur(){
        return this.valeur;
    }

    public static void main(String[] args) {
        Solo<Integer> val = new Solo<Integer>(12);
        System.out.println(val.getValeur());
        Solo<String> valS = new Solo<String>("TOTOTOTO");
        Solo<Float> valF = new Solo<Float>(12.2f);
        Solo<Double> valD = new Solo<Double>(12.202568);
        Solo<?> valM = new Solo<>("hi");
    }
}

