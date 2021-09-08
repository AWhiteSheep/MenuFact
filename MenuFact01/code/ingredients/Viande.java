package ingredients;
/**
 * Classe  pour les viandes du systeme Menufact
 * @author Naomie L'archevêque Carrière
 * @author Yan Ha Routhier-Chevrier
 * @version 2.0
 */
public class Viande extends Solid{

    /**
     * constructeur sans parametres
     */
    public Viande() {
        super();
        setTypeIngredient(TypeIngredient.VIANDE);
    }

    /**
     *
     * @param nom le nom de la viande
     */
    public Viande(String nom) {
        super(nom);
        setTypeIngredient(TypeIngredient.VIANDE);
    }
}
