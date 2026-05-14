package cts.rosianu.sonia.g1162.main;

import cts.rosianu.sonia.g1162.strategy.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("STRATEGY");

        List<IProdus>produse =  new ArrayList<>();

        produse.add(new Produs("Laptop", 4500, 4000));
        produse.add(new Produs("Telefon", 3000, 3500));
        produse.add(new Produs("Mouse", 4000, 60));
        produse.add(new Produs("Tableta", 1000, 600));


        Utilizator utilizator = new Utilizator();

        utilizator.setModVizualizare(new VizualizarePretCrescator());
        utilizator.afiseazaProduse(produse);

        utilizator.setModVizualizare(new VizualizarePretDescrescator());
        utilizator.afiseazaProduse(produse);

        utilizator.setModVizualizare(new VizualizareRecenzii());
        utilizator.afiseazaProduse(produse);



        System.out.println("Chain of responsability");
    }
}
