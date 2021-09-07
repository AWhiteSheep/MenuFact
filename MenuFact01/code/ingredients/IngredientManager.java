package ingredients;

import inventaire.Inventaire;
import inventaire.Inventaire.*;
//VIEW
public class IngredientManager {
    private IngredientManager manager;
    private Inventaire inventaire;

    private IngredientManager(){

    }

    /**
     *
     * @return l'instance du manager
     */
    public IngredientManager getIngredientManager(){
        if(manager == null)
            manager = new IngredientManager();

        return manager;
    }

    /**
     *
     * @param ingredient l'ingredient a verifier
     * @param Quantity la quantite a verifier?
     */
    public boolean verifyInventory(Ingredient ingredient, double Quantity) {
        return inventaire.getIngredientInventaire(ingredient).getQuantite()>= Quantity;

    }
}
