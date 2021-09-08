package menufact;

import menufact.exceptions.MenuException;
import menufact.plats.PlatAuMenu;

import java.util.ArrayList;

/**
 * Classe du menu du systeme Menufact
 * @author Naomie L'archevêque Carrière
 * @author Yan Ha Routhier-Chevrier
 * @version 2.0
 */
public class Menu {

    private String description;
    private int courant;
    private ArrayList<PlatAuMenu> plat = new ArrayList<PlatAuMenu>();

    /**
     *
     * @param description la description du menu
     */
    public Menu(String description) {
        this.description = description;
    }

    /**
     * ajouter un plat au menu
     * @param p le plat a ajouter au menu
     */
    public void ajoute (PlatAuMenu p)
    {
        plat.add(p);
    }

    /**
     * definir la position courante du plat
     * @param i lindex de la position
     */
    public void position(int i)
    {
        courant = i;
    }

    /**
     *
     * @return le plat a la position courante
     */
    public PlatAuMenu platCourant()
    {
        return plat.get(courant);
    }

    /**
     * on deplace le plat courant a la position suivante
     * @throws MenuException si la position suivante ne depasse pas le nombre total de plat dans le menu
     */
    public void positionSuivante() throws MenuException
    {
        if (courant+1 >= plat.size())
            throw new MenuException("On depasse le nombre maximale de plats.");
        else
            courant++;
    }

    /**
     * on deplace le plat courant a la position precedente
     * @throws MenuException si la position precedente ne depasse pas le nombre minimal de plats
     */
    public void positionPrecedente() throws MenuException
    {
        if (courant-1 < 0)
            throw new MenuException("On depasse le nombre minimale de plats");
        else
            courant--;
    }

    /**
     *
     * @return le nombre total de plat dans le menu
     */
    public int menuItemCount() {
        return plat.size();
    }

    /**
     *
     * @return les infos du menu
     */
    @Override
    public String toString() {
        return "menufact.Menu{" +
                "description='" + description + '\'' +
                ", courant=" + courant +
                ", plat=" + "\n" + plat +
                '}';
    }
}
