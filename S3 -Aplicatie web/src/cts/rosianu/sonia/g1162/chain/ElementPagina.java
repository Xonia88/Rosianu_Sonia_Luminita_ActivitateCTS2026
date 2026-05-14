package cts.rosianu.sonia.g1162.chain;

public class ElementPagina implements Item{

    private String tip;
    private String continut;

    public ElementPagina(String tip, String continut) {
        this.tip = tip;
        this.continut = continut;
    }

    @Override
    public String getTip() {
        return tip;
    }

    @Override
    public String getContinut() {
        return continut;
    }

    @Override
    public void setContinut(String continut) {

        this.continut = continut;

    }
}
