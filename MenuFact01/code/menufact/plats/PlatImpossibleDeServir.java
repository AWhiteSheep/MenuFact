package menufact.plats;

/**
 * L'état d'un plat impossible de servir du systeme Menufact
 * @author Naomie L'archevêque Carrière
 * @author Yan Ha Routhier-Chevrier
 * @version 2.0
 */
public class PlatImpossibleDeServir extends PlatEtat{
    public PlatImpossibleDeServir(PlatChoisi p) {
        super(p);
    }

    @Override
    public void next() {
        // ne fait rien
    }
}
