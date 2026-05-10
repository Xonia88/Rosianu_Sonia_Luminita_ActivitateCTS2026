package strategy.a11;

public class Main {
    public static void main(String[] args) {

        Pacient pacient = new Pacient();

        pacient.setModPlata(new PlataCash());
        pacient.plateste(100);

        pacient.setModPlata(new PlataCard());
        pacient.plateste(200);
    }
}