package ingredients;

/**
 * Classe pour les legumes du systeme Menufact
 * @author Naomie L'archevêque Carrière
 * @author Yan Ha Routhier-Chevrier
 * @version 2.0
 */

public class Legume extends Solid{

    /**
     * constructeur sans parametres
     */
    public Legume() {
        super();
        setTypeIngredient(TypeIngredient.LEGUME);
    }

    /**
     *
     * @param nom le nom du legume
     */
    public Legume(String nom)
    {
        super(nom);
        setTypeIngredient(TypeIngredient.LEGUME);
    }
}
