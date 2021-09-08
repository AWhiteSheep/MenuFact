package testUnitaire;

import ingredients.Ingredient;
import ingredients.IngredientInventaire;
import ingredients.exceptions.IngredientException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Classe test pour les ingredient en inventaire du systeme Menufact.
 * @author Naomie L'archevêque Carrière
 * @author Yan Ha Routhier-Chevrier
 * @version 2.0
 */
class IngredientInventaireTest {
    private IngredientInventaire ingredientInventaire;

    /**
     * Création d'ingredient en inventaire pour le test.
     */
    @BeforeEach
    void setUp() {
        ingredientInventaire = new IngredientInventaire(new Ingredient(), 1);
    }

    /**
     * Test si nous sommes en mesure de faire la lecture de la quantité de l'ingrédient.
     */
    @Test
    void getQuantite() {
        assertEquals(1, ingredientInventaire.getQuantite(), "Vérification si nous sommes en mesure de lire la quantité.");
    }

    /**
     * Test si nous sommes en mesure de faire la mise à jour de la quantité d'ingrédient.
     */
    @Test
    void setQuantite() throws IngredientException {
        ingredientInventaire.setQuantite(10);
        assertEquals(10, ingredientInventaire.getQuantite(), "Vérification si nous sommes en mesure de faire la mise à jour de la quantité en inventaire.");
        Assertions.assertThrows(IngredientException.class, () -> { ingredientInventaire.setQuantite(-3); }, "Vérification la quantité ne peut pas être mise à jour en dessous de 0.");
    }
}