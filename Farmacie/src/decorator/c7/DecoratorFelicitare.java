package decorator.c7;

public class DecoratorFelicitare extends DecoratorAbstract {

    public DecoratorFelicitare(BonDeCasa bon) {
        super(bon);
    }

    @Override
    public void printeaza() {
        super.printeaza();
        adaugaFelicitare();
    }

    private void adaugaFelicitare() {
        System.out.println("La multi ani!");
    }
}