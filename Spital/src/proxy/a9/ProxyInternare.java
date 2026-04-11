package proxy.a9;

public class ProxyInternare implements Internare {

    private Spital spital;

    public ProxyInternare(Spital spital) {
        this.spital = spital;
    }

    @Override
    public void interneaza(Pacient pacient) {

        if (pacient.areAsigurare()) {
            spital.interneaza(pacient);
        } else {
            System.out.println("Pacientul " + pacient.getNume() + " nu are asigurare.");
        }
    }
}