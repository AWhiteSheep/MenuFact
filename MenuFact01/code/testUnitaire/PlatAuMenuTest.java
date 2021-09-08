package testUnitaire;

import menufact.plats.PlatAuMenu;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
//Nao
class PlatAuMenuTest {
    PlatAuMenu plataumenu;

    @BeforeEach
    void setUp() {
        plataumenu = new PlatAuMenu(1, "test plat au menu", 2.0);
    }

    @Test
    void getCode() {
        assertEquals(1, plataumenu.getCode());
    }

    @Test
    void setCode() {
        plataumenu.setCode(3);
        assertEquals(3, plataumenu.getCode());
    }

    @Test
    void getDescription() {
        assertEquals("test plat au menu", plataumenu.getDescription());
    }

    @Test
    void setDescription() {
        plataumenu.setDescription("test 2");
        assertEquals("test 2", plataumenu.getDescription());
    }

    @Test
    void getPrix() {
        assertEquals(2.0, plataumenu.getPrix());
    }

    @Test
    void setPrix() {
        plataumenu.setPrix(5.25);
        assertEquals(5.25, plataumenu.getPrix());
    }
}