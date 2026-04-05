package factory.a3;

public class Main {
    public static void main(String[] args) {

        FactoryPersonal factoryMedical = new FactoryPersonalMedical();
        FactoryPersonal factoryNonMedical = new FactoryPersonalNonMedical();

        PersonalSpital p1 = factoryMedical.crearePersonal("medic");
        PersonalSpital p2 = factoryMedical.crearePersonal("asistent");
        PersonalSpital p3 = factoryNonMedical.crearePersonal("brancardier");

        p1.descriere();
        p2.descriere();
        p3.descriere();
    }
}