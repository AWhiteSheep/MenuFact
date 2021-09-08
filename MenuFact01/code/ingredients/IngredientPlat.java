package ingredients;

/**
 * Classe pour qui gère les ingrédients d'un plat de linventaire du systeme Menufact
 * @author Naomie L'archevêque Carrière
 * @author Yan Ha Routhier-Chevrier
 * @version 2.0
 */
public class IngredientPlat {
    private Ingredient ingredient;
    private double quantity;

    /**
     * Constructeur
     * @param ingredient L'ingrédient à être lié au plat
     * @param quantity La quantité de cet ingrédient
     */
    public IngredientPlat(Ingredient ingredient, double quantity){
        this.ingredient = ingredient;
        this.quantity = quantity;
    }

    /**
     *
     * @return L'ingrédient d'un plat
     */
    public Ingredient getIngredient() {
        return ingredient;
    }

    /**
     *
     * @param ingredient Le nouvel ingrédient du plat
     */
    public void setIngredient(Ingredient ingredient) {
        this.ingredient = ingredient;
    }

    /**
     *
     * @return La quantité de cet ingrédient dans le plat
     */
    public double getQuantity() {
        return quantity;
    }

    /**
     *
     * @param quantity La nouvelle quantité pour cet ingrédient dans le plat
     */
    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }



}
