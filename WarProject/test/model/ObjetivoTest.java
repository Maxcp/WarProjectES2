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
        System.out.println("Class Objetivo: Method getDescricao()");
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
    @Test
    public void testGetID() {
        System.out.println("Class Objetivo: Method getID()");
        
        for(int i = 0; i < 20; i++)
        {
            Objetivo instance = new Objetivo(null);
            int result = instance.getID();
            assertTrue((0 <= result) && (result <= 13));
        }
    }

    /**
     * Test of getTerritoriosNecessarios method, of class Objetivo.
     */
    @Ignore
    @Test
    public void testGetTerritoriosNecessarios() {
        System.out.println("Class Objetivo: Method getTerritoriosNecessarios()");
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
        System.out.println("Class Objetivo: Method setTerritoriosNecessarios(List<Territorio>)");
        List<Territorio> territoriosNecessarios = null;
        Objetivo instance = null;
        instance.setTerritoriosNecessarios(territoriosNecessarios);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verificaTipoDoObjetivo method, of class Objetivo.
     */
    @Test
    public void testVerificaTipoDoObjetivo() {
        System.out.println("Class Objetivo: Method verificaTipoDoObjetivo(int)");
        
        for(int i = 0; i < 14; i++)
        {
            if(i>=0 && i <=3)
                assertEquals(1, Objetivo.verificaTipoDoObjetivo(i));
            if(i>=4 && i <=6)
                assertEquals(2, Objetivo.verificaTipoDoObjetivo(i));
            if(i>=7 && i <=10)
                assertEquals(3, Objetivo.verificaTipoDoObjetivo(i));
            if(i==11)
                assertEquals(4, Objetivo.verificaTipoDoObjetivo(i));
            if(i>=12 && i <=13)
                assertEquals(1, Objetivo.verificaTipoDoObjetivo(i));
        }
    }

    /**
     * Test of geraObjetivoAleatorio method, of class Objetivo.
     */
    @Test
    public void testGeraObjetivoAleatorio() {
        System.out.println("Class Objetivo: Method geraObjetivoAleatorio(int[])");
        int[] check = new int[14];
        int[] result = new int[14];
        boolean status = false;
        int objID;
        
        for(int i = 0; i < 14; i++)
        {
            check[i] = 0;
            result[i] = 1;
        }
        
        for(int i = 0; i < 200 && (!status); i++)
        {
            status = true;
            objID = Objetivo.geraObjetivoAleatorio(null);
            assertTrue((0 <= objID) && (objID <= 14));
            check[i] = 1;
            
            for(int k = 0; k < 14; k++)
                if(check[k] == 0)   status = false;
        }
        
        assertArrayEquals(result, check);
    }

    /**
     * Test of verificaSeObjetivoFoiAtingido method, of class Objetivo.
     */
    @Ignore
    @Test
    public void testVerificaSeObjetivoFoiAtingido() {
        System.out.println("Class Objetivo: Method verificaSeObjetivoFoiAtingido()");
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
        System.out.println("Class Objetivo: Method geraQuatroObjetivos(Objetivo, Objetivo, Objetivo, Objetivo)");
        Objetivo objetivo1 = null;
        Objetivo objetivo2 = null;
        Objetivo objetivo3 = null;
        Objetivo objetivo4 = null;
        Objetivo.geraQuatroObjetivos(objetivo1, objetivo2, objetivo3, objetivo4);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
