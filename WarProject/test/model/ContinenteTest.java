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
public class ContinenteTest {
    
    public ContinenteTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getTerritorios method, of class Continente.
     */
    @Ignore
    @Test
    public void testGetTerritorios() {
        System.out.println("getTerritorios");
        Continente instance = null;
        Territorio[] expResult = null;
        Territorio[] result = instance.getTerritorios();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTerritorios method, of class Continente.
     */
    @Ignore
    @Test
    public void testSetTerritorios() {
        System.out.println("setTerritorios");
        Territorio[] territorios = null;
        Continente instance = null;
        instance.setTerritorios(territorios);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNome method, of class Continente.
     */
    @Ignore
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        Continente instance = null;
        String expResult = "";
        String result = instance.getNome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNome method, of class Continente.
     */
    @Ignore
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "";
        Continente instance = null;
        instance.setNome(nome);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
