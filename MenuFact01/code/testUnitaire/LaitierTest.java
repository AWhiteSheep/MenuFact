package testUnitaire;

import ingredients.Laitier;
import ingredients.TypeIngredient;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Classe test pour les produits laitiers du systeme Menufact.
 * @author Naomie L'archevêque Carrière
 * @author Yan Ha Routhier-Chevrier
 * @version 2.0
 */
class LaitierTest {
    Laitier laitier;

    /**
     * Préparation du banc de test des produits laitiers.
     */
    @BeforeEach
    void setUp() {
        laitier = new Laitier();
    }

    /**
     * Vérification des unités des produits laitiers
     */
    @Test
    void getUnit() {
        assertEquals("ml", laitier.getUnit().getNom(), "Vérification de l'unité des produits laitiers.");
    }

    /**
     * Vérification du type d'ingrédient des produits laitiers
     */
    @Test
    void getTypeIngredient() {
        assertEquals(TypeIngredient.LAITIER, laitier.getTypeIngredient(), "Vérification du type d'ingrédient des produits laitiers.");
    }
}