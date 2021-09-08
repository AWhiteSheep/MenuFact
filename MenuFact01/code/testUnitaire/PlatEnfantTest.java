package testUnitaire;

import menufact.plats.PlatEnfant;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * Classe test pour le plat enfant du systeme Menufact
 * @author Naomie L'archevêque Carrière
 * @author Yan Ha Routhier-Chevrier
 * @version 2.0
 */

class PlatEnfantTest {
    PlatEnfant platenfant;

    /**
     * preparation au banc de test pour le plat enfant
     */
    @BeforeEach
    void setUp() {
        platenfant = new PlatEnfant(15, "plat enfant", 15.00, 0.75);
    }

    /**
     * test pour obtenir les proportions du plat
     */
    @Test
    void getProportion() {
        assertEquals(0.75, platenfant.getProportion(), "verification des proportions");
    }
}