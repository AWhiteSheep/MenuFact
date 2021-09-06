package menufact.plats;

/**
 * L'état d'un plat du systeme Menufact
 * @author Naomie L'archevêque Carrière
 * @author Yan Ha Routhier-Chevrier
 * @version 2.0
 */
public abstract class PlatEtat {
    protected PlatChoisi platChoisi;

    public PlatEtat(PlatChoisi p) {
        this.platChoisi = p;
    }

    public abstract void next();
}
