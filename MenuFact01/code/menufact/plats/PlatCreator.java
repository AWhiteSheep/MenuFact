package menufact.plats;

/**
 * Classe du créateur de plat du systeme Menufact
 * @author Naomie L'archevêque Carrière
 * @author Yan Ha Routhier-Chevrier
 * @version 2.0
 */
public class PlatCreator{
    protected static PlatCreator platCreator;

    /**
     * Constructeur privé
     */
    private PlatCreator() {}

    /**
     *
     * @return L'instance du plat creator
     */
    public static PlatCreator getPlatCreator() {
        if(platCreator == null)
            platCreator = new PlatCreator();
        return platCreator;
    }

    /**
     *
     * @param platAuMenu Le plat au menu décidé par le client
     * @param quantity La quantité du plat au menu
     * @return Le plat choisi contenant le plat au menu
     */
    public PlatChoisi createPlat(PlatAuMenu platAuMenu, int quantity) {
        PlatChoisi platChoisi = new PlatChoisi(platAuMenu, quantity);
        return platChoisi;
    }
}
