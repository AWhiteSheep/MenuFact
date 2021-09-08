package ingredients;

/**
 * Classe abstraite des ingrédients solides de linventaire du systeme Menufact
 * @author Naomie L'archevêque Carrière
 * @author Yan Ha Routhier-Chevrier
 * @version 2.0
 */
public abstract class Solid extends Ingredient{
    /**
     * Constructeur par défault
     */
    public Solid() {
        setUnit(new Unit("mg"));
    }

    /**
     *
     * @param nom Nom de l'ingrédient
     */
    public Solid(String nom) { super(nom); setUnit(new Unit("mg")); }
}
