/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.centrale.projet.medev_tp;

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
public class Point2DTest {
    
    public Point2DTest() {
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
     * Test of getX method, of class Test.
     */
    @Test
    public void testGetX() {
        System.out.println("GetX");
        Point2D p = new Point2D(1,2);
        assertEquals(p.getX(),1);
        
    }

    /**
     * Test of setX method, of class Test.
     */
    @Test
    public void testSetX() {
        System.out.println("SetX");
        Point2D p = new Point2D(2,2);
        p.setX(1);
        assertEquals(p.getX(),1);
        
    }

   

    

    /**
     * Test of equals method, of class Test.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Point2D p1 = new Point2D(1,1);
        Point2D p2 = new Point2D(1,1);
        Point2D p3 = new Point2D(1,2);
        assertEquals(p1.equals(p2), true);
        assertEquals(p1.equals(p3), false);
    }
    
}
