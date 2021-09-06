package menufact.facture;

import menufact.Client;
import menufact.facture.exceptions.FactureException;
import menufact.plats.PlatChoisi;

/**
 * L'état d'une facture du systeme Menufact
 * @author Naomie L'archevêque Carrière
 * @author Yan Ha Routhier-Chevrier
 * @version 2.0
 */
public abstract class FactureEtat {
    protected Facture facture;

    public FactureEtat(Facture facture) {
        this.facture = facture;
    }

    /**
     *
     * @param client le client de la facture
     * @throws FactureException
     */
    public abstract void associerClient(Client client) throws FactureException;

    /**
     *
     * @param p le plat choisi
     * @throws FactureException
     */
    public abstract void ajoutePlat(PlatChoisi p) throws FactureException;

    /**
     * Change l'état de la facture à PAYEE
     * @throws FactureException
     */
    public abstract void payer() throws FactureException;

    /**
     * Change l'état de la facture à FERMEE
     */
    public abstract void fermer() throws FactureException;

    /**
     *
     * @throws FactureException
     */
    public abstract void ouvrir() throws FactureException;

    /**
     *
     * @return une chaîne de caractères avec l'état de la facture
     */
    public String toString(){
        return "Acune etat";
    }
}
