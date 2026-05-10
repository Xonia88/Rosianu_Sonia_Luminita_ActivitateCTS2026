package strategy.a11;

public class PlataCard implements ModPlata {

    @Override
    public void plateste(float suma) {
        System.out.println("Pacientul a platit cu cardul: " + suma);
    }
}