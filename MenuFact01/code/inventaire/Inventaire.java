package inventaire;
/**
 * Classe pour linventaire des ingredients du systeme Menufact
 * @author Naomie L'archevêque Carrière
 * @author Yan Ha Routhier-Chevrier
 * @version 2.0
 */
import ingredients.Ingredient;
import ingredients.IngredientInventaire;

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
    public void ajouter (Ingredient ingredient, int quantite)
    {
        lesIngredients.add(new IngredientInventaire(ingredient, quantite));
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