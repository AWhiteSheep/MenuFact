package ingredients;

import java.util.Objects;

/**
 * Classe pour les Ingrédients de linventaire du systeme Menufact
 * @author Naomie L'archevêque Carrière
 * @author Yan Ha Routhier-Chevrier
 * @version 2.0
 */
public class Ingredient {
    private String nom;
    private String description;
    private Unit unit;
    private TypeIngredient typeIngredient;

    /**
     * Constructeur sans paramètre
     */
    public Ingredient() {
        this.unit = new Unit("N/A");
    }

    /**
     *
     * @param nom Le nom de l'ingrédient pour l'inventaire
     */
    public Ingredient(String nom){
        this.unit = new Unit("N/A");
        this.nom = nom;
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

    /**
     *
     * @param o L'objet pour la comparaison
     * @return Retourne vrai ou faux si la comparaison string nom, et typeIngredient sont pareil
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ingredient that = (Ingredient) o;
        return nom.equals(that.nom) && typeIngredient == that.typeIngredient;
    }

    /**
     *
     * @return Retourne le HashCode de nom et typeIngredient  combiné
     */
    @Override
    public int hashCode() {
        return Objects.hash(nom, typeIngredient);
    }
}
