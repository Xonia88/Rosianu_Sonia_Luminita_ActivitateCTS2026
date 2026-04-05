package factory.a3;

public class FactoryPersonalMedical implements FactoryPersonal {

    @Override
    public PersonalSpital crearePersonal(String tip) {

        if (tip.equals("medic")) {
            return new Medic();
        } else if (tip.equals("asistent")) {
            return new Asistent();
        } else {
            return null;
        }
    }
}