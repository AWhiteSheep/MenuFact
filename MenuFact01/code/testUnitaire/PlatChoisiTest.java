package testUnitaire;

import menufact.plats.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Classe test pour le plat choisi du systeme Menufact.
 * @author Naomie L'archevêque Carrière
 * @author Yan Ha Routhier-Chevrier
 * @version 2.0
 */
class PlatChoisiTest {
    PlatChoisi platChoisi;
    Chef newSub;

    /**
     * Préparation au banc de test pour le plat choisi
     */
    @BeforeEach
    void setUp() {
        PlatAuMenu platAuMenu = new PlatAuMenu();
        platAuMenu.setDescription("Plat 1");
        platChoisi = new PlatChoisi(platAuMenu, 1);
        newSub = new Chef();
    }

    /**
     * Test à l'ajout d'un subscriber
     */
    @Test
    void addSubscriber() {
        assertEquals(0, platChoisi.CountSubscriber(), "Vérification avant l'ajout d'un subscriber.");
        platChoisi.addSubscriber(newSub);
        assertEquals(1, platChoisi.CountSubscriber(), "Vérification à la suite de l'ajout.");
    }

    /**
     * Test pour enlever le subscriber
     */
    @Test
    void removeSubscriber() {
        platChoisi.addSubscriber(newSub);
        assertEquals(1, platChoisi.CountSubscriber(), "Vérification avant la supression d'un subscriber.");
        platChoisi.removeSubscriber(newSub);
        assertEquals(0, platChoisi.CountSubscriber(), "Vérification à la suite de la suppression.");
    }

    /**
     * Test de l'envoie des notification
     */
    @Test
    void notifierSubscriber() {
        platChoisi.addSubscriber(newSub);
        assertDoesNotThrow(() -> platChoisi.notifierSubscriber(), "Vérification de l'envoie de la notification.");
    }

    /**
     * Test du changement de l'état du plat
     */
    @Test
    void changeState() {
        assertEquals(PlatCommande.class, platChoisi.getEtat().getClass(), "Vérification avant le changement d'état.");
        platChoisi.changeState(new PlatEnPreparation(platChoisi));
        assertEquals(PlatChoisi.class, platChoisi.getEtat().getClass(), "Vérification suite au changement de l'état.");
    }

    /**
     * Test si nous sommes en mesure d'accéder à la quantité de plat
     */
    @Test
    void getQuantite() {
        assertEquals(1, platChoisi.getQuantite(), "Vérification de la quantité.");
    }

    /**
     * Test si nous sommes en mesure de modifier la quantité
     */
    @Test
    void setQuantite() {
        assertEquals(1, platChoisi.getQuantite(), "Vérification avant le changement de la quantité.");
        platChoisi.setQuantite(2);
        assertEquals(2, platChoisi.getQuantite(), "Vérification après le changement de la quantité.");
    }

    /**
     * Test si nous sommes en mesure d'accéder au plat
     */
    @Test
    void getPlat() {
        assertEquals("Plat 1", platChoisi.getPlat().getDescription(), "Vérification si nous sommes en mesure d'accéder au plat.");
    }
}