package cts.rosianu.sonia.g1162.chain;

import java.util.ArrayList;
import java.util.List;

public class PaginaWeb {

    private String numePagina;
    private List<Item> iteme;

    public PaginaWeb(String numePagina) {
        this.numePagina = numePagina;
        this.iteme = new ArrayList<>();
    }

    public void adaugaItem(Item item) {

        iteme.add(item);
    }

    public List<Item> getIteme() {

        return iteme;
    }

    public String getNumePagina() {

        return numePagina;
    }

    public void afisarePagina() {

        System.out.println(
                "\nPagina: " + numePagina);

        for (Item item : iteme) {
            System.out.println(item.getTip() + " " + item.getContinut());
        }
    }
}
