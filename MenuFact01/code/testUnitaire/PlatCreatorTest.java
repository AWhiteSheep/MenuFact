package testUnitaire;

import menufact.plats.PlatAuMenu;
import menufact.plats.PlatChoisi;
import menufact.plats.PlatCreator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Classe test pour le plat creator du systeme Menufact
 * @author Naomie L'archevêque Carrière
 * @author Yan Ha Routhier-Chevrier
 * @version 2.0
 */
class PlatCreatorTest {
    private PlatCreator platCreator;

    /**
     * Préparation au banc de test pour le plat creator
     */
    @BeforeEach
    void setUp() {
        platCreator = PlatCreator.getPlatCreator();
    }

    /**
     * Vérification si plat créator retourne la même instance
     */
    @Test
    void getPlatCreator() {
        assertEquals(platCreator.hashCode(), PlatCreator.getPlatCreator().hashCode(), "Vérification de la même instance de plat creator.");
    }

    /**
     * Vérification de la création de plat avec le plat créator.
     */
    @Test
    void createPlat() {
        PlatAuMenu platAuMenu = new PlatAuMenu();
        PlatChoisi platChoisi;
        platChoisi = platCreator.createPlat(platAuMenu, 1);
        assertEquals(PlatAuMenu.class, platChoisi.getPlat().getClass(), "Vérification si le plat est bel et bien un plat au menu.");
    }
}