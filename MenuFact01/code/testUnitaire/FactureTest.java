package testUnitaire;

import menufact.facture.*;
import menufact.Client;
import menufact.facture.exceptions.FactureException;
import menufact.plats.PlatAuMenu;
import menufact.plats.PlatChoisi;
import menufact.plats.PlatEtat;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Classe test pour la facture du systeme Menufact
 * @author Naomie L'archevêque Carrière
 * @author Yan Ha Routhier-Chevrier
 * @version 2.0
 */

class FactureTest {
    Facture facture;
    Client client1;
    FactureOuverte etat;
    PlatAuMenu plataumenu;
    PlatChoisi newPlat;

    /**
     * preparation au banc de test pour la facture
     */
    @BeforeEach
    void setUp() {
        this.facture = new Facture("Test facture");
        this.client1 = new Client(1, "TEST set client", "12345");
        facture.setClient(client1);
        this.etat = new FactureOuverte(facture);
        this.plataumenu = new PlatAuMenu(1, "test plat au menu", 2.0);
        this.newPlat = new PlatChoisi(plataumenu, 5);
    }

    /**
     * test pour associer le client à la facture
     */
    @Test
    void associerClient() {
        try{
            facture.associerClient(client1);
        } catch (FactureException fe)
        {
            System.out.println(fe.getMessage());
        }

        assertEquals(client1, facture.getClient(), "le client associe a letat de la facture est le meme que la facture");
    }

    /**
     * test pour indiquer le client de la facture
     */
    @Test
    void setClient() {

        facture.setClient(client1);
        assertEquals(client1, facture.getClient(), "verification le client est le meme qui a ete ajoute");
    }

    /**
     * test pour obtenir le client de la facture
     */
    @Test
    void getClient() {

        facture.setClient(client1);
        assertEquals(client1, facture.getClient(), "verification client est le meme qui a ete ajoute");
    }

    /**
     * test pour obtenir le sous total de la facture
     */
    @Test
    void sousTotal() {
        facture.addPlat(newPlat);
        assertEquals(10.0, facture.sousTotal());
        facture.addPlat(newPlat);
        assertEquals(20.0, facture.sousTotal());
    }

    /**
     * test pour obtenir le total de la facture
     */
    @Test
    void total() {
        facture.addPlat(newPlat);
        assertEquals(11.4975, facture.total());
    }

    /**
     * test pour changer letat de la facture a payer
     */
    @Test
    void payer() {
        Assertions.assertThrows(FactureException.class, () -> facture.payer(), "Test la facture ne peut pas être payer si elle n'est pas fermee.");
        facture.changeState(new FactureFermee(facture));
        Assertions.assertDoesNotThrow(() -> facture.payer(), "Test la facture devient payee.");
        Assertions.assertTrue(facture.getEtat().getClass() == FacturePayee.class, "Facture est payee");
        Assertions.assertFalse(facture.getEtat().getClass()== FactureOuverte.class, "Facture ne devient pas ouverte, est payee");
        Assertions.assertFalse(facture.getEtat().getClass() == FactureFermee.class, "Facture ne devient pas fermee, est payee");
        Assertions.assertThrows(FactureException.class, () -> facture.payer(), "Test la facture ne peut pas être payer si elle est déjà payee.");
    }

    /**
     * test pour changer letat de la facture a fermer
     */
    @Test
    void fermer() {
        try{
            facture.fermer();
        } catch (FactureException fe)
        {
            System.out.println(fe.getMessage());
        }

        Assertions.assertFalse(facture.getEtat().getClass() == FacturePayee.class, "Facture ne devient pas fermee, est payee");
        Assertions.assertFalse(facture.getEtat().getClass()== FactureOuverte.class, "Facture ne devient pas fermee, est ouverte");
        Assertions.assertTrue(facture.getEtat().getClass() == FactureFermee.class, "Facture devient fermee");

    }

    /**
     * test pour changer letat de la facture a ouvert
     */
    @Test
    void ouvrir() {
        try{
            facture.ouvrir();
        } catch (FactureException fe)
        {
            System.out.println(fe.getMessage());
        }

        Assertions.assertFalse(facture.getEtat().getClass() == FacturePayee.class, "Facture ne devient pas ouverte, est payee");
        Assertions.assertTrue(facture.getEtat().getClass()== FactureOuverte.class, "Facture devient ouverte");
        Assertions.assertFalse(facture.getEtat().getClass() == FactureFermee.class, "Facture ne devient pas ouverte, est fermee");

    }

    /**
     * test pour avoir letat de la facture
     */
    @Test
    void getEtat() {

        try{
            facture.ouvrir();
        } catch (FactureException fe)
        {
            System.out.println(fe.getMessage());
        }

        Assertions.assertFalse(facture.getEtat().getClass() == FacturePayee.class, "Facture ne devient pas ouverte, est payee");
        Assertions.assertTrue(facture.getEtat().getClass()== FactureOuverte.class, "Facture devient ouverte");
        Assertions.assertFalse(facture.getEtat().getClass() == FactureFermee.class, "Facture ne devient pas ouverte, est fermee");

    }

    /**
     * test pour changer letat de la facture pour le prochain etat
     */
    @Test
    void changeState() {
        FactureEtat factureetat = new FactureOuverte(facture);
        facture.changeState(factureetat);

        Assertions.assertFalse(facture.getEtat().getClass() == FacturePayee.class, "Facture ne devient pas ouverte, est payee");
        Assertions.assertTrue(facture.getEtat().getClass()== FactureOuverte.class, "Facture devient ouverte");
        Assertions.assertFalse(facture.getEtat().getClass() == FactureFermee.class, "Facture ne devient pas ouverte, est fermee");

    }

    /**
     * test pour ajouter un plat a la facture
     */
    @Test
    void ajoutePlat() {
        assertEquals(0, facture.countPlatchoisi(), "verification sil ny a pas de plat ajouter");

        try{
            facture.ajoutePlat(newPlat);
        } catch (FactureException fe)
        {
           System.out.println(fe.getMessage());
        }

        assertEquals(1, facture.countPlatchoisi(), "verification sil y a un plat dajouter");
    }

    /**
     * test pour ajouter un plat a la facture
     */
    @Test
    void addPlat() {
        assertEquals(0, facture.countPlatchoisi(), "Verification sil ny a aucun plat dajouter");
        facture.addPlat(newPlat);
        assertEquals(1, facture.countPlatchoisi(), "verification sil y a un plat dajouter");
    }

    /**
     * test pour generer la facture
     */
    @Test
    void genererFacture() {
        Assertions.assertDoesNotThrow(() -> facture.genererFacture(), "Vérification de la génération de la facture.");
        Assertions.assertTrue(facture.genererFacture().getClass() == String.class, "Vérification si la génération de la facture retourne un String.");
    }
}