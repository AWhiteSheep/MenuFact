package ingredients;

public class Laitier extends Liquide{
    public Laitier() {
        super();
        setTypeIngredient(TypeIngredient.LAITIER);
    }

    public Laitier(String nom) {
        super(nom);
        setTypeIngredient(TypeIngredient.LAITIER);
    }
}
