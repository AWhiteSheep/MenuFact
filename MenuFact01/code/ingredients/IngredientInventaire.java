package ingredients;

import ingredients.exceptions.IngredientException;

/**
 * Classe pour les ingredients de linventaire du systeme Menufact
 * @author Naomie L'archevêque Carrière
 * @author Yan Ha Routhier-Chevrier
 * @version 2.0
 */
public class IngredientInventaire {
    private Ingredient ingredient;
    private double quantite;

    /**
     * constructeur
     * @param ingredient lingredient de linventaire
     * @param quantite la quantite de lingredient
     */
    public IngredientInventaire(Ingredient ingredient, double quantite) {
        this.ingredient = ingredient;
        this.quantite = quantite;
    }

    /**
     *
     * @return la quantite de lingredient
     */
    public double getQuantite() {
        return quantite;
    }

    /**
     * change la quantite de lingredient
     * @param quantite la quantite a changer de lingredient
     * @throws IngredientException si la quantite est negative
     */
    public void setQuantite(double quantite) throws IngredientException{
        if (quantite < 0)
            throw new IngredientException("Il n'est pas possible d'avoir une quantité negative");
        else
            this.quantite = quantite;
    }

    /**
     *
     * @return le nom de lingredient
     */
    public String getNom(){return ingredient.getNom();}
}
