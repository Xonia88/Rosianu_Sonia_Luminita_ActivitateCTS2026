package strategy.a11;

public class Pacient {

    private ModPlata modPlata;

    public void setModPlata(ModPlata modPlata) {
        this.modPlata = modPlata;
    }

    public void plateste(float suma) {
        modPlata.plateste(suma);
    }
}