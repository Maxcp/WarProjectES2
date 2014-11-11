/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.junit.AfterClass;
import org.junit.Assert;
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
    @Test
    public void testGetId() {
        System.out.println("Class Territorio: Method getId()");
        Territorio instance = null;
        int expResult = 0;
        
        for(int i = 0; i < 20; i++)
        {
            expResult = new Random().nextInt();
            instance = new Territorio(expResult, "", null, null, 1);
            assertEquals(expResult, instance.getId());
        }
    }

    /**
     * Test of setId method, of class Territorio.
     */
    @Test
    public void testSetId() {
        System.out.println("Class Territorio: Method setId(int)");
        int id = 0;
        Territorio instance = new Territorio(0, "", null, null, 1);
        int expResult = 0;
        
        for(int i = 0; i < 20; i++)
        {
            expResult = new Random().nextInt();
            instance.setId(expResult);
            assertEquals(expResult, instance.getId());
        }
    }

    /**
     * Test of getNome method, of class Territorio.
     */
    @Test
    public void testGetNome() {
        System.out.println("Class Territorio: Method getNome()");
        Territorio instance = new Territorio(1, "Teste", null, null, 1);
        assertEquals("Teste", instance.getNome());
    }

    /**
     * Test of setNome method, of class Territorio.
     */
    @Test
    public void testSetNome() {
        System.out.println("Class Territorio: Method setNome(String)");
        String nome = "Teste";
        Territorio instance = new Territorio(1, "Empty", null, null, 1);
        instance.setNome(nome);
        assertEquals("Teste", instance.getNome());
    }

    /**
     * Test of getVizinhos method, of class Territorio.
     */
    @Test
    public void testGetVizinhos() {
        System.out.println("Class Territorio: Method getVizinhos()");
        Territorio[] expResult = new Territorio[10];
        Territorio instance = new Territorio(1, "", expResult, null, 1);
        Territorio[] result = instance.getVizinhos();
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of isVizinho method, of class Territorio.
     */
    @Test
    public void testIsVizinho() {
        System.out.println("Class Territorio: Method isVizinho(Territorio)");
        Territorio t = null;
        Territorio[] vizinhos = new Territorio[10];
        Territorio[] distantes = new Territorio[10];
        Territorio instance = null;
        boolean expResult = false;
        boolean result = false;
        assertEquals(expResult, result);
        
        for(int i = 0; i < vizinhos.length; i++)
        {
            vizinhos[i] = new Territorio(i, "", null, null, 1);
            distantes[i] = new Territorio(i, "", null, null, 1);
        }
        
        instance = new Territorio(vizinhos.length, "", vizinhos, null, 1);
        for(int i = 0;i < vizinhos.length; i++)
        {
            expResult = true;
            result = instance.isVizinho(vizinhos[i]);
            assertEquals(expResult, result);
        }
        
        for(int i = 0;i < distantes.length; i++)
        {
            expResult = false;
            result = instance.isVizinho(distantes[i]);
            assertEquals(expResult, result);
        }
    }

    /**
     * Test of setVizinhos method, of class Territorio.
     */
    @Test
    public void testSetVizinhos() {
        System.out.println("Class Territorio: Method setVizinhos(Territorio[])");
        Territorio[] vizinhos1 = new Territorio[10];
        Territorio[] vizinhos2 = new Territorio[10];
        Territorio instance = new Territorio(1, "", vizinhos1, null, 1);
        instance.setVizinhos(vizinhos2);
        Assert.assertArrayEquals(vizinhos2, instance.getVizinhos());
    }

    /**
     * Test of getConquistador method, of class Territorio.
     */
    @Test
    public void testGetConquistador() {
        System.out.println("Class Territorio: Method getConquistador()");
        Jogador expResult = new Jogador("", 0, null, null);
        Territorio instance = new Territorio(1, "", null, expResult, 1);
        Jogador result = instance.getConquistador();
        assertEquals(expResult, result);
    }

    /**
     * Test of setConquistador method, of class Territorio.
     */
    @Test
    public void testSetConquistador() {
        System.out.println("Class Territorio: Method setConquistador(Jogador)");
        Jogador conquistador = new Jogador("C", 1, null, null);
        Jogador derrotado = new Jogador("D", 0, null, null);
        Territorio instance = new Territorio(1, "T", null, derrotado, 1);
        instance.setConquistador(conquistador);
        assertEquals(conquistador, instance.getConquistador());
    }

    /**
     * Test of getExercitosPosicionados method, of class Territorio.
     */
    @Test
    public void testGetExercitosPosicionados() {
        System.out.println("Class Territorio: Method getExercitosPosicionados()");
        Territorio instance = null;
        int expResult = 0;
        int result = 0;
        
        for(int i = 0; i < 20; i++)
        {
            expResult = new Random().nextInt();
            instance = new Territorio(1, "E", null, null, expResult);
            result = instance.getExercitosPosicionados();
            if(expResult < 0)
                assertTrue((result >= 0));
            else
                assertEquals(expResult, result);
        }
    }

    /**
     * Test of setExercitosPosicionados method, of class Territorio.
     */
    @Test
    public void testSetExercitosPosicionados() {
        System.out.println("Class Territorio: Method setExercitosPosicionados(int)");
        Territorio instance = new Territorio(1, "E", null, null, 1);
        int expResult = 0;
        int result = 0;
        
        for(int i = 0; i < 20; i++)
        {
            expResult = new Random().nextInt();
            instance.setExercitosPosicionados(expResult);
            result = instance.getExercitosPosicionados();
            if(expResult < 0)
                assertTrue((result >= 0));
            else
                assertEquals(expResult, result);
        }
    }

    /**
     * Test of retiraUltimoTerritorioDaLista method, of class Territorio.
     */
    @Test
    public void testRetiraUltimoTerritorioDaLista() {
        System.out.println("Class Territorio: Method retiraUltimoTerritorioDaLista(List<Territorio>)");
        List<Territorio> list = new ArrayList<>();
        Territorio expResult = null;
        Territorio result = null;
        int l;
        
        for(int i = 0; i < 10; i++)
        {
            expResult = new Territorio(i, "L", null, null, 1);
            list.add(expResult);
        }
        l = list.size() - 1;
        result = Territorio.retiraUltimoTerritorioDaLista(list);
        assertEquals(expResult, result);
        assertEquals(l, list.size());
    }

    /**
     * Test of embaralhaTerritorio method, of class Territorio.
     */
    @Ignore
    @Test
    public void testEmbaralhaTerritorio() {
        System.out.println("Class Territorio: Method embaralhaTerritorio(List<Territorio>)");
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
        System.out.println("Class Territorio: Method distribuiTerritorio(Territorio[], List<Territorio>, List<Territorio>, List<Territorio>, List<Territorio>)");
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
        System.out.println("Class Territorio: Method escreveNomesTerritorios(List<Territorio>)");
        List<Territorio> territorios = null;
        Territorio.escreveNomesTerritorios(territorios);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of reduzExercitos method, of class Territorio.
     */
    @Ignore
    @Test
    public void testReduzExercitos() {
        System.out.println("Class Territorio: Method reduzExercitos(int)");
        int i = 0;
        Territorio instance = null;
        instance.reduzExercitos(i);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of aumentaExercitos method, of class Territorio.
     */
    @Ignore
    @Test
    public void testAumentaExercitos() {
        System.out.println("Class Territorio: Method aumentaExercitos(int)");
        int i = 0;
        Territorio instance = null;
        instance.aumentaExercitos(i);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of possuiExercitosPraPassar method, of class Territorio.
     */
    @Ignore
    @Test
    public void testPossuiExercitosPraPassar() {
        System.out.println("Class Territorio: Method possuiExercitosPraPassar(int)");
        int qtdExercitosApassar = 0;
        Territorio instance = null;
        boolean expResult = false;
        boolean result = instance.possuiExercitosPraPassar(qtdExercitosApassar);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
