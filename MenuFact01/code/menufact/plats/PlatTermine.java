package menufact.plats;

/**
 * L'état d'un plat terminé du systeme Menufact
 * @author Naomie L'archevêque Carrière
 * @author Yan Ha Routhier-Chevrier
 * @version 2.0
 */
public class PlatTermine extends PlatEtat{
    public PlatTermine(PlatChoisi p) {
        super(p);
    }

    @Override
    public void next() {
        // ne fait rien
    }
}
