package menufact.facture;

import menufact.Client;
import menufact.facture.exceptions.FactureException;
import menufact.plats.PlatChoisi;

/**
 * L'état fermee d'une facture du systeme Menufact
 * @author Naomie L'archevêque Carrière
 * @author Yan Ha Routhier-Chevrier
 * @version 2.0
 */
public class FactureFermee extends FactureEtat{
    public FactureFermee(Facture facture) {
        super(facture);
    }

    /**
     *
     * @param p le plat choisi
     * @throws FactureException
     */
    public void ajoutePlat(PlatChoisi p) throws FactureException {
        throw new FactureException("On peut ajouter un plat seulement sur une facture OUVERTE.");
    }

    /**
     *
     * @param client le client de la facture
     * @throws FactureException
     */
    @Override
    public void associerClient(Client client) throws FactureException{
        if(facture.getClient() != null)
            throw new FactureException("Le client ne peut pas être modifier lorsque la facture est FERMEE");
        else
            facture.setClient(client);
    }

    /**
     * Change l'état de la facture à PAYEE
     */
    @Override
    public void payer(){
        facture.changeState(new FacturePayee(facture));
    }

    /**
     * Change l'état de la facture à FERMEE
     * @throws FactureException
     */
    @Override
    public void fermer() throws FactureException {
        throw new FactureException("On ne peut pas fermer un facture déjà FERMÉE.");
    }

    /**
     * Change l'état de la facture à OUVERTE
     */
    @Override
    public void ouvrir(){
        facture.changeState(new FactureOuverte(facture));
    }

    /**
     *
     * @return une chaîne de caractères avec l'état de la facture
     */
    @Override
    public String toString(){
        return "Fermee";
    }
}
