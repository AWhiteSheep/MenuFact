package menufact.plats;

/**
 * L'état d'un plat servi du systeme Menufact
 * @author Naomie L'archevêque Carrière
 * @author Yan Ha Routhier-Chevrier
 * @version 2.0
 */
public class PlatServi extends PlatEtat{
    public PlatServi(PlatChoisi p) {
        super(p);
    }

    /**
     * Passe à la prochaine état du plat
     */
    @Override
    public void next() {
        platChoisi.changeState(new PlatTermine(platChoisi));
    }
}
