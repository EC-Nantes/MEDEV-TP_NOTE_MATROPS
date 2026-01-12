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
public class PenduTest {
    
    /**
     *
     */
    public PenduTest() {
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
    public void testNbErreursRestantes() {
        Partie partie = new Partie(1, 5);
        assertEquals(5, partie.getNb_erreurs_restantes());

        partie.setNb_erreurs_restantes(3);
        assertEquals(3, partie.getNb_erreurs_restantes());
    }
}
