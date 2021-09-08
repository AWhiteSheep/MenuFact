package ingredients;

public class Ingredient {
    private Unit unit;
    private String nom;
    private String description;
    private TypeIngredient typeIngredient;

    public Ingredient(String nom){
        this.unit = new Unit("N/A");
        this.nom = nom;
    }

    public Ingredient() {
        this.unit = new Unit("N/A");
    }

    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TypeIngredient getTypeIngredient() {
        return typeIngredient;
    }

    public void setTypeIngredient(TypeIngredient typeIngredient) {
        this.typeIngredient = typeIngredient;
    }
}
