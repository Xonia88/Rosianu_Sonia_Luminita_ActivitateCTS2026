package facade.b6;

public class Main {
    public static void main(String[] args) {

        Masa masa = new Masa(true);

        FacadeRezervare facade = new FacadeRezervare();
        facade.ocupaMasa(masa);
    }
}