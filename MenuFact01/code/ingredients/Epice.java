package ingredients;

/**
 * Classe pour les épices de linventaire du systeme Menufact
 * @author Naomie L'archevêque Carrière
 * @author Yan Ha Routhier-Chevrier
 * @version 2.0
 */
public class Epice extends Solid{

    /**
     * Constructeur pour les épices de l'inventaire.
     */
    public Epice() {
        super();
        setTypeIngredient(TypeIngredient.EPICE);
    }

    /**
     *
     * @param nom Le nom de l'épice de l'inventaire.
     */
    public Epice(String nom) {
        super(nom);
        setTypeIngredient(TypeIngredient.EPICE);
    }
}
