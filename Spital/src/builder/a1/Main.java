package builder.a1;

public class Main {
    public static void main(String[] args) {

        PacientBuilder builder1 = new PacientBuilder("Ion");
        builder1.setPatRabatabil(true);
        builder1.setMicDejun(true);

        Pacient pacient1 = builder1.build();

        PacientBuilder builder2 = new PacientBuilder("Maria");
        builder2.setPapuciCamera(true);

        Pacient pacient2 = builder2.build();

        System.out.println(pacient1);
        System.out.println(pacient2);
    }
}