package ingredients;

//VIEW
public class IngredientManager {
    private IngredientManager manager;

    private IngredientManager(){

    }

    public IngredientManager getIngredientManager(){
        if(manager == null)
            manager = new IngredientManager();

        return manager;
    }

    public void verifyInventory(Ingredient ingredient, int Quantity) {
        //hemm???
        System.out.println("Ingredient: " + ingredient);
        System.out.println("Quantite: " + Quantity);
    }
}
