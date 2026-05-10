package strategy.a11;

public class PlataCash implements ModPlata {

    @Override
    public void plateste(float suma) {
        System.out.println("Pacientul a platit cash: " + suma);
    }
}