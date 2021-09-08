package ingredients;

public class Epice extends Solid{
    public Epice() {
        super();
        setTypeIngredient(TypeIngredient.EPICE);
    }

    public Epice(String nom) {
        super(nom);
        setTypeIngredient(TypeIngredient.EPICE);
    }
}
