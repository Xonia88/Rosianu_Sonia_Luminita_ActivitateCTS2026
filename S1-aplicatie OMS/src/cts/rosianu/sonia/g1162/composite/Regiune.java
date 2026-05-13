package cts.rosianu.sonia.g1162.composite;

import java.util.ArrayList;
import java.util.List;

public class Regiune implements StructuraOMS{

    private String denumire;
    private List<StructuraOMS> noduri;

    public Regiune(String denumire) {
        this.denumire = denumire;
        this.noduri = new ArrayList<>();
    }

    @Override
    public void afisare(int nivel) {

        for(int i = 0; i < nivel; i++){
            System.out.println("     ");

        }

        System.out.println(denumire);

        for(StructuraOMS nod: noduri){
            nod.afisare(nivel + 1);
        }
    }

    @Override
    public int getNumarTotalCazuri() {

        int total = 0;

        for(StructuraOMS nod: noduri){
            total += nod.getNumarTotalCazuri();
        }
        return total;
    }

    @Override
    public void adaugaNod(StructuraOMS nod) {
        noduri.add(nod);

    }
}
