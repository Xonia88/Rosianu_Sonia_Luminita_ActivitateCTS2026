package builder.c3;

public class Main {
    public static void main(String[] args) {

        FacturaBuilder builder1 = new FacturaBuilder("Ion");
        builder1.setNumarPungi(2);
        builder1.setPlataCuCard(true);

        Factura f1 = builder1.build();

        FacturaBuilder builder2 = new FacturaBuilder("Maria");
        builder2.setCardFidelitate(true);
        builder2.setCotaTVA(19);

        Factura f2 = builder2.build();

        System.out.println(f1);
        System.out.println(f2);
    }
}