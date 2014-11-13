/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.awt.Color;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Samsung
 */
public class AtaqueTest {
    
    public AtaqueTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getNovaQtdTerritorioAtaque method, of class Ataque.
     */
    @Test
    public void testGetNovaQtdTerritorioAtaque() {
        System.out.println("getNovaQtdTerritorioAtaque");
        Ataque instance = null;
        int expResult = 0;
        int result = instance.getNovaQtdTerritorioAtaque();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNovaQtdTerritorioDefesa method, of class Ataque.
     */
    @Test
    public void testGetNovaQtdTerritorioDefesa() {
        System.out.println("getNovaQtdTerritorioDefesa");
        Ataque instance = null;
        int expResult = 0;
        int result = instance.getNovaQtdTerritorioDefesa();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getQtdExercitosDoAtacanteParaMover method, of class Ataque.
     */
    @Test
    public void testGetQtdExercitosDoAtacanteParaMover() {
        System.out.println("getQtdExercitosDoAtacanteParaMover");
        Ataque instance = null;
        String expResult = "";
        String result = instance.getQtdExercitosDoAtacanteParaMover();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCorDoAtacante method, of class Ataque.
     */
    @Test
    public void testGetCorDoAtacante() {
        System.out.println("getCorDoAtacante");
        Ataque instance = null;
        Color expResult = null;
        Color result = instance.getCorDoAtacante();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDadosAtaque method, of class Ataque.
     */
    @Test
    public void testGetDadosAtaque() {
        System.out.println("getDadosAtaque");
        Ataque instance = null;
        int[] expResult = null;
        int[] result = instance.getDadosAtaque();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDadosDefesa method, of class Ataque.
     */
    @Test
    public void testGetDadosDefesa() {
        System.out.println("getDadosDefesa");
        Ataque instance = null;
        int[] expResult = null;
        int[] result = instance.getDadosDefesa();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIndiceAtaque method, of class Ataque.
     */
    @Test
    public void testGetIndiceAtaque() {
        System.out.println("getIndiceAtaque");
        Ataque instance = null;
        int expResult = 0;
        int result = instance.getIndiceAtaque();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIndiceDefesa method, of class Ataque.
     */
    @Test
    public void testGetIndiceDefesa() {
        System.out.println("getIndiceDefesa");
        Ataque instance = null;
        int expResult = 0;
        int result = instance.getIndiceDefesa();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ataqueConquistou method, of class Ataque.
     */
    @Test
    public void testAtaqueConquistou() {
        System.out.println("ataqueConquistou");
        Ataque instance = null;
        boolean expResult = false;
        boolean result = instance.ataqueConquistou();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMensagemErro method, of class Ataque.
     */
    @Test
    public void testGetMensagemErro() {
        System.out.println("getMensagemErro");
        Ataque instance = null;
        String expResult = "";
        String result = instance.getMensagemErro();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIndiceJogadorAtaque method, of class Ataque.
     */
    @Test
    public void testGetIndiceJogadorAtaque() {
        System.out.println("getIndiceJogadorAtaque");
        Ataque instance = null;
        int expResult = 0;
        int result = instance.getIndiceJogadorAtaque();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of AconteceuErro method, of class Ataque.
     */
    @Test
    public void testAconteceuErro() {
        System.out.println("AconteceuErro");
        Ataque instance = null;
        boolean expResult = false;
        boolean result = instance.AconteceuErro();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getQtdExercitosPerdidosAtaque method, of class Ataque.
     */
    @Test
    public void testGetQtdExercitosPerdidosAtaque() {
        System.out.println("getQtdExercitosPerdidosAtaque");
        Ataque instance = null;
        int expResult = 0;
        int result = instance.getQtdExercitosPerdidosAtaque();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getQtdExercitosPerdidosDefesa method, of class Ataque.
     */
    @Test
    public void testGetQtdExercitosPerdidosDefesa() {
        System.out.println("getQtdExercitosPerdidosDefesa");
        Ataque instance = null;
        int expResult = 0;
        int result = instance.getQtdExercitosPerdidosDefesa();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
