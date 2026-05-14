package cts.rosianu.sonia.g1162.chain;

public class FiltruTextNegru extends Filtru{
    @Override
    public void proceseaza(PaginaWeb paginaWeb) {

        for(Item item : paginaWeb.getIteme()) {

            if (item.getTip().equalsIgnoreCase("paragraf")) {

                item.setContinut(
                        " [TEXT STANDARD] "
                        + item.getContinut());
            }
        }

        System.out.println("Filtru aplicat");

        trimitereMaiDeparte(paginaWeb);
    }
}
