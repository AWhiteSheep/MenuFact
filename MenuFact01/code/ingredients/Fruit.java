package ingredients;

public class Fruit extends Solid{
    public Fruit() {
        super();
        setTypeIngredient(TypeIngredient.FRUIT);
    }
    public Fruit(String nom) {
        super(nom);
        setTypeIngredient(TypeIngredient.FRUIT);
    }
}
