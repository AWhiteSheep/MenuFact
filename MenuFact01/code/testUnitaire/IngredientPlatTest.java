package testUnitaire;

import ingredients.Ingredient;
import ingredients.IngredientPlat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Classe test pour les ingredients d'un plat du systeme Menufact.
 * @author Naomie L'archevêque Carrière
 * @author Yan Ha Routhier-Chevrier
 * @version 2.0
 */
class IngredientPlatTest {
    private IngredientPlat ingredientPlat;

    /**
     * Préparation au test d'ingredient plat
     */
    @BeforeEach
    void setUp() {
        ingredientPlat = new IngredientPlat(new Ingredient("Brownie"), 1);
    }

    /**
     * Vérification si nous sommes en mesure d'accéder à l'ingrédient.
     */
    @Test
    void getIngredient() {
        assertEquals("Brownie", ingredientPlat.getIngredient().getNom(), "Vérification si nous sommes en mesure d'accéder à l'ingrédient.");
    }

    /**
     * Vérification si nous sommes en mesure de faire la mise à jour de l'ingrédient contenu dans Ingredient Plat.
     */
    @Test
    void setIngredient() {
        ingredientPlat.setIngredient(new Ingredient("Patate"));
        assertEquals("Patate", ingredientPlat.getIngredient().getNom(), "Vérification si nous sommes en mesure de faire la mise à jour de l'ingredient.");
    }

    /**
     * Vérification si nous sommes en mesure d'accéder la quantité dans ingredient plat.
     */
    @Test
    void getQuantity() {
        assertEquals(1, ingredientPlat.getQuantity(), "Vérification si nous sommes en mesure d'accéder à la quantité.");
    }

    /**
     * Vérification si nous sommes en mesure de faire la mise à jour de la quantité.
     */
    @Test
    void setQuantity() {
        ingredientPlat.setQuantity(10);
        assertEquals(10, ingredientPlat.getQuantity(), "Vérification si nous sommes en mesure de modifier la quantité.");
    }
}