package ingredients;

public class IngredientPlat {
    public Ingredient getIngredient() {
        return ingredient;
    }

    public void setIngredient(Ingredient ingredient) {
        this.ingredient = ingredient;
    }

    private Ingredient ingredient;

    private double quantity;

    public IngredientPlat(Ingredient ingredient, double quantity){
        this.ingredient = ingredient;
        this.quantity = quantity;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }



}
