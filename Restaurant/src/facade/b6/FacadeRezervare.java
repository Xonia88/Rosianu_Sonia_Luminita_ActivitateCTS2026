package facade.b6;

public class FacadeRezervare {

    public boolean ocupaMasa(Masa masa) {

        Ospatar ospatar = new Ospatar();
        Manager manager = new Manager();

        if (masa.esteLibera() &&
                ospatar.esteCurata() &&
                manager.areServetele()) {

            System.out.println("Masa poate fi ocupata!");
            return true;
        } else {
            System.out.println("Masa nu este pregatita.");
            return false;
        }
    }
}