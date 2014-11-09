/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;

/**
 *
 * @author Igor
 */
public class CartasTerritorioTest {
    
    public CartasTerritorioTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getTerritorio method, of class CartasTerritorio.
     */
    @Test
    public void testGetTerritorio() {
        System.out.println("getTerritorio");
        Territorio expResult = new Territorio(1, "", null, null, 1);
        CartasTerritorio instance = new CartasTerritorio(expResult, 0);
        Territorio result = instance.getTerritorio();
        assertEquals(expResult, result);
    }

    /**
     * Test of setTerritorio method, of class CartasTerritorio.
     */
    @Test
    public void testSetTerritorio() {
        System.out.println("setTerritorio");
        Territorio territorio1 = new Territorio(1, "1", null, null, 1);
        Territorio territorio2 = new Territorio(2, "2", null, null, 1);
        CartasTerritorio instance = new CartasTerritorio(territorio1, 0);
        instance.setTerritorio(territorio2);
        assertEquals(territorio2, instance.getTerritorio());
    }

    /**
     * Test of getFormaGeometrica method, of class CartasTerritorio.
     */
    @Ignore
    @Test
    public void testGetFormaGeometrica() {
        System.out.println("getFormaGeometrica");
        CartasTerritorio instance = null;
        int expResult = 0;
        int result = instance.getFormaGeometrica();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFormaGeometrica method, of class CartasTerritorio.
     */
    @Ignore
    @Test
    public void testSetFormaGeometrica() {
        System.out.println("setFormaGeometrica");
        int formaGeometrica = 0;
        CartasTerritorio instance = null;
        instance.setFormaGeometrica(formaGeometrica);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
