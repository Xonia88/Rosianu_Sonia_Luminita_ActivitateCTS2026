package cts.rosianu.sonia.g1162.proxy;

import java.util.ArrayList;
import java.util.List;

public class ProxySpital implements ISpital {

   private ISpital spital;
   private List<Vizitator> vizitatori;


   public ProxySpital(ISpital spital) {
       this.spital = spital;
       this.vizitatori = new ArrayList<>();
   }

    @Override
    public void permiteAcces(Vizitator vizitator) {
        if(!vizitator.isAreScrisoareAcceptare()){

            System.out.println("Vizitatorul " + vizitator.getNume() + " nu are scrisoare de acceptare." );

            return;

        }

        vizitatori.add(vizitator);

        if(vizitatori.size() >= 3 ){
            System.out.println(
                    "\nPersonalul medical echipeaza vizitatorii.\n");
            for(Vizitator v : vizitatori){
                spital.permiteAcces(v);
            }

            vizitatori.clear();
        } else {
            System.out.println("Vizitatorul " +
                    vizitator.getNume() +
                    " asteapta in sala .");
        }
    }
}
