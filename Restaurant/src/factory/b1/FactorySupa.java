package factory.b1;

public class FactorySupa {

    public Supa creareSupa(TipSupa tip) {

        switch (tip) {
            case LEGUME:
                return new SupaLegume();
            case CIUPERCI:
                return new SupaCiuperci();
            case VITA:
                return new SupaVita();
            default:
                return null;
        }
    }
}