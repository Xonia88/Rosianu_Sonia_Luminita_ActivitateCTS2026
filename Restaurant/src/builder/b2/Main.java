package builder.b2;

public class Main {
    public static void main(String[] args) {

        RezervareBuilder builder1 = new RezervareBuilder("Ion");
        builder1.setAsezareGeam(true);
        builder1.setDecorareMasa(true);

        Rezervare rezervare1 = builder1.build();

        RezervareBuilder builder2 = new RezervareBuilder("Maria");
        builder2.setMuzicaPersonalizata(true);

        Rezervare rezervare2 = builder2.build();

        System.out.println(rezervare1);
        System.out.println(rezervare2);
    }
}