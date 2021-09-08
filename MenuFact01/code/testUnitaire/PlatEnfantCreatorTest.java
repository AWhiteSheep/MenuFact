package testUnitaire;

import menufact.plats.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Classe test pour le plat creator pour enfant du systeme Menufact
 * @author Naomie L'archevêque Carrière
 * @author Yan Ha Routhier-Chevrier
 * @version 2.0
 */
class PlatEnfantCreatorTest {
    private PlatEnfantCreator platCreator;

    /**
     * Préparation au banc de test pour le plat creator pour enfant
     */
    @BeforeEach
    void setUp() {
        platCreator = PlatEnfantCreator.getPlatCreator();
    }

    /**
     * Vérification si plat créator pour enfant retourne la même instance
     */
    @Test
    void getPlatCreator() {
        assertEquals(platCreator.hashCode(), PlatEnfantCreator.getPlatCreator().hashCode(), "Vérification de la même instance de plat creator.");
    }

    /**
     * Vérification de la création de plat avec le plat créator pour enfant.
     */
    @Test
    void createPlat() {
        PlatEnfant platEnfant = new PlatEnfant();
        PlatChoisi platChoisi;
        platChoisi = platCreator.createPlat(platEnfant, 1);
        assertEquals(PlatEnfant.class, platChoisi.getPlat().getClass(), "Vérification si le plat est bel et bien un plat pour enfant.");
    }
}