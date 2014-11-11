/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import controller.DadosJogo;
import java.awt.Color;
import java.util.LinkedList;
import java.util.List;
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
public class JogadorTest {
    
    public JogadorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getNome method, of class Jogador.
     */
    @Test
    public void testGetNome() {
        System.out.println("Class Jogador: Method getNome()");
        Jogador instance = new Jogador("Teste", 0, null, null);
        String expResult = "Teste";
        String result = instance.getNome();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCor method, of class Jogador.
     */
    @Test
    public void testGetCor() {
        System.out.println("Class Jogador: Method getCor()");
        Jogador instance = new Jogador(null, 1, null, null);
        int expResult = 1;
        int result = instance.getCor();
        assertEquals(expResult, result);
    }

    /**
     * Test of getNomeCor method, of class Jogador.
     */
    @Test
    public void testGetNomeCor() {
        System.out.println("Class Jogador: Method getNomeCor()");
        Jogador instance = null;
        
        instance = new Jogador("", DadosJogo.legiaoAzul, null, null);
        assertEquals("Azul", instance.getNomeCor());
        instance = new Jogador("", DadosJogo.legiaoPreta, null, null);
        assertEquals("Preto", instance.getNomeCor());
        instance = new Jogador("", DadosJogo.legiaoVerde, null, null);
        assertEquals("Verde", instance.getNomeCor());
        instance = new Jogador("", DadosJogo.legiaoVermelha, null, null);
        assertEquals("Vermelho", instance.getNomeCor());
        instance = new Jogador("", -1, null, null);
        assertEquals("Vermelho", instance.getNomeCor());
    }

    /**
     * Test of getColor method, of class Jogador.
     */
    @Ignore
    @Test
    public void testGetColor() {
        System.out.println("Class Jogador: Method getColor()");
        Jogador instance = null;
        Color expResult = null;
        Color result = instance.getColor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTerritorios method, of class Jogador.
     */
    @Test
    public void testGetTerritorios() {
        System.out.println("Class Jogador: Method getTerritorios()");
        List<Territorio> expResult = new LinkedList<>();
        Jogador instance = new Jogador("", 1, null, expResult);
        List<Territorio> result = instance.getTerritorios();
        assertEquals(expResult, result);
    }

    /**
     * Test of addTerritorios method, of class Jogador.
     */
    @Test
    public void testAddTerritorios() {
        System.out.println("Class Jogador: Method addTerritorios(List<Territorio>)");
        List<Territorio> territorios = new LinkedList<>();
        Jogador instance = new Jogador("", 1, null, territorios);
        
        territorios = new LinkedList<>();
        for(int i = 0; i < 20; i++)
            territorios.add(new Territorio(i, "T", null, instance, i));
        
        instance.addTerritorios(territorios);
        List<Territorio> result = instance.getTerritorios();
        for(int i = 0; i < result.size(); i++)
            assertEquals(territorios.get(i), result.get(i));
    }

    /**
     * Test of addTerritorio method, of class Jogador.
     */
    @Test
    public void testAddTerritorio() {
        System.out.println("Class Jogador: Method addTerritorio(Territorio)");
        List<Territorio> territorios = new LinkedList<>();
        Jogador instance = new Jogador("", 1, null, territorios);
        
        territorios = new LinkedList<>();
        for(int i = 0; i < 20; i++)
        {
            Territorio tmp = new Territorio(i, "T", null, instance, i);
            territorios.add(tmp);
            instance.addTerritorio(tmp);
        }
        
        List<Territorio> result = instance.getTerritorios();
        for(int i = 0; i < result.size(); i++)
            assertEquals(territorios.get(i), result.get(i));
    }

    /**
     * Test of removeTerritorio method, of class Jogador.
     */
    @Ignore
    @Test
    public void testRemoveTerritorio() {
        System.out.println("Class Jogador: Method removeTerritorio(Territorio)");
        Territorio territorio = null;
        Jogador instance = null;
        instance.removeTerritorio(territorio);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addCartas method, of class Jogador.
     */
    @Ignore
    @Test
    public void testAddCartas() {
        System.out.println("Class Jogador: Method addCartas(List<CartasTerritorio>)");
        List<CartasTerritorio> cartas = null;
        Jogador instance = null;
        instance.addCartas(cartas);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addCarta method, of class Jogador.
     */
    @Ignore
    @Test
    public void testAddCarta() {
        System.out.println("Class Jogador: Method addCarta(CartasTerritorio)");
        CartasTerritorio carta = null;
        Jogador instance = null;
        instance.addCarta(carta);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeCarta method, of class Jogador.
     */
    @Ignore
    @Test
    public void testRemoveCarta() {
        System.out.println("Class Jogador: Method removeCarta(CartasTerritorio)");
        CartasTerritorio carta = null;
        Jogador instance = null;
        instance.removeCarta(carta);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPontuacao method, of class Jogador.
     */
    @Test
    public void testGetPontuacao() {
        System.out.println("Class Jogador: Method getPontuacao()");
        Jogador instance = new Jogador("", 0, null, null);
        int expResult = 0;
        int result = instance.getPontuacao();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPontuacao method, of class Jogador.
     */
    @Test
    public void testSetPontuacao() {
        System.out.println("Class Jogador: Method setPontuacao(int)");
        int pontuacao = 0;
        Jogador instance = new Jogador("", 0, null, null);
        int result;
        
        for(int i = 0; i < 20; i++)
        {
            pontuacao = new Random().nextInt();
            instance.setPontuacao(pontuacao);
            result = instance.getPontuacao();
            if(pontuacao < 0)
                assertTrue(result >= 0);
            else
                assertEquals(pontuacao, result);
        }
    }

    /**
     * Test of getObjetivo method, of class Jogador.
     */
    @Ignore
    @Test
    public void testGetObjetivo() {
        System.out.println("Class Jogador: Method getObjetivo()");
        Jogador instance = null;
        Objetivo expResult = null;
        Objetivo result = instance.getObjetivo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of qtdExercitosParaDistribuir method, of class Jogador.
     */
    @Ignore
    @Test
    public void testQtdExercitosParaDistribuir() {
        System.out.println("Class Jogador: Method qtdExercitosParaDistribuir()");
        Jogador instance = null;
        int expResult = 0;
        int result = instance.qtdExercitosParaDistribuir();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of territorioPertence method, of class Jogador.
     */
    @Ignore
    @Test
    public void testTerritorioPertence() {
        System.out.println("Class Jogador: Method territorioPertence(int)");
        int indice = 0;
        Jogador instance = null;
        boolean expResult = false;
        boolean result = instance.territorioPertence(indice);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStringDescricaoCartaTerritorio method, of class Jogador.
     */
    @Ignore
    @Test
    public void testGetStringDescricaoCartaTerritorio() {
        System.out.println("Class Jogador: Method getStringDescricaoCartaTerritorio(int)");
        int indexCarta = 0;
        Jogador instance = null;
        String expResult = "";
        String result = instance.getStringDescricaoCartaTerritorio(indexCarta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStringTipoCartaTerritorio method, of class Jogador.
     */
    @Ignore
    @Test
    public void testGetStringTipoCartaTerritorio() {
        System.out.println("Class Jogador: Method getStringTipoCartaTerritorio(int)");
        int indexCarta = 0;
        Jogador instance = null;
        String expResult = "";
        String result = instance.getStringTipoCartaTerritorio(indexCarta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
