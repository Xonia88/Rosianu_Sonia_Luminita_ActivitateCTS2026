package cts.rosianu.sonia.g1162.strategy;

import java.util.List;

public class Utilizator {

    private ModVizualizare modVizualizare;

    public void setModVizualizare(ModVizualizare modVizualizare) {
        this.modVizualizare = modVizualizare;
    }

    public void afiseazaProduse(
            List<IProdus> produse) {
        modVizualizare.afiseazaProduse(produse);
    }
}
