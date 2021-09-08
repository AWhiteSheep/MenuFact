package menufact.plats;

import ingredients.Ingredient;
import ingredients.exceptions.IngredientException;
import menufact.plats.PlatAuMenu;

import java.util.ArrayList;
import java.util.concurrent.Flow;
/**
 * Classe pour le plat choisi du systeme Menufact
 * @author Naomie L'archevêque Carrière
 * @author Yan Ha Routhier-Chevrier
 * @version 2.0
 */

public class PlatChoisi {
    private PlatAuMenu plat;
    private double quantite;
    private PlatEtat etat;
    private ArrayList<PlatChoisiSubscriber> subscribers = new ArrayList<PlatChoisiSubscriber>();

    /**
     * @param newsub le subscriber a ajouter
     */
    public void addSubscriber(PlatChoisiSubscriber newsub){
        if(newsub != null)
            subscribers.add(newsub);
    }

    /**
     * @param deletesub le subscriber a enlever
     */
    public void removeSubscriber(PlatChoisiSubscriber deletesub){
        if(subscribers.contains(deletesub))
            subscribers.remove(deletesub);
    }

    /**
     * Notifier tous les subscribers qu'un plat a été choisi
     */
    public void notifierSubscriber() throws IngredientException {
       for(PlatChoisiSubscriber platchoisisub: subscribers) {
            platchoisisub.notifier(this);
       }
    }

    public PlatChoisi(PlatAuMenu plat, double quantite) {
        this.etat = new PlatCommande(this);
        this.plat = plat;
        this.quantite = quantite;
    }

    /**
     * Fonction devant être appelé dans les classes enfants de PlatEtat
     * @param etat Le vouvelle état pour le plat choisi
     */
    public void changeState(PlatEtat etat) { this.etat = etat; }

    @Override
    public String toString() {
        return "menufact.plats.PlatChoisi{" +
                "quantite=" + quantite +
                ", plat=" + plat +
                '}';
    }

    public double getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public PlatAuMenu getPlat() {
        return plat;
    }

    public PlatEtat getEtat() { return etat; }

    public int CountSubscriber() {
        return subscribers.size();
    }
}
