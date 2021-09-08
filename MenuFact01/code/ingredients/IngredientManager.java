package ingredients;

import ingredients.exceptions.IngredientException;
import inventaire.Inventaire;
import inventaire.Inventaire.*;

/**
 * Classe pour le gestionnaire d'ingrédient de linventaire du systeme Menufact
 * @author Naomie L'archevêque Carrière
 * @author Yan Ha Routhier-Chevrier
 * @version 2.0
 */
public class IngredientManager {
    private static IngredientManager manager;
    private Inventaire inventaire;

    /**
     * Constructeur par défault du gestionnaire
     */
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

    public void remove(Ingredient ingredient, double quantite) throws IngredientException {
        inventaire.remove(ingredient,quantite);
    }
}
