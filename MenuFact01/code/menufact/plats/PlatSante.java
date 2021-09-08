package menufact.plats;

import menufact.plats.PlatAuMenu;

/**
 * Classe test pour le plat sante du systeme Menufact.
 * @author Naomie L'archevêque Carrière
 * @author Yan Ha Routhier-Chevrier
 * @version 2.0
 */

public class PlatSante extends PlatAuMenu {
    private double kcal;
    private double chol;
    private double gras;

    /**
     * Constructeur du plat sante
     * @param code le code du plat
     * @param description la description du plat
     * @param prix le prix du plat
     * @param kcal les calories du plat
     * @param chol le cholesterol du plat
     * @param gras le gras du plat
     */
    public PlatSante(int code, String description, double prix, double kcal, double chol, double gras) {
        super(code, description, prix);
        this.kcal = kcal;
        this.chol = chol;
        this.gras = gras;
    }

    /**
     * constructeur du plat sante sans param
     */
    public PlatSante() {
    }

    /**
     *
     * @return les infos du plat sante
     */
    @Override
    public String toString() {
        return "menufact.plats.PlatSante{" +
                "kcal=" + kcal +
                ", chol=" + chol +
                ", gras=" + gras +
                "} " + super.toString();
    }

    /**
     *
     * @return les calories du plat sante
     */
    public double getKcal() {
        return kcal;
    }

    /**
     *
     * @return le cholesterol du plat sante
     */
    public double getChol() {
        return chol;
    }

    /**
     *
     * @return le gras du plat
     */
    public double getGras() {
        return gras;
    }
}
