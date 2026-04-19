package composite.b8;

import java.util.ArrayList;
import java.util.List;

public class Sectiune implements ComponentaMeniu {

    private String nume;
    private List<ComponentaMeniu> lista = new ArrayList<>();

    public Sectiune(String nume) {
        this.nume = nume;
    }

    public void adauga(ComponentaMeniu c) {
        lista.add(c);
    }

    @Override
    public void descriere() {
        System.out.println("Sectiune: " + nume);

        for (ComponentaMeniu c : lista) {
            c.descriere();
        }
    }
}