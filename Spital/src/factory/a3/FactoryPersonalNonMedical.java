package factory.a3;

public class FactoryPersonalNonMedical implements FactoryPersonal {

    @Override
    public PersonalSpital crearePersonal(String tip) {

        if (tip.equals("brancardier")) {
            return new Brancardier();
        } else {
            return null;
        }
    }
}