package builder.a1;

public class Pacient {
    private String nume;
    private boolean patRabatabil;
    private boolean micDejun;
    private boolean papuciCamera;
    private boolean halatInterior;

    public Pacient(String nume, boolean patRabatabil, boolean micDejun,
                   boolean papuciCamera, boolean halatInterior) {
        this.nume = nume;
        this.patRabatabil = patRabatabil;
        this.micDejun = micDejun;
        this.papuciCamera = papuciCamera;
        this.halatInterior = halatInterior;
    }

    @Override
    public String toString() {
        return "Pacient: " + nume +
                " | Pat rabatabil: " + patRabatabil +
                " | Mic dejun: " + micDejun +
                " | Papuci: " + papuciCamera +
                " | Halat: " + halatInterior;
    }
}