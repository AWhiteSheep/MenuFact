package testUnitaire;

import ingredients.Epice;
import ingredients.TypeIngredient;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Classe test pour les épice du systeme Menufact.
 * @author Naomie L'archevêque Carrière
 * @author Yan Ha Routhier-Chevrier
 * @version 2.0
 */
class EpiceTest {
    Epice epice;

    /**
     * Préparation au banc de test pour les épices
     */
    @BeforeEach
    void setUp() {
        epice = new Epice();
    }

    /**
     * Vérification des unités des épices
     */
    @Test
    void getUnit() {
        assertEquals("mg", epice.getUnit().getNom(), "Vérification de l'unité des épices.");
    }

    /**
     * Vérification du type d'ingrédient des épices
     */
    @Test
    void getTypeIngredient() {
        assertEquals(TypeIngredient.EPICE, epice.getTypeIngredient(), "Vérification du type d'ingrédient des épices.");
    }
}