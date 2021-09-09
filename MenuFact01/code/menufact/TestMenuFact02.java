package menufact;

import ingredients.*;
import ingredients.exceptions.IngredientException;
import inventaire.Inventaire;
import menufact.facture.exceptions.FactureException;
import menufact.exceptions.MenuException;
import menufact.facture.Facture;
import menufact.plats.*;

public class TestMenuFact02 {

    public static void main(String[] args) {
        boolean trace = true;

        // Setup pour chef, inventaire, et ingredient manager
        Chef chef = new Chef();
        Inventaire inventaire = Inventaire.getInventaire();
        IngredientManager ingredientManager = IngredientManager.getIngredientManager();
        ingredientManager.setInventaire(inventaire);
        chef.setIngredientManager(ingredientManager);

        Fruit apple = new Fruit("Apple");
        Fruit banane = new Fruit("Banane");
        Fruit fraise = new Fruit("Fraise");

        Laitier lait = new Laitier("Lait 3%");

        inventaire.ajouter(banane, 100000);
        inventaire.ajouter(fraise, 100000);
        inventaire.ajouter(apple, 100000);
        inventaire.ajouter(lait, 100000);

        System.out.println(inventaire.getIngredientInventaire(banane));
        System.out.println(inventaire.getIngredientInventaire(fraise));
        System.out.println(inventaire.getIngredientInventaire(apple));
        System.out.println(inventaire.getIngredientInventaire(lait));

        TestMenuFact02 t = new TestMenuFact02();

        PlatAuMenu p1 = new PlatAuMenu(0,"PlatAuMenu0",10);
        PlatAuMenu p2 = new PlatAuMenu(1,"PlatAuMenu1",20);
        PlatAuMenu p3 = new PlatAuMenu(2,"PlatAuMenu2",30);
        PlatAuMenu p4 = new PlatAuMenu(3,"PlatAuMenu3",40);
        PlatAuMenu p5 = new PlatAuMenu(4,"PlatAuMenu4",50);


        PlatSante ps1 = new PlatSante(10,"PlatSante0",10,11,11,11);
        PlatSante ps2 = new PlatSante(11,"PlatSante1",20,11,11,11);
        PlatSante ps3 = new PlatSante(12,"PlatSante2",30,11,11,11);
        PlatSante ps4 = new PlatSante(13,"PlatSante3",40,11,11,11);
        PlatSante ps5 = new PlatSante(14,"PlatSante4",50,11,11,11);

        PlatEnfant pe1 = new PlatEnfant(15, "PlatEnfant0", 10, .55);
        PlatEnfant pe2 = new PlatEnfant(16, "PlatEnfant1", 20, .65);
        PlatEnfant pe3 = new PlatEnfant(17, "PlatEnfant2", 30, .75);
        PlatEnfant pe4 = new PlatEnfant(18, "PlatEnfant3", 40, .65);
        PlatEnfant pe5 = new PlatEnfant(19, "PlatEnfant4", 50, .55);

        p1.addIngredient(fraise, 50);
        p1.addIngredient(banane, 50);
        p2.addIngredient(banane, 50);
        p3.addIngredient(banane, 50);
        p4.addIngredient(banane, 50);

        Menu m1 = new Menu("menufact.Menu 1");
        Menu m2 = new Menu("menufact.Menu 2");

        Facture f1 = new Facture("Ma facture");

        Client c1 = new Client(1,"Mr Client","1234567890");


        t.test1_AffichePlatsAuMenu(trace, p1,p2,p3,p4,p5);
        t.test2_AffichePlatsSante(trace, ps1,ps2,ps3,ps4,ps5);
        t.test3_AffichePlatsEnfants(trace, pe1,pe2,pe3,pe4,pe5);

        t.test4_AjoutPlatsAuMenu(trace, m1, p1, p2, ps1, ps2, pe1, pe2, m2, p3, p4, ps3, ps4, pe3, pe4);


        try {
            t.test5_DeplacementMenuAvancer(m1);
        } catch (MenuException e) {
            System.out.println(e.getMessage());
        }

        try {
            t.test6_DeplacementMenuReculer(m1);
        } catch (MenuException e) {
            System.out.println(e.getMessage());
        }

        try {
            t.test7_CreerFacture(f1, chef, m1);
        } catch (FactureException e) {
            System.out.println(e.getMessage());
        }


        try {
            t.test8_AjouterClientFacture(f1, c1);
        } catch (FactureException e) {
            System.out.println(e.getMessage());
        }

        try {
            t.test8_AjouterPlatsFacture(f1, m1, chef,1);
        } catch (FactureException fe)
        {
            System.out.println(fe.getMessage());
        }
        catch (MenuException me)
        {
            System.out.println(me);
        }

        try {
            t.test9_PayerFacture(f1);
        } catch (FactureException e) {
            System.out.println(e.getMessage());
        }

        try {
            t.test8_AjouterPlatsFacture(f1, m1,chef,1);
        } catch (FactureException fe)
        {
            System.out.println(fe.getMessage());
        }
        catch (MenuException me)
        {
            System.out.println(me);
        }

        try {
            f1.ouvrir();
        } catch (FactureException fe)
        {
            System.out.println(fe.getMessage());
        }






        System.out.println("FIN DE TOUS LES TESTS...");

        System.out.println(f1.genererFacture());

        System.out.println(inventaire.getIngredientInventaire(banane));
        System.out.println(inventaire.getIngredientInventaire(fraise));
        System.out.println(inventaire.getIngredientInventaire(apple));
        System.out.println(inventaire.getIngredientInventaire(lait));
    }

    private void test1_AffichePlatsAuMenu(boolean trace, PlatAuMenu p1, PlatAuMenu p2,
                                                 PlatAuMenu p3, PlatAuMenu p4, PlatAuMenu p5)
    {
        System.out.println("=== test1_AffichePlatsAuMenu");
        if(trace)
        {
            System.out.println(p1);
            System.out.println(p2);
            System.out.println(p3);
            System.out.println(p4);
            System.out.println(p5);
        }
    }


   private void test2_AffichePlatsSante(boolean trace, PlatSante ps1, PlatSante ps2,
                                               PlatSante ps3, PlatSante ps4, PlatSante ps5)
    {
        System.out.println("=== test2_AffichePlatsSante");

        if(trace)
        {
            System.out.println(ps1);
            System.out.println(ps2);
            System.out.println(ps3);
            System.out.println(ps4);
            System.out.println(ps5);
        }
    }


    private static void test3_AffichePlatsEnfants(boolean trace, PlatEnfant pe1, PlatEnfant pe2,
                                                  PlatEnfant pe3, PlatEnfant pe4, PlatEnfant pe5)
    {

        System.out.println("=== test3_AffichePlatsEnfants");

        if(trace) {
            System.out.println(pe1);
            System.out.println(pe2);
            System.out.println(pe3);
            System.out.println(pe4);
            System.out.println(pe5);
        }
    }


    private void test4_AjoutPlatsAuMenu(boolean trace, Menu m1,
                                        PlatAuMenu p1, PlatAuMenu p2,
                                        PlatSante ps1, PlatSante ps2,
                                        PlatEnfant pe1, PlatEnfant pe2,
                                        Menu m2,
                                        PlatAuMenu p3, PlatAuMenu p4,
                                        PlatSante ps3, PlatSante ps4,
                                        PlatEnfant pe3, PlatEnfant pe4)
    {
        System.out.println("=== test4_AjoutPlatsAuMenu");
        System.out.println("=== Ajout de plats au menu 1");
        m1.ajoute(p1);
        m1.ajoute(p2);
        m1.ajoute(ps1);
        m1.ajoute(ps2);
        m1.ajoute(pe1);
        m1.ajoute(pe2);


        System.out.println("=== Ajout de plats au menu 2");
        m2.ajoute(p3);
        m2.ajoute(p4);
        m2.ajoute(ps3);
        m2.ajoute(ps4);
        m2.ajoute(pe3);
        m2.ajoute(pe4);

        if(trace) {
            System.out.println(m1);
            System.out.println(m2);
        }
    }


    private void test5_DeplacementMenuAvancer(Menu m1) throws MenuException
    {
        System.out.println("=== test5_DeplacementMenuAvancer");

        System.out.println("===Selectionner un plat du menu 0");
        m1.position(0);

        System.out.println("=== Afficher le plat courant");
        System.out.println(m1.platCourant());
        try {

            System.out.println("=== Avancer le plat courant");
            System.out.println("1.");
            m1.positionSuivante();
            System.out.println("2.");
            m1.positionSuivante();
            System.out.println("3.");
            m1.positionSuivante();
            System.out.println("4.");
            m1.positionSuivante();
            System.out.println("5.");
            m1.positionSuivante();
        }
        catch (MenuException me)
        {
                throw me;
        }
    }


    private void test6_DeplacementMenuReculer(Menu m1) throws MenuException
    {
        System.out.println("===test6_DeplacementMenuReculer");

        System.out.println("===Selectionner un plat du menu 3");
        m1.position(3);

        System.out.println("=== Afficher le plat courant");
        System.out.println(m1.platCourant());
        try {

            System.out.println("=== Reculer le plat courant");
            System.out.println("2.");
            m1.positionPrecedente();
            System.out.println("1.");
            m1.positionPrecedente();
            System.out.println("0.");
            m1.positionPrecedente();
            System.out.println("-1.");
            m1.positionPrecedente();
            System.out.println("-2.");
            m1.positionPrecedente();
        }
        catch (MenuException me)
        {
            throw me;
        }
    }

    private void test7_CreerFacture(Facture f1, Chef chef, Menu m1) throws FactureException
    {
        System.out.println("===test7_CreerFacture");

        PlatChoisi platChoisi = new PlatChoisi(m1.platCourant(),5, chef);
        System.out.println(platChoisi);
        platChoisi.getEtat().next();
        System.out.println(platChoisi);
        try {
            platChoisi.notifierSubscriber();
        } catch (IngredientException e) {
            e.printStackTrace();
        }
        System.out.println(platChoisi);
        try
        {
            f1.ajoutePlat(platChoisi);
            platChoisi.getEtat().next();
            System.out.println(platChoisi);
            platChoisi.getEtat().next();
        }
        catch (FactureException fe)
        {
            throw fe;
        }
        System.out.println(f1);
    }


    private void test8_AjouterClientFacture(Facture f1,Client c1) throws FactureException {
        System.out.println("===test8_AjouterClientFacture");
        f1.associerClient(c1);
        System.out.println(f1);
    }
    private void test8_AjouterPlatsFacture(Facture f1, Menu m1, Chef chef, int pos) throws MenuException,FactureException
    {
        System.out.println("===test8_AjouterPlatsFacture");

        try{
            for (int i=0; i< pos; i++)
                m1.positionSuivante();
        }
        catch (MenuException me)
        {
            throw me;
        }

        PlatChoisi platChoisi = new PlatChoisi(m1.platCourant(),5, chef);
        try {
            platChoisi.notifierSubscriber();
        } catch (IngredientException e) {
            e.printStackTrace();
        }
        System.out.println(platChoisi);

        try
        {
            f1.ajoutePlat(platChoisi);
            platChoisi.getEtat().next();
            System.out.println(platChoisi);
            platChoisi.getEtat().next();
        }
        catch (FactureException fe)
        {
            throw fe;
        }
        System.out.println(f1);
    }

    private void test9_PayerFacture(Facture f1) throws FactureException {
        System.out.println("===test9_PayerFacture");

        System.out.println("Avant payer la facture");
        System.out.println(f1);
        f1.payer();
        System.out.println("Apres avoir paye la facture");
        System.out.println(f1);
    }

    private void test10_AjouterIngredients() {

    }
}
