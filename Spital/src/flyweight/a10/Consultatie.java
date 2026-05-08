package flyweight.a10;

public class Consultatie {

    private String data;

    public Consultatie(String data) {
        this.data = data;
    }

    public void afisare(Pacient pacient) {
        pacient.afisare();
        System.out.println("Consultatie la data: " + data);
    }
}