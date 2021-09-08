package ingredients;

import inventaire.Inventaire;
import inventaire.Inventaire.*;
//VIEW
public class IngredientManager {
    private static IngredientManager manager;
    private Inventaire inventaire;

    private IngredientManager(){

    }

    /**
     *
     * @return l'instance du manager.
     */
    public static IngredientManager getIngredientManager(){
        if(manager == null)
            manager = new IngredientManager();

        return manager;
    }

    /**
     *
     * @param inventaire L'inventaire pour le manager.
     */
    public void setInventaire(Inventaire inventaire) {
        manager.inventaire = inventaire;
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
