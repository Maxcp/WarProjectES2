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
    @Test
    public void testGetTerritorios() {
        System.out.println("getTerritorios");
        Territorio[] expResult = new Territorio[10];
        Continente instance = new Continente("", expResult);
        Territorio[] result = instance.getTerritorios();
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of setTerritorios method, of class Continente.
     */
    @Test
    public void testSetTerritorios() {
        System.out.println("setTerritorios");
        Territorio[] territorios1 = new Territorio[10];
        Territorio[] territorios2 = new Territorio[10];
        Continente instance = new Continente("", territorios1);
        instance.setTerritorios(territorios2);
        assertArrayEquals(territorios2, instance.getTerritorios());
    }

    /**
     * Test of getNome method, of class Continente.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        Continente instance = new Continente("Teste", null);
        String expResult = "Teste";
        String result = instance.getNome();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNome method, of class Continente.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "Teste";
        Continente instance = new Continente("Continente", null);
        instance.setNome(nome);
        String result = instance.getNome();
        assertEquals(nome, result);
    }
    
}
