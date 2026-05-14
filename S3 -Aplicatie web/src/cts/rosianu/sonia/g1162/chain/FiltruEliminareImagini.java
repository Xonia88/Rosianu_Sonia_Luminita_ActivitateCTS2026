package cts.rosianu.sonia.g1162.chain;

import java.util.Iterator;

public class FiltruEliminareImagini extends Filtru {

    @Override
    public void proceseaza(PaginaWeb paginaWeb) {

        Iterator<Item> iterator = paginaWeb.getIteme().iterator();
        while(iterator.hasNext()) {
            Item item = iterator.next();
            if(item.getTip().equalsIgnoreCase("imagine")) {

                iterator.remove();
            }
        }

        System.out.println("Filtru Eliminare");

        trimitereMaiDeparte(paginaWeb);

    }
}
