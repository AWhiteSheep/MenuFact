
package menufact.plats;

import ingredients.IngredientInventaire;
import ingredients.IngredientManager;
import ingredients.IngredientPlat;
import ingredients.exceptions.IngredientException;

/**
 * Classe pour le chef du systeme Menufact
 * @author Naomie L'archevêque Carrière
 * @author Yan Ha Routhier-Chevrier
 * @version 2.0
 */
public class Chef implements PlatChoisiSubscriber{

    private IngredientManager ingredientManager;

    /**
     * @param platchoisi le plat choisi
     */
    @Override
    public void notifier(PlatChoisi platchoisi) throws IngredientException {
        changerEtatPlat(platchoisi);
    }

    /**
     * Change l'etat du plat lorsqu'il recoit une notification de la par de PlatChoisi
     * @param platchoisi le plat choisi
     */
    public void changerEtatPlat(PlatChoisi platchoisi ) throws IngredientException {
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
            {
                platchoisi.changeState(new PlatEnPreparation(platchoisi));
                for (IngredientPlat ingredientPlat: platchoisi.getPlat().getIngredients()) {
                    ingredientManager.remove(ingredientPlat.getIngredient(), ingredientPlat.getQuantity());
                }
            }
        }
    }
}
