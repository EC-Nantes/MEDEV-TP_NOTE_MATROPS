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
    
    public PenduTest() {
    }
    
    @Test
    public void testisMot() {
        Mot mot = new Mot();
        assertTrue(mot.isMot("a"));
        assertTrue(mot.isMot("z"));
        assertFalse(mot.isMot("ab"));
        assertFalse(mot.isMot("1"));
        assertFalse(mot.isMot(""));
        assertFalse(mot.isMot(null));
    }

}
