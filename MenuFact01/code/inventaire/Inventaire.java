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

public class Inventaire {
    private static Inventaire inventaire;
    private ArrayList<IngredientInventaire> lesIngredients = new ArrayList<IngredientInventaire>();

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
        lesIngredients.add(new IngredientInventaire(ingredient, quantite));
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
        for(IngredientInventaire IngInv: lesIngredients) {
            if (IngInv.getNom() == ingredient.getNom())
                return IngInv;
        }
        return null;
    }
}