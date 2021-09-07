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
        //change l'etat du plat
        changerEtatPlat(platchoisi);
    }

    /**
     * Change l'etat du plat
     * @param platchoisi le plat choisi
     */
    public void changerEtatPlat(PlatChoisi platchoisi ) {

        //regarder dans inventaire avant de changer etat
        platchoisi.changeState(new PlatEnPreparation(platchoisi));
    }
}
