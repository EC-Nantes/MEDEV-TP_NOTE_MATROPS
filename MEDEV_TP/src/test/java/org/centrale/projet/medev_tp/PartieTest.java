/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.centrale.projet.medev_tp;

import java.util.ArrayList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author selli
 */
public class PartieTest {
    
    /**
     *
     */
    public PartieTest() {
    }
    
    /**
     *
     */
    @BeforeAll
    public static void setUpClass() {
    }
    
    /**
     *
     */
    @AfterAll
    public static void tearDownClass() {
    }
    
    /**
     *
     */
    @BeforeEach
    public void setUp() {
    }
    
    /**
     *
     */
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getMode method, of class Partie.
     */
    @Test
    public void testGetSetMode() {
        Partie partie = new Partie(1, 10);
        partie.setMode(1);
        assertEquals(1, partie.getMode());
    }

    /**
     *
     */
    @Test
    public void testGetSetEtat() {
        Partie partie = new Partie(1, 10);
        partie.setEtat(2);
        assertEquals(2, partie.getEtat());
    }

    /**
     *
     */
    @Test
    public void testGetSetNbRounds() {
        Partie partie = new Partie(1, 10);
        partie.setNb_rounds(15);
        assertEquals(15, partie.getNb_rounds());
    }

    /**
     *
     */
    @Test
    public void testGetSetNbErreursRestantes() {
        Partie partie = new Partie(1, 10);
        partie.setNb_erreurs_restantes(5);
        assertEquals(5, partie.getNb_erreurs_restantes());
    }

    /**
     *
     */
    @Test
    public void testGetSetLettresProposees() {
        Partie partie = new Partie(1, 10);
        ArrayList<String> lettres = new ArrayList<>();
        lettres.add("a");
        lettres.add("b");
        partie.setLettres_proposées(lettres);
        assertEquals(lettres, partie.getLettres_proposées());
    }

    /**
     *
     */
    @Test
    public void testCreationPartie() {
        Partie partie1 = new Partie(1, 10);
        Partie partie2 = new Partie(2, 15);

        assertEquals(0, partie1.getMode()); // 1 joueur -> mode 0
        assertEquals(1, partie2.getMode()); // 2 joueurs -> mode 1

        assertEquals(10, partie1.getNb_rounds());
        assertEquals(15, partie2.getNb_rounds());

        assertEquals(10, partie1.getNb_erreurs_restantes());
        assertEquals(15, partie2.getNb_erreurs_restantes());

        assertNotNull(partie1.getLettres_proposées());
        assertTrue(partie1.getLettres_proposées().isEmpty());
    }

    /**
     *
     */
    @Test
    public void testGestionLettresProposees() {
        Partie partie = new Partie(1, 10);
        partie.getLettres_proposées().add("a");
        partie.getLettres_proposées().add("b");

        assertEquals(2, partie.getLettres_proposées().size());
        assertTrue(partie.getLettres_proposées().contains("a"));
        assertTrue(partie.getLettres_proposées().contains("b"));
    }

    /**
     *
     */
    @Test
    public void testEtatPartie() {
        Partie partie = new Partie(1, 5);
        assertEquals(0, partie.getEtat());

        partie.setEtat(1);
        assertEquals(1, partie.getEtat()); // gagné

        partie.setEtat(2);
        assertEquals(2, partie.getEtat()); // perdu
    }
    
    /**
     *
     */
    @Test
    public void testEtatInitialPartie() {
        Partie partie = new Partie(1, 7);
        assertEquals(0, partie.getEtat());
        assertEquals(7, partie.getNb_erreurs_restantes());
        assertTrue(partie.getLettres_proposées().isEmpty());
    }

    /**
     *
     */
    @Test
    public void testAjouterLettreProposee() {
        Partie partie = new Partie(1, 7);
        partie.getLettres_proposées().add("a");
        assertTrue(partie.getLettres_proposées().contains("a"));
        // ajouter lettre déjà proposée ne change rien
        int sizeBefore = partie.getLettres_proposées().size();
        partie.getLettres_proposées().add("a");
        assertEquals(sizeBefore + 1, partie.getLettres_proposées().size()); // attention, ArrayList permet doublons
    }

    /**
     *
     */
    @Test
    public void testNbErreursRestantes() {
        Partie partie = new Partie(1, 7);
        partie.setNb_erreurs_restantes(5);
        assertEquals(5, partie.getNb_erreurs_restantes());
        partie.setNb_erreurs_restantes(partie.getNb_erreurs_restantes() - 1);
        assertEquals(4, partie.getNb_erreurs_restantes());
    }

    /**
     *
     */
    @Test
    public void testEtatVictoireDefaite() {
        Partie partie = new Partie(1, 2);
        assertEquals(0, partie.getEtat());

        partie.setEtat(1); // victoire
        assertEquals(1, partie.getEtat());

        partie.setEtat(2); // défaite
        assertEquals(2, partie.getEtat());
    }
}
