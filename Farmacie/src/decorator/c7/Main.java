package decorator.c7;

public class Main {
    public static void main(String[] args) {

        BonDeCasa bon = new BonConcret();

        System.out.println("Fara decorator:");
        bon.printeaza();

        System.out.println("---------------");

        BonDeCasa bonDecorat = new DecoratorFelicitare(bon);

        System.out.println("Cu decorator:");
        bonDecorat.printeaza();
    }
}