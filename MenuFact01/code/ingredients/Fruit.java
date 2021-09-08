package ingredients;

/**
 * Classe pour les fruits du systeme Menufact
 * @author Naomie L'archevêque Carrière
 * @author Yan Ha Routhier-Chevrier
 * @version 2.0
 */

public class Fruit extends Solid{
    /**
     * constructeur sans parametres
     */
    public Fruit() {
        super();
        setTypeIngredient(TypeIngredient.FRUIT);
    }

    /**
     *
     * @param nom le nom du fruit
     */
    public Fruit(String nom) {
        super(nom);
        setTypeIngredient(TypeIngredient.FRUIT);
    }
}
