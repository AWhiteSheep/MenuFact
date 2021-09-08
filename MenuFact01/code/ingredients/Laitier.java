package ingredients;

/**
 * Classe pour les produits laitiers de linventaire du systeme Menufact
 * @author Naomie L'archevêque Carrière
 * @author Yan Ha Routhier-Chevrier
 * @version 2.0
 */
public class Laitier extends Liquide{

    /**
     * Constructeur pour les produits laitiers de l'inventaire.
     */
    public Laitier() {
        super();
        setTypeIngredient(TypeIngredient.LAITIER);
    }

    /**
     *
     * @param nom Le nom du produit laitier pour l'inventaire.
     */
    public Laitier(String nom) {
        super(nom);
        setTypeIngredient(TypeIngredient.LAITIER);
    }
}
