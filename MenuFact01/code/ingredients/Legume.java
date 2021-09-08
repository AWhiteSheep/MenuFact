package ingredients;

public class Legume extends Solid{
    public Legume() {
        super();
        setTypeIngredient(TypeIngredient.LEGUME);
    }
    public Legume(String nom)
    {
        super(nom);
        setTypeIngredient(TypeIngredient.LEGUME);
    }
}
