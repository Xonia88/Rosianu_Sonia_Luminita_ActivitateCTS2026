package prototype.c4;

public class Main {
    public static void main(String[] args) {

        Reteta reteta1 = new RetetaConcreta("Paracetamol", 10);

        Reteta reteta2 = reteta1.copiaza();
        Reteta reteta3 = reteta1.copiaza();

        System.out.println(reteta1);
        System.out.println(reteta2);
        System.out.println(reteta3);
    }
}