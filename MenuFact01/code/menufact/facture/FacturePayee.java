package menufact.facture;

import menufact.Client;
import menufact.facture.exceptions.FactureException;
import menufact.plats.PlatChoisi;

public class FacturePayee extends FactureEtat{
    public FacturePayee(Facture facture) {
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
            throw new FactureException("Le client ne peut pas être modifier lorsque la facture est PAYEE");
        else
            facture.setClient(client);
    }

    /**
     * Change l'état de la facture à PAYEE
     * @throws FactureException
     */
    @Override
    public void payer() throws FactureException {
        throw new FactureException("On ne peut pas payer une facture déjà PAYER.");
    }

    /**
     * Change l'état de la facture à FERMEE
     * @throws FactureException
     */
    @Override
    public void fermer() throws FactureException {
        throw new FactureException("On ne peut pas fermer une facture PAYER.");
    }

    /**
     * Change l'état de la facture à OUVERTE
     * @throws FactureException
     */
    @Override
    public void ouvrir() throws FactureException {
        throw new FactureException("On ne peut pas ouvrir une facture déjà PAYER.");
    }

    /**
     *
     * @return une chaîne de caractères avec l'état de la facture
     */
    @Override
    public String toString(){
        return "Payee";
    }
}
