package testUnitaire;

import ingredients.Ingredient;
import ingredients.IngredientInventaire;
import ingredients.exceptions.IngredientException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * Classe test pour linventaire des ingredients du systeme Menufact
 * @author Naomie L'archevêque Carrière
 * @author Yan Ha Routhier-Chevrier
 * @version 2.0
 */
class IngredientInventaireTest {
    IngredientInventaire ingredientinventaire;
    Ingredient ingredient1;

    /**
     * preparation du banc de test de linventaire des ingredients
     */
    @BeforeEach
    void setUp() {
        this.ingredient1 = new Ingredient("patate");
        this.ingredientinventaire = new IngredientInventaire(ingredient1, 3);

    }

    /**
     * test pour obtenir la quantite de lingredient
     */
    @Test
    void getQuantite() {
        assertEquals(3, ingredientinventaire.getQuantite());
    }

    /**
     * test pour set la quantite dun ingredient
     */
    @Test
    void setQuantite() {
        try{
            ingredientinventaire.setQuantite(10);
        } catch(IngredientException ie)
        {
            System.out.println(ie.getMessage());
        }

        assertEquals(10, ingredientinventaire.getQuantite());
    }
}