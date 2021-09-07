package inventaire;

import ingredients.Ingredient;
import ingredients.IngredientInventaire;

import java.util.ArrayList;

public class Inventaire {
    private ArrayList<IngredientInventaire> lesIngredients = new ArrayList<IngredientInventaire>();

    public void ajouter (Ingredient ingredient, int quantite)
    {
        lesIngredients.add(new IngredientInventaire(ingredient, quantite));
    }

}
