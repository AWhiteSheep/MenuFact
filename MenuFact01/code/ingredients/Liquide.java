package ingredients;

/**
 * Classe abstraite des ingrédients liquide de linventaire du systeme Menufact
 * @author Naomie L'archevêque Carrière
 * @author Yan Ha Routhier-Chevrier
 * @version 2.0
 */
public abstract class Liquide extends Ingredient{
    /**
     * Constructeur par défault
     */
    public Liquide() {
        setUnit(new Unit("ml"));
    }

    /**
     *
     * @param nom nom de l'ingrédient
     */
    public Liquide(String nom) {
        super(nom);
        setUnit(new Unit("ml"));
    }
}
