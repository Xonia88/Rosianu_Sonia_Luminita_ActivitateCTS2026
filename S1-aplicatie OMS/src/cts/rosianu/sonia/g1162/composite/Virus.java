package cts.rosianu.sonia.g1162.composite;

public class Virus implements StructuraOMS {

    private String denumire;
    private int numarCazuri;
    private String tipTransmitere;
    private String severitate;

    public Virus(String denumire,
                 int numarCazuri,
                 String tipTransmitere,
                 String severitate) {

        this.denumire = denumire;
        this.numarCazuri = numarCazuri;
        this.tipTransmitere = tipTransmitere;
        this.severitate = severitate;
    }

    @Override
    public void afisare(int nivel) {

        for (int i = 0; i < nivel; i++) {
            System.out.print("       ");
        }

        System.out.println(
                "Virus: " + denumire +
                        " | cazuri: " + numarCazuri +
                        " | transmitere: " + tipTransmitere +
                        " | severitate: " + severitate);
    }

    @Override
    public int getNumarTotalCazuri() {

        return numarCazuri;
    }

    @Override
    public void adaugaNod(StructuraOMS nod) {

        throw new UnsupportedOperationException(
                "Nu se poate adauga nod intr-un virus.");
    }
}