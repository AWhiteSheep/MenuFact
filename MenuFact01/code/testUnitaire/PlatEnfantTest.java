package testUnitaire;

import menufact.plats.PlatEnfant;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
//Nao
class PlatEnfantTest {
    PlatEnfant platenfant;

    @BeforeEach
    void setUp() {
        platenfant = new PlatEnfant(15, "plat enfant", 15.00, 0.75);
    }

    @Test
    void getProportion() {
        assertEquals(0.75, platenfant.getProportion());
    }
}