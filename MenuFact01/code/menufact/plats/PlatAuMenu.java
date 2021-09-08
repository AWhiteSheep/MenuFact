package menufact.plats;

import ingredients.Ingredient;
import ingredients.IngredientPlat;

import java.util.ArrayList;

/**
 * Les plats au menu du systeme Menufact
 * @author Naomie L'archevêque Carrière
 * @author Yan Ha Routhier-Chevrier
 * @version 2.0
 */
public class PlatAuMenu {
    private int code;
    private String description;
    private double prix;
    private ArrayList<IngredientPlat> ingredients;

    /**
     * le constructeur du plat au menu sans parametres
     */
    public PlatAuMenu() {
        this.ingredients = new ArrayList<>();
    }

    /**
     * constructeur du plat au menu avec parametres
     * @param code le code du plat au menu
     * @param description la description du plat
     * @param prix le prix du plat
     */
    public PlatAuMenu(int code, String description, double prix) {
        this.code = code;
        this.description = description;
        this.prix = prix;
        this.ingredients = new ArrayList<>();
    }

    /**
     *
     * @return les ingredients du plat
     */
    public ArrayList<IngredientPlat> getIngredients() {
        return ingredients;
    }

    /***
     *
     * @param ingredient L'ingredient à ajouter au plat
     * @param quantity La quantité de l'ingredient dans le plat
     */
    public void addIngredient(Ingredient ingredient, double quantity) {
        this.ingredients.add(new IngredientPlat(ingredient, quantity));
    }

    /**
     *
     * @return le code du plat
     */
    public int getCode() {
        return code;
    }

    /**
     * set le code du plat
     * @param code le code du plat
     */
    public void setCode(int code) {
        this.code = code;
    }

    /**
     *
     * @return la description du plat
     */
    public String getDescription() {
        return description;
    }

    /**
     * set la description du plat
     * @param description la description du plat
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     *
     * @return le prix du plat
     */
    public double getPrix() {
        return prix;
    }

    /**
     * set le prix du plat
     * @param prix le prix du plat
     */
    public void setPrix(double prix) {
        this.prix = prix;
    }

    /**
     *
     * @return les informations du plat
     */
    @Override
    public String toString() {
        return "menufact.plats.PlatAuMenu{" +
                "code=" + code +
                ", description='" + description + '\'' +
                ", prix=" + prix +
                "}\n";
    }
}
