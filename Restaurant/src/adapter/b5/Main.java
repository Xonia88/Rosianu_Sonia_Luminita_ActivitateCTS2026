package adapter.b5;

public class Main {
    public static void main(String[] args) {

        SoftBucatarie bucatarie = new SoftBucatarie();
        bucatarie.printeazaFactura();

        System.out.println("---------------");

        SoftBar bar = new SoftBar();
        SoftBucatarie adapter = new AdapterBar(bar);

        adapter.printeazaFactura();
    }
}