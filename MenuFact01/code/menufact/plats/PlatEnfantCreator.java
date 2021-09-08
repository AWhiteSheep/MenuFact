package menufact.plats;

/**
 * Classe du créateur de plat pour enfant du systeme Menufact
 * @author Naomie L'archevêque Carrière
 * @author Yan Ha Routhier-Chevrier
 * @version 2.0
 */
public class PlatEnfantCreator{
    protected static PlatEnfantCreator platCreator;

    /**
     * Constructeur privé
     */
    private PlatEnfantCreator() {}

    /**
     *
     * @return L'instance du plat creator
     */
    public static PlatEnfantCreator getPlatCreator() {
        if(platCreator == null)
            platCreator = new PlatEnfantCreator();
        return platCreator;
    }

    /**
     *
     * @param platEnfant Le plat au menu décidé par le client
     * @param quantity La quantité du plat au menu
     * @return Le plat choisi contenant le plat au menu
     */
    public PlatChoisi createPlat(PlatEnfant platEnfant, int quantity) {
        PlatChoisi platChoisi = new PlatChoisi(platEnfant, quantity);
        return platChoisi;
    }
}
