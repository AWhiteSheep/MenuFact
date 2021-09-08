package testUnitaire;

import menufact.plats.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Classe test pour le plat santé creator du systeme Menufact
 * @author Naomie L'archevêque Carrière
 * @author Yan Ha Routhier-Chevrier
 * @version 2.0
 */
class PlatSanteCreatorTest {
    private PlatSanteCreator platCreator;

    /**
     * Préparation au banc de test pour le plat sante creator
     */
    @BeforeEach
    void setUp() {
        platCreator = PlatSanteCreator.getPlatCreator();
    }

    /**
     * Vérification si plat sante créator retourne la même instance
     */
    @Test
    void getPlatCreator() {
        assertEquals(platCreator.hashCode(), PlatSanteCreator.getPlatCreator().hashCode(), "Vérification de la même instance de plat sante creator.");
    }

    /**
     * Vérification de la création de plat avec le plat sante créator.
     */
    @Test
    void createPlat() {
        PlatSante platSante = new PlatSante();
        PlatChoisi platChoisi;
        platChoisi = platCreator.createPlat(platSante, 1);
        assertEquals(PlatSante.class, platChoisi.getPlat().getClass(), "Vérification si le plat est bel et bien un plat sante.");
    }
}