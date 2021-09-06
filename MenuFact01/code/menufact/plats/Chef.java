//TODO: IMPLEMENTER CHANGER L'ETAT DU PLAT

package menufact.plats;

import ingredients.IngredientInventaire;
import ingredients.IngredientManager;

public class Chef implements PlatChoisiSubscriber{

    /**
     * @param platchoisi le plat choisi
     */
    @Override
    public void notifier(PlatChoisi platchoisi){
        //set l'etat du plat
        changerEtatPlat(platchoisi /*, etatplat*/);
    }

    /**
     * Change l'etat du plat
     * @param platchoisi le plat choisi
     */
    public void changerEtatPlat(PlatChoisi platchoisi /*, etatplat*/) {
        //j'ai besoin de l'etat des plats
        //regarder dans inventaire avant de changer etat
    }
}
