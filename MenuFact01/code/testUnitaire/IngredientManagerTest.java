package testUnitaire;

import ingredients.Ingredient;
import ingredients.IngredientManager;
import inventaire.Inventaire;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Classe test pour la gestion des ingrédients du systeme Menufact.
 * @author Naomie L'archevêque Carrière
 * @author Yan Ha Routhier-Chevrier
 * @version 2.0
 */
class IngredientManagerTest {
    private IngredientManager ingredientManager;
    private int ingredientManagerHash;
    /**
     * Construction du ingredient manager
     */
    @BeforeEach
    void setUp() {
        ingredientManager = IngredientManager.getIngredientManager();
        Inventaire inventaire = Inventaire.getInventaire();
        ingredientManager.setInventaire(inventaire);
        inventaire.ajouter(new Ingredient("Brownie"), 3);
        ingredientManagerHash = ingredientManager.hashCode();
    }

    /**
     * Vérification si il retourne bien Ingredient Manager le seul, devrait être un singleton.
     */
    @Test
    void getIngredientManager() {
        assertEquals(ingredientManagerHash, IngredientManager.getIngredientManager().hashCode());
    }

    /**
     * Vérification si nous somme en mesure de vérifier l'inventaire pour un ingredient.
     */
    @Test
    void verifyInventory() {
        assertTrue(ingredientManager.verifyInventory(new Ingredient("Brownie"), 3), "Vérification si nous sommes en mesure de vérifier la disponibilité d'un ingrédient en inventaire.");
        assertFalse(ingredientManager.verifyInventory(new Ingredient("Brownie"), 5), "Vérificatioon si ramène false si moins en inventaire.");
    }
}