package decorator.b7;

public class Main {
    public static void main(String[] args) {

        NotaDePlata nota = new NotaConcreta();

        System.out.println("Fara decorator:");
        nota.printeaza();

        System.out.println("---------------");

        NotaDePlata notaDecorata = new DecoratorFelicitare(nota);

        System.out.println("Cu decorator:");
        notaDecorata.printeaza();
    }
}