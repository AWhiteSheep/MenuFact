package testUnitaire;

import ingredients.Fruit;
import ingredients.TypeIngredient;
import org.junit.jupiter.api.BeforeEach;

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
    void getUnit() {
        assertEquals("mg", fruit.getUnit());
    }

    /**
     * test pour avoir le type dingredient
     */
    void getTypeIngredient() {
        assertEquals(TypeIngredient.FRUIT, fruit.getTypeIngredient());
    }
}