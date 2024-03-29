package testUnitaire;

import ingredients.Legume;
import ingredients.TypeIngredient;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * Classe test pour les legumes du systeme Menufact
 * @author Naomie L'archevêque Carrière
 * @author Yan Ha Routhier-Chevrier
 * @version 2.0
 */
class LegumeTest {
    Legume legume;

    /**
     * preparation au banc de test de legume
     */
    @BeforeEach
    void setUp() {
        legume = new Legume("carotte");
    }

    /**
     * test pour obtenir lunite
     */
    @Test
    void getUnit() {
        assertEquals("mg", legume.getUnit().getNom(), "verification des unites des legumes");
    }

    /**
     * test pour avoir le type dingredient
     */
    @Test
    void getTypeIngredient() {
        assertEquals(TypeIngredient.LEGUME, legume.getTypeIngredient(), "verification du type dingredient");
    }
}