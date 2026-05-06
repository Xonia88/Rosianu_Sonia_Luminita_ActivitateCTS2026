package composite.c8;

import java.util.ArrayList;
import java.util.List;

public class Sectiune implements Componenta {

    private String nume;
    private List<Componenta> lista = new ArrayList<>();

    public Sectiune(String nume) {
        this.nume = nume;
    }

    public void adauga(Componenta c) {
        lista.add(c);
    }

    @Override
    public void descriere() {
        System.out.println("Sectiune: " + nume);

        for (Componenta c : lista) {
            c.descriere();
        }
    }
}