package testUnitaire;

import ingredients.Ingredient;
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

    /**
     * Préparation pour le banc de test pour l'inventaire.
     */
    @BeforeEach
    void setUp() {
        inventaire = Inventaire.getInventaire();
    }

    /**
     * Vérification de la fonction ajouter.
     */
    @Test
    void ajouter() {
        assertTrue(inventaire.getIngredientInventaire(new Ingredient("Banane")) == null, "Vérification avant l'ajout à l'inventaire.");
        inventaire.ajouter(new Ingredient("Banane"), 1);
        assertTrue(inventaire.getIngredientInventaire(new Ingredient("Banane")) != null, "Vérification de l'ajout à l'inventaire.");
    }

    /**
     * Vérification si nous pouvons accéder aux Ingrédients en inventaire.
     */
    @Test
    void getIngredientInventaire() {
        inventaire.ajouter(new Ingredient("Chocolat"), 1);
        inventaire.ajouter(new Ingredient("Nectar"), 2);
        inventaire.ajouter(new Ingredient("Jambon"), 3);
        inventaire.ajouter(new Ingredient("Corriande"), 4);
        assertTrue(inventaire.getIngredientInventaire(new Ingredient("Banane")) == null, "Vérification d'accès aux ingrédients de l'inventaire.");
        assertEquals(4,inventaire.getIngredientInventaire(new Ingredient("Corriande")).getQuantite(), "Vérification d'accès aux ingrédients de l'inventaire.");
        assertEquals(3,inventaire.getIngredientInventaire(new Ingredient("Jambon")).getQuantite(), "Vérification d'accès aux ingrédients de l'inventaire.");
        assertEquals(2,inventaire.getIngredientInventaire(new Ingredient("Nectar")).getQuantite(), "Vérification d'accès aux ingrédients de l'inventaire.");
        assertEquals(1,inventaire.getIngredientInventaire(new Ingredient("Chocolat")).getQuantite(), "Vérification d'accès aux ingrédients de l'inventaire.");
    }
}