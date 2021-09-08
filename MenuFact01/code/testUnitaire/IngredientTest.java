package testUnitaire;

import ingredients.Ingredient;
import ingredients.TypeIngredient;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Classe test pour les ingredients du systeme Menufact.
 * @author Naomie L'archevêque Carrière
 * @author Yan Ha Routhier-Chevrier
 * @version 2.0
 */
class IngredientTest {
    private Ingredient ingredient;

    /**
     * Préparation au test de la classe ingredient
     */
    @BeforeEach
    void setUp() {
        ingredient = new Ingredient("Apple");
        ingredient.setTypeIngredient(TypeIngredient.FRUIT);
        ingredient.setDescription("Ingredient important pour la soupe.");
    }

    /**
     * Vérification si nous sommes en mesure d'accéder au nom d'ingrédient.
     */
    @Test
    void getNom() {
        assertEquals("Apple", ingredient.getNom(), "Vérification si nous sommes en mesure d'accéder au nom d'ingrédient.");
    }

    /**
     * Vérification si nous sommes en mesure de faire la mise à jour du nom de l'ingrédient.
     */
    @Test
    void setNom() {
        ingredient.setNom("Orange");
        assertEquals("Orange", ingredient.getNom(), "Vérification si nous sommes en mesure de faire la mise à jour du nom de l'ingrédient.");
    }

    /**
     * Vérification si nous sommes en mesure d'accéder à la déscription de l'ingrédient.
     */
    @Test
    void getDescription() {
        assertEquals("Ingredient important pour la soupe.", ingredient.getDescription(), "Vérification si nous sommes en mesure d'accéder à la déscription de l'ingrédient.");
    }

    /**
     * Vérification si nous sommes en mesure de faire la mise à jour de la déscription.
     */
    @Test
    void setDescription() {
        ingredient.setDescription("Nouvelle description.");
        assertEquals("Nouvelle description.", ingredient.getDescription(), "Vérification si nous sommes en mesure de faire la mise à jour de la déscription.");
    }

    /**
     * Vérification si nous sommes en mesure d'accéder le type de l'ingrédient.
     */
    @Test
    void getTypeIngredient() {
        assertEquals(TypeIngredient.FRUIT, ingredient.getTypeIngredient(), "Vérification si nous sommes en mesure d'accéder le type de l'ingrédient.");
    }

    /**
     * Vérification si nous sommes en mesure de faire la mise à jour du type de l'ingrédient.
     */
    @Test
    void setTypeIngredient() {
        ingredient.setTypeIngredient(TypeIngredient.LEGUME);
        assertEquals(TypeIngredient.LEGUME, ingredient.getTypeIngredient(), "Vérification si nous sommes en mesure de faire la mise à jour du type de l'ingrédient");
    }
}