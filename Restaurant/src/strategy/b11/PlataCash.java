package strategy.b11;

public class PlataCash implements ModPlata {

    @Override
    public void plateste(float suma) {
        System.out.println("Clientul a platit cash: " + suma);
    }
}