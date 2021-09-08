package inventaire;
/**
 * Classe pour linventaire des ingredients du systeme Menufact
 * @author Naomie L'archevêque Carrière
 * @author Yan Ha Routhier-Chevrier
 * @version 2.0
 */
import ingredients.Ingredient;
import ingredients.IngredientInventaire;
import ingredients.exceptions.IngredientException;

import java.util.ArrayList;
import java.util.HashMap;

public class Inventaire {
    private static Inventaire inventaire;
    private HashMap<Ingredient, IngredientInventaire> lesIngredients = new HashMap<>();

    private Inventaire(){};

    /**
     *
     * @return linstance de linventaire
     */
    public static Inventaire getInventaire() {
        if(inventaire == null)
            inventaire = new Inventaire();

        return inventaire;
    }

    /**
     * pour ajouter un ingredient a linventaire
     * @param ingredient lingredient a ajouter
     * @param quantite la quantite de lingredient que lon ajoute
     */
    public void ajouter (Ingredient ingredient, double quantite)
    {
        if(!lesIngredients.containsKey(ingredient))
            lesIngredients.put(ingredient, new IngredientInventaire(ingredient, quantite));
        else {
            IngredientInventaire ingredientInventaire = lesIngredients.get(ingredient);
            try {
                ingredientInventaire.setQuantite(ingredientInventaire.getQuantite() + quantite);
            } catch (IngredientException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     *
     * @param ingredient L'ingredient a remove
     * @param quantite la quantité d'ingrédient dans le plat
     */
    public void remove(Ingredient ingredient, double quantite) throws IngredientException {
        IngredientInventaire ingredientInventaire = this.getIngredientInventaire(ingredient);
        ingredientInventaire.setQuantite(ingredientInventaire.getQuantite() - quantite);
    }

    /**
     * obtenir lingredient ainsi que sa quantite
     * @param ingredient lingredient que lon veut obtenir
     * @return lingredient ainsi que sa quantite
     */
    public IngredientInventaire getIngredientInventaire(Ingredient ingredient) {
        return lesIngredients.get(ingredient);
    }

    /**
     * Création d'une nouvelle instance d'inventaire.
     */
    public static void resetInventory() {
        inventaire = new Inventaire();
    }
}