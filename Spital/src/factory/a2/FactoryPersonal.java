package factory.a2;

public class FactoryPersonal {

    public PersonalSpital crearePersonal(TipPersonal tip) {

        switch (tip) {
            case BRANCARDIER:
                return new Brancardier();
            case ASISTENT:
                return new Asistent();
            case MEDIC:
                return new Medic();
            default:
                return null;
        }
    }
}