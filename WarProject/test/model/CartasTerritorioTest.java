/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.util.Random;
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
        System.out.println("Class CartasTerritorio: Method getTerritorio()");
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
        System.out.println("Class CartasTerritorio: Method setTerritorio(Territorio)");
        Territorio territorio1 = new Territorio(1, "1", null, null, 1);
        Territorio territorio2 = new Territorio(2, "2", null, null, 1);
        CartasTerritorio instance = new CartasTerritorio(territorio1, 0);
        instance.setTerritorio(territorio2);
        assertEquals(territorio2, instance.getTerritorio());
    }

    /**
     * Test of getFormaGeometrica method, of class CartasTerritorio.
     */
    @Test
    public void testGetFormaGeometrica() {
        System.out.println("Class CartasTerritorio: Method getFormaGeometrica()");
        CartasTerritorio instance = null;
        int expResult = 0;
        int result = 0;
        

            int expResult1 = 0;
            instance = new CartasTerritorio(null, expResult1);
            result = instance.getFormaGeometrica();
            
                assertEquals(1, result);
            
    }

    /**
     * Test of setFormaGeometrica method, of class CartasTerritorio.
     */
    @Test
    public void testSetFormaGeometrica() {
        System.out.println("Class CartasTerritorio: Method setFormaGeometrica(int)");
        CartasTerritorio instance = new CartasTerritorio(null, 0);
        int expResult = 0;
        int result = 0;
        
            expResult = 1;
            instance.setFormaGeometrica(expResult);
            result = instance.getFormaGeometrica();
            
                assertEquals(1, result);
    }

    /**
     * Test of getNomeFormaGeometrica method, of class CartasTerritorio.
     */
    @Test
    public void testGetNomeFormaGeometrica() {
        System.out.println("Class CartasTerritorio: Method getNomeFormaGeometrica()");
        CartasTerritorio instance = new CartasTerritorio(null, 0);
        
        String expResult = "Quadrado";
        String result = instance.getNomeFormaGeometrica();
        assertEquals(expResult, result);
        
        instance.setFormaGeometrica(1);
        expResult = "Triangulo";
        result = instance.getNomeFormaGeometrica();
        assertEquals(expResult, result);
        
        instance.setFormaGeometrica(2);
        expResult = "Circulo";
        result = instance.getNomeFormaGeometrica();
        assertEquals(expResult, result);
    }
    
}
