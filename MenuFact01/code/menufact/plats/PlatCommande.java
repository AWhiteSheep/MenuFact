package menufact.plats;

/**
 * L'état commendé d'un plat du systeme Menufact
 * @author Naomie L'archevêque Carrière
 * @author Yan Ha Routhier-Chevrier
 * @version 2.0
 */
public class PlatCommande extends PlatEtat{

    /**
     *
     * @param p Le plat choisi pour l'état plat commandé.
     */
    public PlatCommande(PlatChoisi p) {
        super(p);
    }

    /**
     * Passe à la prochaine état du plat
     */
    @Override
    public void next() {
        platChoisi.changeState(new PlatEnPreparation(platChoisi));
    }
}
