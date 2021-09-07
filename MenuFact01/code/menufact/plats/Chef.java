
package menufact.plats;

import ingredients.IngredientInventaire;
import ingredients.IngredientManager;
import ingredients.IngredientPlat;

public class Chef implements PlatChoisiSubscriber{

    private IngredientManager ingredientManager;

    /**
     * @param platchoisi le plat choisi
     */
    @Override
    public void notifier(PlatChoisi platchoisi){
        changerEtatPlat(platchoisi);
    }

    /**
     * Change l'etat du plat
     * @param platchoisi le plat choisi
     */
    public void changerEtatPlat(PlatChoisi platchoisi ) {

        //regarder dans inventaire avant de changer etat
        for(int i = 0; i< platchoisi.getQuantite(); i++){
            boolean cannotBeCreated= false;
            for (IngredientPlat ingredientPlat: platchoisi.getPlat().getIngredients()) {
                if(!ingredientManager.verifyInventory(ingredientPlat.getIngredient(), ingredientPlat.getQuantity())) {
                    platchoisi.changeState((new PlatImpossibleDeServir((platchoisi))));
                    cannotBeCreated = true;
                    continue;
                }
            }
            if(!cannotBeCreated)
                platchoisi.changeState(new PlatEnPreparation(platchoisi));
        }


    }
}
