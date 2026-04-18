package decorator.b7;

public class DecoratorFelicitare extends DecoratorAbstract {

    public DecoratorFelicitare(NotaDePlata nota) {
        super(nota);
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