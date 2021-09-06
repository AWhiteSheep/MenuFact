package menufact.plats;

/**
 * L'état d'un plat en préparation du systeme Menufact
 * @author Naomie L'archevêque Carrière
 * @author Yan Ha Routhier-Chevrier
 * @version 2.0
 */
public class PlatEnPreparation extends PlatEtat{
    public PlatEnPreparation(PlatChoisi p) {
        super(p);
    }

    /**
     * Passe à la prochaine état du plat
     */
    @Override
    public void next() {
        platChoisi.changeState(new PlatServi(platChoisi));
    }
}
