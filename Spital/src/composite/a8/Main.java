package composite.a8;

public class Main {
    public static void main(String[] args) {

        Sectie s1 = new Sectie("Cardiologie");
        Sectie s2 = new Sectie("Neurologie");
        Sectie s3 = new Sectie("Pediatrie");

        Departament departament1 = new Departament("Medical");
        departament1.adaugaStructura(s1);
        departament1.adaugaStructura(s2);

        Departament departament2 = new Departament("General");
        departament2.adaugaStructura(departament1);
        departament2.adaugaStructura(s3);

        departament2.descriere();
    }
}