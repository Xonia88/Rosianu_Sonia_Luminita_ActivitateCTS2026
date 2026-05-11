package strategy.b11;

public class Client {

    private ModPlata modPlata;

    public void setModPlata(ModPlata modPlata) {
        this.modPlata = modPlata;
    }

    public void plateste(float suma) {
        modPlata.plateste(suma);
    }
}