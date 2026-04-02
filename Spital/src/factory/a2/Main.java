package factory.a2;

public class Main {
    public static void main(String[] args) {

        FactoryPersonal factory = new FactoryPersonal();

        PersonalSpital p1 = factory.crearePersonal(TipPersonal.MEDIC);
        PersonalSpital p2 = factory.crearePersonal(TipPersonal.ASISTENT);
        PersonalSpital p3 = factory.crearePersonal(TipPersonal.BRANCARDIER);

        p1.descriere();
        p2.descriere();
        p3.descriere();
    }
}