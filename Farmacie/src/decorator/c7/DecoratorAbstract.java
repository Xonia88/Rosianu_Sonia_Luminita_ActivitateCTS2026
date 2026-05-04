package decorator.c7;

public abstract class DecoratorAbstract implements BonDeCasa {

    protected BonDeCasa bon;

    public DecoratorAbstract(BonDeCasa bon) {
        this.bon = bon;
    }

    @Override
    public void printeaza() {
        bon.printeaza();
    }
}