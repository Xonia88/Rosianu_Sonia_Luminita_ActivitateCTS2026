package decorator.b7;

public class NotaConcreta implements NotaDePlata {

    @Override
    public void printeaza() {
        System.out.println("Nota de plata standard");
    }
}