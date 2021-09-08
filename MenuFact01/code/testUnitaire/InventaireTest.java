package testUnitaire;

import ingredients.*;
import inventaire.Inventaire;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Classe test pour l'inventaire du systeme Menufact.
 * @author Naomie L'archevêque Carrière
 * @author Yan Ha Routhier-Chevrier
 * @version 2.0
 */
class InventaireTest {
    private Inventaire inventaire;
    private Fruit ingredient1;
    private Epice ingredient2;
    private Viande ingredient3;
    private Laitier ingredient4;
    private Fruit ingredient5;

    /**
     * Préparation pour le banc de test pour l'inventaire.
     */
    @BeforeEach
    void setUp() {
        Inventaire.resetInventory();
        inventaire = Inventaire.getInventaire();
        ingredient1 = new Fruit("Banana");
        ingredient2 = new Epice("Chocolate");
        ingredient3 = new Viande("Ham");
        ingredient4 = new Laitier("Cheese");
        ingredient5 = new Fruit("Tomato");
    }

    /**
     * Vérification de la fonction ajouter.
     */
    @Test
    void ajouter() {
        assertTrue(inventaire.getIngredientInventaire(ingredient1) == null, "Vérification avant l'ajout à l'inventaire.");
        assertTrue(inventaire.getIngredientInventaire(ingredient2) == null, "Vérification avant l'ajout à l'inventaire.");
        assertTrue(inventaire.getIngredientInventaire(ingredient3) == null, "Vérification avant l'ajout à l'inventaire.");
        assertTrue(inventaire.getIngredientInventaire(ingredient4) == null, "Vérification avant l'ajout à l'inventaire.");
        inventaire.ajouter(ingredient1, 1);
        assertTrue(ingredient1.equals(inventaire.getIngredientInventaire(ingredient1).getIngredient()), "Vérification de l'ajout à l'inventaire.");
        Ingredient notRealIngredient1 = new Ingredient("Banana");
        inventaire.ajouter(notRealIngredient1, 1);
        assertFalse(ingredient1.equals(inventaire.getIngredientInventaire(notRealIngredient1).getIngredient()), "Vérification de l'ajout à l'inventaire.");
    }

    /**
     * Vérification si nous pouvons accéder aux Ingrédients en inventaire.
     */
    @Test
    void getIngredientInventaire() {
        inventaire.ajouter(ingredient2, 1);
        inventaire.ajouter(ingredient3, 2);
        inventaire.ajouter(ingredient4, 3);
        inventaire.ajouter(ingredient5, 4);
        assertFalse(inventaire.getIngredientInventaire(ingredient2) == null, "Vérification d'accès aux ingrédients de l'inventaire.");
        assertEquals(4,inventaire.getIngredientInventaire(ingredient5).getQuantite(), "Vérification d'accès aux ingrédients de l'inventaire.");
        assertEquals(3,inventaire.getIngredientInventaire(ingredient4).getQuantite(), "Vérification d'accès aux ingrédients de l'inventaire.");
        assertEquals(2,inventaire.getIngredientInventaire(ingredient3).getQuantite(), "Vérification d'accès aux ingrédients de l'inventaire.");
        assertEquals(1,inventaire.getIngredientInventaire(ingredient2).getQuantite(), "Vérification d'accès aux ingrédients de l'inventaire.");
    }
}