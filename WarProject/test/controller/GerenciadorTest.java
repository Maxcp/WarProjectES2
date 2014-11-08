/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import javax.swing.JButton;
import model.Jogador;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;

/**
 *
 * @author Igor
 */
public class GerenciadorTest {
    
    public GerenciadorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getInstance method, of class Gerenciador.
     */
    @Ignore
    @Test
    public void testGetInstance_StringArrArr() {
        System.out.println("getInstance");
        String[][] paramentros = null;
        Gerenciador expResult = null;
        Gerenciador result = Gerenciador.getInstance(paramentros);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getInstance method, of class Gerenciador.
     */
    @Ignore
    @Test
    public void testGetInstance_0args() {
        System.out.println("getInstance");
        Gerenciador expResult = null;
        Gerenciador result = Gerenciador.getInstance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFaseDaRodada method, of class Gerenciador.
     */
    @Ignore
    @Test
    public void testGetFaseDaRodada() {
        System.out.println("getFaseDaRodada");
        Gerenciador instance = null;
        int expResult = 0;
        int result = instance.getFaseDaRodada();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFaseDaRodada method, of class Gerenciador.
     */
    @Ignore
    @Test
    public void testSetFaseDaRodada() {
        System.out.println("setFaseDaRodada");
        int novaFase = 0;
        Gerenciador instance = null;
        instance.setFaseDaRodada(novaFase);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pegaJogadorDaRodada method, of class Gerenciador.
     */
    @Ignore
    @Test
    public void testPegaJogadorDaRodada() {
        System.out.println("pegaJogadorDaRodada");
        Gerenciador instance = null;
        Jogador expResult = null;
        Jogador result = instance.pegaJogadorDaRodada();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEditavelApenasTerritoriosDoJogadorAtual method, of class Gerenciador.
     */
    @Ignore
    @Test
    public void testSetEditavelApenasTerritoriosDoJogadorAtual() {
        System.out.println("setEditavelApenasTerritoriosDoJogadorAtual");
        JButton[] btnterritorios = null;
        Gerenciador instance = null;
        instance.setEditavelApenasTerritoriosDoJogadorAtual(btnterritorios);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTerritoriosJogadores method, of class Gerenciador.
     */
    @Ignore
    @Test
    public void testSetTerritoriosJogadores() {
        System.out.println("setTerritoriosJogadores");
        JButton[] btnterritorios = null;
        Gerenciador instance = null;
        instance.setTerritoriosJogadores(btnterritorios);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
