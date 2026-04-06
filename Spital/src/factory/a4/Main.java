package factory.a4;

public class Main {
    public static void main(String[] args) {

        Reteta retetaOriginala = new RetetaConcreta("Paracetamol", 10);

        Reteta retetaCopie1 = retetaOriginala.copiaza();
        Reteta retetaCopie2 = retetaOriginala.copiaza();

        System.out.println(retetaOriginala);
        System.out.println(retetaCopie1);
        System.out.println(retetaCopie2);
    }
}