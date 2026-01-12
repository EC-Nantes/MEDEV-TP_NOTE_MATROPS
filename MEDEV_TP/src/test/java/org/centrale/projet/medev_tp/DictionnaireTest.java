/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.centrale.projet.medev_tp;

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
public class DictionnaireTest {
    
    /**
     *
     */
    public DictionnaireTest() {
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
     * Test of lireFichier method, of class Dictionnaire.
     */
    @Test
    public void testLireFichier() {
        System.out.println("lireFichier");
        String path = "dic.txt";
        Dictionnaire dic = new Dictionnaire();
        dic.lireFichier(path);
        if(dic.getMaListeMot().size()==0){
        fail("Il n'y a pas de mot.");
        }
    }

    
    
}
