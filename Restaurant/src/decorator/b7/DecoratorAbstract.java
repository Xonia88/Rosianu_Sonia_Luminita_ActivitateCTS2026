package decorator.b7;

public abstract class DecoratorAbstract implements NotaDePlata {

    protected NotaDePlata nota;

    public DecoratorAbstract(NotaDePlata nota) {
        this.nota = nota;
    }

    @Override
    public void printeaza() {
        nota.printeaza();
    }
}