package testUnitaire;

import ingredients.Legume;
import ingredients.TypeIngredient;
import ingredients.Viande;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * Classe test pour les viandes du systeme Menufact
 * @author Naomie L'archevêque Carrière
 * @author Yan Ha Routhier-Chevrier
 * @version 2.0
 */
class ViandeTest {
    Viande viande;

    /**
     * preparation au banc de test de viandes
     */
    @BeforeEach
    void setUp() {
        viande = new Viande("poulet");
    }

    /**
     * test pour obtenir lunite
     */
    @Test
    void getUnit() {
        assertEquals("mg", viande.getUnit().getNom(), "verification des unites des viandes");
    }

    /**
     * test pour avoir le type dingredient
     */
    @Test
    void getTypeIngredient() {
        assertEquals(TypeIngredient.VIANDE, viande.getTypeIngredient(), "verification du type dingredient");
    }
}