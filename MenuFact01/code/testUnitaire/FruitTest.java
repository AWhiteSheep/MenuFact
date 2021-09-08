package testUnitaire;

import ingredients.Fruit;
import ingredients.TypeIngredient;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * Classe test pour les fruits du systeme Menufact
 * @author Naomie L'archevêque Carrière
 * @author Yan Ha Routhier-Chevrier
 * @version 2.0
 */
class FruitTest {

    Fruit fruit;

    /**
     * preparation au plan de test pour les fruits
     */
    @BeforeEach
    void setUp() {
        fruit = new Fruit("Fraise");
    }

    /**
     * test pour obtenir lunite
     */
    @Test
    void getUnit() {
        assertEquals("mg", fruit.getUnit().getNom(), "verification de lunite des fruits");
    }

    /**
     * test pour avoir le type dingredient
     */
    @Test
    void getTypeIngredient() {
        assertEquals(TypeIngredient.FRUIT, fruit.getTypeIngredient(), "verification du type dingredient");
    }
}