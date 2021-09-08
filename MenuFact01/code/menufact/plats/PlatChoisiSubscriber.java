package menufact.plats;

import ingredients.exceptions.IngredientException;

/**
 * Classe pour le subscriber du plat choisi du systeme Menufact
 * @author Naomie L'archevêque Carrière
 * @author Yan Ha Routhier-Chevrier
 * @version 2.0
 */
interface PlatChoisiSubscriber {

    /**
     * @param platChoisi le plat choisi
     */
    public void notifier(PlatChoisi platChoisi) throws IngredientException;

}
