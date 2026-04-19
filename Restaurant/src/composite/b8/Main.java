package composite.b8;

public class Main {
    public static void main(String[] args) {

        Item apa = new Item("Apa plata");
        Item cafea = new Item("Cafea");
        Item suc = new Item("Suc");

        Sectiune bauturi = new Sectiune("Bauturi");
        bauturi.adauga(apa);
        bauturi.adauga(cafea);

        Sectiune racoritoare = new Sectiune("Racoritoare");
        racoritoare.adauga(suc);

        Sectiune meniu = new Sectiune("Meniu");
        meniu.adauga(bauturi);
        meniu.adauga(racoritoare);

        meniu.descriere();
    }
}