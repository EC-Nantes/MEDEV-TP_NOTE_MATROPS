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
    
    public PartieTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
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

    @Test
    public void testGetSetEtat() {
        Partie partie = new Partie(1, 10);
        partie.setEtat(2);
        assertEquals(2, partie.getEtat());
    }

    @Test
    public void testGetSetNbRounds() {
        Partie partie = new Partie(1, 10);
        partie.setNb_rounds(15);
        assertEquals(15, partie.getNb_rounds());
    }

    @Test
    public void testGetSetNbErreursRestantes() {
        Partie partie = new Partie(1, 10);
        partie.setNb_erreurs_restantes(5);
        assertEquals(5, partie.getNb_erreurs_restantes());
    }

    @Test
    public void testGetSetLettresProposees() {
        Partie partie = new Partie(1, 10);
        ArrayList<String> lettres = new ArrayList<>();
        lettres.add("a");
        lettres.add("b");
        partie.setLettres_proposées(lettres);
        assertEquals(lettres, partie.getLettres_proposées());
    }

    @Test
    public void testAjouterLettreProposee() {
        Partie partie = new Partie(1, 10);
        // Ajouter une lettre et vérifier
        partie.getLettres_proposées().add("c");
        assertTrue(partie.getLettres_proposées().contains("c"));
    }

    @Test
    public void testAfficheToursEtat() {
        Partie partie = new Partie(1, 10);
        // On ne peut pas "tester" le println facilement,
        // mais on peut vérifier que l'état change correctement
        partie.setEtat(1);
        assertEquals(1, partie.getEtat());
        partie.setEtat(2);
        assertEquals(2, partie.getEtat());
    }
}
