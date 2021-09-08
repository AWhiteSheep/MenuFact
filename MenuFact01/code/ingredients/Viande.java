package ingredients;
// Nao
public class Viande extends Solid{
    public Viande() {
        super();
        setTypeIngredient(TypeIngredient.VIANDE);
    }
    public Viande(String nom) {
        super(nom);
        setTypeIngredient(TypeIngredient.VIANDE);
    }
}
