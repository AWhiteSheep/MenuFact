package testUnitaire;

import menufact.plats.PlatSante;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Classe test pour le plat sante du systeme Menufact.
 * @author Naomie L'archevêque Carrière
 * @author Yan Ha Routhier-Chevrier
 * @version 2.0
 */

class PlatSanteTest {

    PlatSante platsante;

    /**
     * Préparation au banc de test pour le plat sante
     */
    @BeforeEach
    void setUp() {
        platsante = new PlatSante(24, "plat sante", 18.00, 6, 8, 0);
    }

    /**
     * Test pour obtenir les calories du plat sante
     */
    @Test
    void getKcal() {
        assertEquals(6, platsante.getKcal());
    }

    /**
     * test pour obtenir le cholesterol du plat
     */
    @Test
    void getChol() {
        assertEquals(8, platsante.getChol());
    }

    /**
     * test pour obtenir le gras du plat
     */
    @Test
    void getGras() {
        assertEquals(0, platsante.getGras());
    }
}