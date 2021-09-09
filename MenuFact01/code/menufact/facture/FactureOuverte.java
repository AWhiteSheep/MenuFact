package menufact.facture;

import menufact.Client;
import menufact.facture.exceptions.FactureException;
import menufact.plats.PlatChoisi;
import menufact.plats.PlatImpossibleDeServir;

/**
 * L'état ouverte d'une facture du systeme Menufact
 * @author Naomie L'archevêque Carrière
 * @author Yan Ha Routhier-Chevrier
 * @version 2.0
 */
public class FactureOuverte extends FactureEtat{
    public FactureOuverte(Facture facture) {
        super(facture);
    }

    /**
     *
     * @param p le plat choisi
     */
    public void ajoutePlat(PlatChoisi p) {
        if(p.getEtat().getClass() != PlatImpossibleDeServir.class)
        {
            facture.addPlat(p);
        }
    }

    /**
     *
     * @param client le client de la facture
     * @throws FactureException
     */
    @Override
    public void associerClient(Client client) throws FactureException{
        facture.setClient(client);
    }

    /**
     * Change l'état de la facture à payee
     * @throws FactureException
     */
    @Override
    public void payer() throws FactureException{
        throw new FactureException("On peut payer une facture seulement sur une facture FERMER.");
    }

    /**
     * Change l'état de la facture à fermee
     */
    @Override
    public void fermer(){
        facture.changeState(new FactureFermee(facture));
    }

    /**
     * Change l'état de la facture à ouverte
     * @throws FactureException
     */
    @Override
    public void ouvrir() throws FactureException {
        throw new FactureException("On ne peut pas ouvrir une facture déjà OUVERTE.");
    }

    /**
     *
     * @return une chaîne de caractères avec l'état de la facture
     */
    @Override
    public String toString(){
        return "Ouverte";
    }
}
