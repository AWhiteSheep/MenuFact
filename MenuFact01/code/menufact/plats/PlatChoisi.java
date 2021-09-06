package menufact.plats;

import menufact.plats.PlatAuMenu;

public class PlatChoisi {
    private PlatAuMenu plat;
    private int quantite;
    private PlatEtat etat;

    public PlatChoisi(PlatAuMenu plat, int quantite) {
        this.plat = plat;
        this.quantite = quantite;
    }

    /**
     * Fonction devant être appelé dans les classes enfants de PlatEtat
     * @param etat Le vouvelle état pour le plat choisi
     */
    public void changeState(PlatEtat etat) { this.etat = etat; }

    @Override
    public String toString() {
        return "menufact.plats.PlatChoisi{" +
                "quantite=" + quantite +
                ", plat=" + plat +
                '}';
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public PlatAuMenu getPlat() {
        return plat;
    }
}
