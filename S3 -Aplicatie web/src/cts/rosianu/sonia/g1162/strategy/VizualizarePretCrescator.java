package cts.rosianu.sonia.g1162.strategy;

import java.util.Comparator;
import java.util.List;

public class VizualizarePretCrescator implements ModVizualizare {

    @Override
    public void afiseazaProduse(List<IProdus> produse) {

        produse.stream()
                .sorted(Comparator.comparingDouble(IProdus::getPret))
                .forEach(System.out::println);
    }
}
