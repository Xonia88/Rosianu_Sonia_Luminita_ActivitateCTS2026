package cts.rosianu.sonia.g1162.chain;

public abstract class Filtru {

    protected Filtru urmatorulFiltru;

    public void setUrmatorulFiltru(Filtru urmatorulFiltru) {
        this.urmatorulFiltru = urmatorulFiltru;
    }

    public abstract void proceseaza (PaginaWeb paginaWeb);

    protected void trimitereMaiDeparte (PaginaWeb paginaWeb) {

        if(urmatorulFiltru != null) {

            urmatorulFiltru.proceseaza(paginaWeb);
        }
    }
}
