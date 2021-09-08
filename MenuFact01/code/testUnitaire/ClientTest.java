package testUnitaire;

import menufact.Client;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Classe test pour le client du systeme Menufact.
 * @author Naomie L'archevêque Carrière
 * @author Yan Ha Routhier-Chevrier
 * @version 2.0
 */
class ClientTest {
    private Client client;

    /**
     * Création du client avant le test.
     */
    @BeforeEach
    void setUp() {
        client = new Client(1,"Marc Valentin","1234567890");
    }

    /**
     * Test si nous sommes en mesure de lire l'identifiant du client.
     */
    @Test
    void getIdClient() {
        assertEquals(1, client.getIdClient(), "Vérification si idClient est 1.");
    }

    /**
     * Test si nous sommes en mesure de faire la mise à jour de l'identifiant du client.
     */
    @Test
    void setIdClient() {
        client.setIdClient(50);
        assertEquals(50, client.getIdClient(), "Vérification si idClient est mise à jour à 50.");
    }

    /**
     * Test si nous sommes en mesure de faire la lecture du nom du client.
     */
    @Test
    void getNom() {
        assertEquals("Marc Valentin", client.getNom(), "Vérification si nom du client est Marc Valentin.");
    }

    /**
     * Test si nous sommes en mesure de faire la mise à jour du nom du client.
     */
    @Test
    void setNom() {
        client.setNom("Marc Anger");
        assertEquals("Marc Anger", client.getNom(), "Vérification si nom du client est bien mis à jour.");
    }

    /**
     * Test si nous sommes en mesure de lire le numéro de carte de crédit du client.
     */
    @Test
    void getNumeroCarteCredit() {
        assertEquals("1234567890", client.getNumeroCarteCredit(), "Vérification si numéro de carte de crédit est 1234567890.");
    }

    /**
     * Test si nous sommes en mesure de faire la mise à jour du numéro de carte de crédit.
     */
    @Test
    void setNumeroCarteCredit() {
        client.setNumeroCarteCredit("0987654321");
        assertEquals("0987654321", client.getNumeroCarteCredit(), "Vérification si numéro de carte de crédit est mis à jour.");
    }
}