package factory.a3;

public class Brancardier implements PersonalSpital {

    @Override
    public void descriere() {
        System.out.println("Brancardier - personal non-medical");
    }
}