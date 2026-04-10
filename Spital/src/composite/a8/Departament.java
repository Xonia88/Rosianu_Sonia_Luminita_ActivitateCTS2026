package composite.a8;

import java.util.ArrayList;
import java.util.List;

public class Departament implements Structura {

    private String nume;
    private List<Structura> lista = new ArrayList<>();

    public Departament(String nume) {
        this.nume = nume;
    }

    public void adaugaStructura(Structura s) {
        lista.add(s);
    }

    @Override
    public void descriere() {
        System.out.println("Departament: " + nume);

        for (Structura s : lista) {
            s.descriere();
        }
    }
}