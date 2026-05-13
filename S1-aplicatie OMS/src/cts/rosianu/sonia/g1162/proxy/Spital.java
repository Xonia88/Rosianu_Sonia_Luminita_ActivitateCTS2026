package cts.rosianu.sonia.g1162.proxy;

public class Spital implements ISpital {

    @Override
    public void permiteAcces(Vizitator vizitator) {
        System.out.println("Vizitatorul " + vizitator.getNume() + " a intrat in salon.");
    }
}
