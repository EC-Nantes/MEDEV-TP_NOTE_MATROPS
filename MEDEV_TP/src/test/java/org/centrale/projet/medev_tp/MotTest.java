/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.centrale.projet.medev_tp;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Max
 */
public class MotTest {
    
    
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
     * Test of isMot method, of class Mot.
     */
    @Test
    public void testIsMot() {
        System.out.println("isMot");
        Mot mot = new Mot();
        String mot1 = "";
        String mot2 = "Test";
        String mot3 = "Test3";
        System.out.println("Mot 1 : " + mot1);
        assertEquals(false, mot.isMot(mot1));
        System.out.println("Mot 2 : " + mot2);
        assertEquals(true, mot.isMot(mot2));
        System.out.println("Mot 3 : " + mot3);
        assertEquals(false, mot.isMot(mot3));
    }

    /**
     * Test of afficheListeAfficher method, of class Mot.
     */
    @Test
    public void testAfficheListeAfficher() {
        System.out.println("afficheListeAfficher");
        Mot mot = new Mot();
        mot.afficheListeAfficher();
        List<String> affiche = new ArrayList<String>();
        affiche.add("b");
        mot.setMaListeAfficher(affiche);
        mot.afficheListeAfficher();
        
    }
    
    
    
}
