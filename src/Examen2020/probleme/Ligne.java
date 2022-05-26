package Examen2020.probleme;

import java.util.ArrayList;
import java.util.Vector;

public class Ligne {
    protected char lettre;
    protected Terminal depart;
    protected Terminal arrivee;
    protected Vector<Station> listeStations = new Vector<>(100);
    protected Vector<Transport> listeTransport = new Vector<>(500);
    protected static int nbStation = 0;
    protected static int nbTransport =0;
    public Ligne(char c, Terminal arr, Terminal dep){
        lettre=c;
        arrivee = arr;
        depart = dep;
    }

    public void addTransport(Transport t) throws CapacityException {
        if (nbTransport < listeTransport.capacity()) {
            listeTransport.add(t);
            nbTransport++;
        }else {
            throw new CapacityException();
        }
    }
    public void addStation(Station s) throws CapacityException {
        if (nbStation < listeStations.capacity()) {
            listeStations.add(s);
            nbStation++;
        }else {
            throw new CapacityException();
        }
    }
    public String toString(){
        String part1 = "Ligne: "+lettre +
                "{station Depart: " + depart +
                ", station arrivee: " + arrivee +
                "stations { \n";
        String stations = "";
        for (Station s: listeStations) {
            stations += " " +  s.toString() ;
        }
        String transports = "";
        for (Transport t: listeTransport) {
            transports += t.toString();
        }
        return part1 + stations + "} \n Liste de transports:{" + transports + "}}";
    }

    void existeStation(Station s ){
        if (listeStations.contains(s)){
            System.out.println("existe");
        }
    }
}
