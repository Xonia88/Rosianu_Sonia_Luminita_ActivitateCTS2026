package cts.rosianu.sonia.g1162.main;

import cts.rosianu.sonia.g1162.composite.Regiune;
import cts.rosianu.sonia.g1162.composite.Virus;
import cts.rosianu.sonia.g1162.proxy.ISpital;
import cts.rosianu.sonia.g1162.proxy.ProxySpital;
import cts.rosianu.sonia.g1162.proxy.Spital;
import cts.rosianu.sonia.g1162.proxy.Vizitator;


public class Main {
    public static void main(String[] args) {

        //PROXY
        ISpital proxySpital = new ProxySpital(new Spital());

        Vizitator vizitator1 = new Vizitator("Ana", true);
        Vizitator vizitator2 = new Vizitator("Gigi", true);
        Vizitator vizitator3 = new Vizitator("Ion", true);
        Vizitator vizitator4 = new Vizitator("Vica", true);
        Vizitator vizitator5 = new Vizitator("Mihai", false);


        proxySpital.permiteAcces(vizitator1);
        proxySpital.permiteAcces(vizitator2);
        proxySpital.permiteAcces(vizitator3);
        proxySpital.permiteAcces(vizitator4);
        proxySpital.permiteAcces(vizitator5);

        //composite
        Regiune europa =
                new Regiune("Europa");

        Regiune asia =
                new Regiune("Asia");



        Regiune romania =
                new Regiune("Romania");

        Regiune germania =
                new Regiune("Germania");

        Regiune china =
                new Regiune("China");



        Virus covid =
                new Virus(
                        "Covid-19",
                        10000,
                        "Aer",
                        "Ridicata");

        Virus delta =
                new Virus(
                        "Delta",
                        4000,
                        "Aer",
                        "Medie");

        Virus omicron =
                new Virus(
                        "Omicron",
                        7000,
                        "Aer",
                        "Scazuta");

        Virus gripa =
                new Virus(
                        "Gripa",
                        3000,
                        "Contact",
                        "Medie");



        romania.adaugaNod(covid);
        romania.adaugaNod(gripa);

        germania.adaugaNod(delta);

        china.adaugaNod(omicron);

        europa.adaugaNod(romania);
        europa.adaugaNod(germania);

        asia.adaugaNod(china);

        europa.afisare(0);

        System.out.println();

        asia.afisare(0);



        System.out.println(
                "\nTotal cazuri Europa: " +
                        europa.getNumarTotalCazuri());

        System.out.println(
                "Total cazuri Asia: " +
                        asia.getNumarTotalCazuri());

        System.out.println(
                "Total general: " +
                        (europa.getNumarTotalCazuri()
                                + asia.getNumarTotalCazuri()));
    }
}
