package menufact.plats;

/**
 * Classe du créateur de plat santé du systeme Menufact
 * @author Naomie L'archevêque Carrière
 * @author Yan Ha Routhier-Chevrier
 * @version 2.0
 */
public class PlatSanteCreator{
    protected static PlatSanteCreator platCreator;

    /**
     * Constructeur privé
     */
    private PlatSanteCreator() {}

    /**
     *
     * @return L'instance du plat creator
     */
    public static PlatSanteCreator getPlatCreator() {
        if(platCreator == null)
            platCreator = new PlatSanteCreator();
        return platCreator;
    }

    /**
     *
     * @param platSante Le plat santé décidé par le client
     * @param quantity La quantité du plat au menu
     * @return Le plat choisi contenant le plat au menu
     */
    public PlatChoisi createPlat(PlatSante platSante, int quantity) {
        PlatChoisi platChoisi = new PlatChoisi(platSante, quantity);
        return platChoisi;
    }
}
