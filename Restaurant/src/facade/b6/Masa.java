package facade.b6;

public class Masa {

    private boolean libera;

    public Masa(boolean libera) {
        this.libera = libera;
    }

    public boolean esteLibera() {
        System.out.println("Se verifica daca masa este libera...");
        return libera;
    }
}