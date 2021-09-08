package testUnitaire;

import menufact.plats.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Classe test pour le chef du systeme Menufact
 * @author Naomie L'archevêque Carrière
 * @author Yan Ha Routhier-Chevrier
 * @version 2.0
 */
class ChefTest {
    private Chef chef;
    private PlatChoisi platChoisi;

    /**
     * Création des instances que nous avons de besoin pour les tests de la class chef
     */
    @BeforeEach
    void setUp() {
        chef = new Chef();
        PlatAuMenu platAuMenu = new PlatAuMenu();
        platChoisi = new PlatChoisi(platAuMenu,1);
    }

    /**
     * Test pour la notification au chef pour un plat donné
     */
    @Test
    void testNotifier() {
        chef.notifier(platChoisi);
        Assertions.assertTrue(platChoisi.getEtat().getClass() == PlatEnPreparation.class, "Plat choisi notifier au chef; devient PlatEnPreparation");
        Assertions.assertFalse(platChoisi.getEtat().getClass() == PlatCommande.class, "Plat choisi notifier au chef; n'est pas PlatCommande");
        Assertions.assertFalse(platChoisi.getEtat().getClass() == PlatServi.class, "Plat choisi notifier au chef; n'est pas PlatServi");
        Assertions.assertFalse(platChoisi.getEtat().getClass() == PlatTermine.class, "Plat choisi notifier au chef; n'est pas PlatTermine");
        Assertions.assertFalse(platChoisi.getEtat().getClass() == PlatImpossibleDeServir.class, "Plat choisi notifier au chef; n'est pas PlatImpossibleDeServir");
    }

    /**
     * Test pour le changement de l'état du plat par le chef
     */
    @Test
    void changerEtatPlat() {
        chef.changerEtatPlat(platChoisi);
        Assertions.assertTrue(platChoisi.getEtat().getClass() == PlatEnPreparation.class, "Plat choisi notifier au chef; devient PlatEnPreparation");
        Assertions.assertFalse(platChoisi.getEtat().getClass() == PlatCommande.class, "Plat choisi notifier au chef; n'est pas PlatCommande");
        Assertions.assertFalse(platChoisi.getEtat().getClass() == PlatServi.class, "Plat choisi notifier au chef; n'est pas PlatServi");
        Assertions.assertFalse(platChoisi.getEtat().getClass() == PlatTermine.class, "Plat choisi notifier au chef; n'est pas PlatTermine");
        Assertions.assertFalse(platChoisi.getEtat().getClass() == PlatImpossibleDeServir.class, "Plat choisi notifier au chef; n'est pas PlatImpossibleDeServir");
    }
}