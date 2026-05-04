package facade.c6;

public class FacadeFarmacie {

    public boolean verificaClient() {

        Reteta reteta = new Reteta();
        Depozit depozit = new Depozit();
        CardSanatate card = new CardSanatate();

        if (reteta.esteValida() &&
                depozit.verificaStoc() &&
                card.verificaCard()) {

            System.out.println("Clientul poate cumpara medicamente.");
            return true;
        } else {
            System.out.println("Clientul nu poate cumpara medicamente.");
            return false;
        }
    }
}