package ingredients;

/**
 * Classe pour les unités de linventaire du systeme Menufact
 * @author Naomie L'archevêque Carrière
 * @author Yan Ha Routhier-Chevrier
 * @version 2.0
 */
public class Unit {
    private String nom;

    /**
     * Constructeur pour l'unité
     * @param nom Le nom de l'unité
     */
    public Unit(String nom) {
        this.nom =nom ;
    }

    /**
     *
     * @return Le nom de l'unité
     */
    public String getNom() {
        return nom;
    }

    /**
     *
     * @param nom Le nouveau nom de l'unité
     */
    public void setNom(String nom) {
        this.nom = nom;
    }


}
