package factory.b1;

public class Main {
    public static void main(String[] args) {

        FactorySupa factory = new FactorySupa();

        Supa s1 = factory.creareSupa(TipSupa.LEGUME);
        Supa s2 = factory.creareSupa(TipSupa.CIUPERCI);
        Supa s3 = factory.creareSupa(TipSupa.VITA);

        s1.descriere();
        s2.descriere();
        s3.descriere();
    }
}