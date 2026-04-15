package adapter.b5;

public class AdapterBar extends SoftBucatarie {

    private SoftBar softBar;

    public AdapterBar(SoftBar softBar) {
        this.softBar = softBar;
    }

    @Override
    public void printeazaFactura() {
        System.out.println("Adaptare bar la bucatarie...");
        softBar.afiseazaNota();
    }
}