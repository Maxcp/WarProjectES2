/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.util.List;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;

/**
 *
 * @author Igor
 */
public class TerritorioTest {
    
    public TerritorioTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getId method, of class Territorio.
     */
    @Ignore
    @Test
    public void testGetId() {
        System.out.println("getId");
        Territorio instance = null;
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Territorio.
     */
    @Ignore
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Territorio instance = null;
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNome method, of class Territorio.
     */
    @Ignore
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        Territorio instance = null;
        String expResult = "";
        String result = instance.getNome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNome method, of class Territorio.
     */
    @Ignore
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "";
        Territorio instance = null;
        instance.setNome(nome);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVizinhos method, of class Territorio.
     */
    @Ignore
    @Test
    public void testGetVizinhos() {
        System.out.println("getVizinhos");
        Territorio instance = null;
        Territorio[] expResult = null;
        Territorio[] result = instance.getVizinhos();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isVizinho method, of class Territorio.
     */
    @Ignore
    @Test
    public void testIsVizinho() {
        System.out.println("isVizinho");
        Territorio t = null;
        Territorio instance = null;
        boolean expResult = false;
        boolean result = instance.isVizinho(t);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVizinhos method, of class Territorio.
     */
    @Ignore
    @Test
    public void testSetVizinhos() {
        System.out.println("setVizinhos");
        Territorio[] vizinhos = null;
        Territorio instance = null;
        instance.setVizinhos(vizinhos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getConquistador method, of class Territorio.
     */
    @Ignore
    @Test
    public void testGetConquistador() {
        System.out.println("getConquistador");
        Territorio instance = null;
        Jogador expResult = null;
        Jogador result = instance.getConquistador();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setConquistador method, of class Territorio.
     */
    @Ignore
    @Test
    public void testSetConquistador() {
        System.out.println("setConquistador");
        Jogador conquistador = null;
        Territorio instance = null;
        instance.setConquistador(conquistador);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getExercitosPosicionados method, of class Territorio.
     */
    @Ignore
    @Test
    public void testGetExercitosPosicionados() {
        System.out.println("getExercitosPosicionados");
        Territorio instance = null;
        int expResult = 0;
        int result = instance.getExercitosPosicionados();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setExercitosPosicionados method, of class Territorio.
     */
    @Ignore
    @Test
    public void testSetExercitosPosicionados() {
        System.out.println("setExercitosPosicionados");
        int exercitosPosicionados = 0;
        Territorio instance = null;
        instance.setExercitosPosicionados(exercitosPosicionados);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of retiraUltimoTerritorioDaLista method, of class Territorio.
     */
    @Ignore
    @Test
    public void testRetiraUltimoTerritorioDaLista() {
        System.out.println("retiraUltimoTerritorioDaLista");
        List<Territorio> list = null;
        Territorio expResult = null;
        Territorio result = Territorio.retiraUltimoTerritorioDaLista(list);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of embaralhaTerritorio method, of class Territorio.
     */
    @Ignore
    @Test
    public void testEmbaralhaTerritorio() {
        System.out.println("embaralhaTerritorio");
        List<Territorio> list = null;
        Territorio.embaralhaTerritorio(list);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of distribuiTerritorio method, of class Territorio.
     */
    @Ignore
    @Test
    public void testDistribuiTerritorio() {
        System.out.println("distribuiTerritorio");
        Territorio[] t = null;
        List<Territorio> territorios1 = null;
        List<Territorio> territorios2 = null;
        List<Territorio> territorios3 = null;
        List<Territorio> territorios4 = null;
        Territorio.distribuiTerritorio(t, territorios1, territorios2, territorios3, territorios4);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of escreveNomesTerritorios method, of class Territorio.
     */
    @Ignore
    @Test
    public void testEscreveNomesTerritorios() {
        System.out.println("escreveNomesTerritorios");
        List<Territorio> territorios = null;
        Territorio.escreveNomesTerritorios(territorios);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
