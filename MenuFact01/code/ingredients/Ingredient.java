package ingredients;

/**
 * Classe pour les Ingrédients de linventaire du systeme Menufact
 * @author Naomie L'archevêque Carrière
 * @author Yan Ha Routhier-Chevrier
 * @version 2.0
 */
public class Ingredient {
    private Unit unit;
    private String nom;
    private String description;
    private TypeIngredient typeIngredient;

    /**
     *
     * @param nom Le nom de l'ingrédient pour l'inventaire
     */
    public Ingredient(String nom){
        this.unit = new Unit("N/A");
        this.nom = nom;
    }

    /**
     * Constructeur sans paramètre
     */
    public Ingredient() {
        this.unit = new Unit("N/A");
    }

    /**
     *
     * @return unit l'unité de l'ingrédient
     */
    public Unit getUnit() {
        return unit;
    }

    /**
     *
     * @param unit Le nouvel unité de l'ingrédient
     */
    public void setUnit(Unit unit) {
        this.unit = unit;
    }

    /**
     *
     * @return Le nom de l'ingrédient
     */
    public String getNom() {
        return nom;
    }

    /**
     *
     * @param nom Le nouveau nom pour l'ingrédient
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     *
     * @return La description de l'ingrédient
     */
    public String getDescription() {
        return description;
    }

    /**
     *
     * @param description La nouvelle description de l'ingrédient
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     *
     * @return Le type de l'ingrédient
     */
    public TypeIngredient getTypeIngredient() {
        return typeIngredient;
    }

    /**
     *
     * @param typeIngredient Le nouveau type de l'ingrédient
     */
    public void setTypeIngredient(TypeIngredient typeIngredient) {
        this.typeIngredient = typeIngredient;
    }
}
