package composite.b8;

public class Item implements ComponentaMeniu {

    private String nume;

    public Item(String nume) {
        this.nume = nume;
    }

    @Override
    public void descriere() {
        System.out.println("Item: " + nume);
    }
}