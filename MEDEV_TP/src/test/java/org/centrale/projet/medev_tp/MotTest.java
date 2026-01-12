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

    /**
     *
     */
    public MotTest() {
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

    /**
     *
     */
    @Test
    public void testOccurence() {
        System.out.println("TestOccurence");
        Mot mot = new Mot();
        ArrayList<String> mot1 = new ArrayList<>();
        ArrayList<String> mot2 = new ArrayList<>();
        mot1.add("t");
        mot1.add("e");
        mot1.add("s");
        mot1.add("t");
        
        mot2.add("b");
        mot2.add("a");
        mot2.add("b");
        mot2.add("a");
        
        List<Integer> oc1 = new ArrayList<>();
        List<Integer> oc2 = new ArrayList<>();
        List<Integer> oc3 = new ArrayList<>();
        List<Integer> oc4 = new ArrayList<>();
        oc1.add(1);
        
        oc3.add(0);
        oc3.add(2);
        
        oc4.add(1);
        oc4.add(3);

        System.out.println("Mot 1 : " + mot1);
        assertEquals(oc1, mot.occurrence(mot1, "e"));
        System.out.println("Mot 1 : " + mot1);
        assertEquals(oc2, mot.occurrence(mot1, "o"));

        System.out.println("Mot 2 : " + mot1);
        assertEquals(oc3, mot.occurrence(mot2, "b"));
        
        System.out.println("Mot 2 : " + mot1);
        assertEquals(oc4, mot.occurrence(mot2, "a"));

    }

}
