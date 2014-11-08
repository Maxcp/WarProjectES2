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
public class ObjetivoTest {
    
    public ObjetivoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getDescricao method, of class Objetivo.
     */
    @Ignore
    @Test
    public void testGetDescricao() {
        System.out.println("getDescricao");
        Objetivo instance = null;
        String expResult = "";
        String result = instance.getDescricao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getID method, of class Objetivo.
     */
    @Ignore
    @Test
    public void testGetID() {
        System.out.println("getID");
        Objetivo instance = null;
        int expResult = 0;
        int result = instance.getID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTerritoriosNecessarios method, of class Objetivo.
     */
    @Ignore
    @Test
    public void testGetTerritoriosNecessarios() {
        System.out.println("getTerritoriosNecessarios");
        Objetivo instance = null;
        List<Territorio> expResult = null;
        List<Territorio> result = instance.getTerritoriosNecessarios();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTerritoriosNecessarios method, of class Objetivo.
     */
    @Ignore
    @Test
    public void testSetTerritoriosNecessarios() {
        System.out.println("setTerritoriosNecessarios");
        List<Territorio> territoriosNecessarios = null;
        Objetivo instance = null;
        instance.setTerritoriosNecessarios(territoriosNecessarios);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verificaTipoDoObjetivo method, of class Objetivo.
     */
    @Ignore
    @Test
    public void testVerificaTipoDoObjetivo() {
        System.out.println("verificaTipoDoObjetivo");
        int num = 0;
        int expResult = 0;
        int result = Objetivo.verificaTipoDoObjetivo(num);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of geraObjetivoAleatorio method, of class Objetivo.
     */
    @Ignore
    @Test
    public void testGeraObjetivoAleatorio() {
        System.out.println("geraObjetivoAleatorio");
        int[] restricoes = null;
        int expResult = 0;
        int result = Objetivo.geraObjetivoAleatorio(restricoes);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verificaSeObjetivoFoiAtingido method, of class Objetivo.
     */
    @Ignore
    @Test
    public void testVerificaSeObjetivoFoiAtingido() {
        System.out.println("verificaSeObjetivoFoiAtingido");
        Objetivo instance = null;
        boolean expResult = false;
        boolean result = instance.verificaSeObjetivoFoiAtingido();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of geraQuatroObjetivos method, of class Objetivo.
     */
    @Ignore
    @Test
    public void testGeraQuatroObjetivos() {
        System.out.println("geraQuatroObjetivos");
        Objetivo objetivo1 = null;
        Objetivo objetivo2 = null;
        Objetivo objetivo3 = null;
        Objetivo objetivo4 = null;
        Objetivo.geraQuatroObjetivos(objetivo1, objetivo2, objetivo3, objetivo4);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
