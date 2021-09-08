package menufact.plats;

/**
 * Le plat enfant du systeme Menufact
 * @author Naomie L'archevêque Carrière
 * @author Yan Ha Routhier-Chevrier
 * @version 2.0
 */

public class PlatEnfant extends PlatAuMenu{
    private double proportion;

    /**
     * le constructeur du plat enfant sans param
     */
    public PlatEnfant() {
    }

    /**
     * le constructeur du plat enfant avec parametres
     * @param code le code du plat
     * @param description la description du plat
     * @param prix le prix du plat
     * @param proportion la proportion du plat par rapport a un plat normal
     */
    public PlatEnfant(int code, String description, double prix, double proportion) {
        super(code, description, prix);
        this.proportion = proportion;
    }

    /**
     *
     * @return la proportion du plat par rapport a un plat normal
     */
    public double getProportion() {
        return proportion;
    }

    /**
     *
     * @return les informations du plat enfant
     */
    @Override
    public String toString() {
        return "PlatEnfant{" +
                "proportion=" + proportion +
                "} " + super.toString();
    }
}
