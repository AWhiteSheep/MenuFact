package testUnitaire;

import menufact.Menu;
import menufact.exceptions.MenuException;
import menufact.plats.PlatAuMenu;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Classe test pour le menu du systeme Menufact.
 * @author Naomie L'archevêque Carrière
 * @author Yan Ha Routhier-Chevrier
 * @version 2.0
 */
class MenuTest {
    private Menu menu;

    /**
     * Préparation pour le banc de test
     */
    @BeforeEach
    void setUp() {
        menu = new Menu("Menu pour banc de test.");
    }

    /**
     * Test pour l'ajout au menu
     */
    @Test
    void ajoute() {
        assertEquals(0, menu.menuItemCount(), "Test de l'ajout avant l'ajout.");
        PlatAuMenu platAuMenu = new PlatAuMenu();
        platAuMenu.setDescription("Plat 1");
        menu.ajoute(platAuMenu);
        assertEquals(1, menu.menuItemCount(), "Test de l'ajout suite à l'ajout.");
    }

    /**
     * Test pour le changement de la position dans le menu.
     */
    @Test
    void position() {
        PlatAuMenu platAuMenu1 = new PlatAuMenu();
        platAuMenu1.setDescription("Plat 1");
        PlatAuMenu platAuMenu2 = new PlatAuMenu();
        platAuMenu2.setDescription("Plat 2");
        menu.ajoute(platAuMenu1);
        menu.ajoute(platAuMenu2);
        menu.position(0);
        assertEquals("Plat 1", menu.platCourant().getDescription(), "Test avant le changement de position dans le menu.");
        menu.position(1);
        assertEquals("Plat 2", menu.platCourant().getDescription(), "Test après le changement de position dans le menu.");
    }

    /**
     * Test pour le plat courant dans le menu.
     */
    @Test
    void platCourant() {
        PlatAuMenu platAuMenu1 = new PlatAuMenu();
        platAuMenu1.setDescription("Plat 1");
        PlatAuMenu platAuMenu2 = new PlatAuMenu();
        platAuMenu2.setDescription("Plat 2");
        menu.ajoute(platAuMenu1);
        menu.ajoute(platAuMenu2);
        menu.position(0);
        assertEquals("Plat 1", menu.platCourant().getDescription(), "Test pour le plat courant.");
        menu.position(1);
        assertEquals("Plat 2", menu.platCourant().getDescription(), "Test pour le plat courant.");
    }

    /**
     * Test pour le changement de position dans le menu en utilisant position suivante.
     */
    @Test
    void positionSuivante() {
        PlatAuMenu platAuMenu1 = new PlatAuMenu();
        platAuMenu1.setDescription("Plat 1");
        PlatAuMenu platAuMenu2 = new PlatAuMenu();
        platAuMenu2.setDescription("Plat 2");
        menu.ajoute(platAuMenu1);
        menu.ajoute(platAuMenu2);
        menu.position(0);
        assertEquals("Plat 1", menu.platCourant().getDescription(), "Test avant le changement de position.");
        assertDoesNotThrow(() -> { menu.positionSuivante(); }, "Changement de position");
        assertEquals("Plat 2", menu.platCourant().getDescription(), "Test suite à un changement de position.");
        assertThrows(MenuException.class, () -> { menu.positionSuivante(); }, "Changement de position à la fin du menu.");
    }

    /**
     * Test pour le changement de position dans le menu en utilisant position precedente.
     */
    @Test
    void positionPrecedente() {
        PlatAuMenu platAuMenu1 = new PlatAuMenu();
        platAuMenu1.setDescription("Plat 1");
        PlatAuMenu platAuMenu2 = new PlatAuMenu();
        platAuMenu2.setDescription("Plat 2");
        menu.ajoute(platAuMenu1);
        menu.ajoute(platAuMenu2);
        menu.position(1);
        assertEquals("Plat 2", menu.platCourant().getDescription(), "Test avant le changement de position.");
        assertDoesNotThrow(() -> { menu.positionPrecedente(); }, "Changement de position");
        assertEquals("Plat 1", menu.platCourant().getDescription(), "Test suite à un changement de position.");
        assertThrows(MenuException.class, () -> { menu.positionPrecedente(); }, "Changement de position à la position 0 du menu.");
    }
}