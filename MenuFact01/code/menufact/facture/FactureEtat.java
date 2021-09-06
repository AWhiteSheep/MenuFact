package menufact.facture;

import menufact.Client;
import menufact.facture.exceptions.FactureException;
import menufact.plats.PlatChoisi;

public class FactureEtat {
    protected Facture facture;

    public FactureEtat(Facture facture) {
        this.facture = facture;
    }

    /**
     *
     * @param client le client de la facture
     * @throws FactureException
     */
    public void associerClient(Client client) throws FactureException {}

    /**
     *
     * @param p le plat choisi
     * @throws FactureException
     */
    public void ajoutePlat(PlatChoisi p) throws FactureException {}

    /**
     * Change l'état de la facture à PAYEE
     * @throws FactureException
     */
    public void payer() throws FactureException {}

    /**
     * Change l'état de la facture à FERMEE
     */
    public void fermer() throws FactureException {}

    /**
     *
     * @throws FactureException
     */
    public void ouvrir() throws FactureException {}

    /**
     *
     * @return une chaîne de caractères avec l'état de la facture
     */
    public String toString(){
        return "Acune etat";
    }
}
