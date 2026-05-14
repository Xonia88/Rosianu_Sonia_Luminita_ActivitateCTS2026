package cts.rosianu.sonia.g1162.strategy;

import java.util.List;

public class VizualizareRecenzii implements ModVizualizare{

    @Override
    public void afiseazaProduse(List<IProdus> produse) {

        produse.stream()
                .filter(
                        produs -> produs.getNumarRecenzii() > 0)
                .forEach(System.out::println);

    }
}
