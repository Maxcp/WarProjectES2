/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import java.util.Random;
import javax.swing.JButton;
import model.Ataque;
import model.Jogador;
import model.Territorio;
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
    private Gerenciador instance = null;
    
    public GerenciadorTest() {
        String[][] paramentros =
        {
            {"1", "Player", "0"},
            {"0", "Maquina 1", "1"},
            {"0", "Maquina 2", "2"},
            {"0", "Maquina 3", "3"}
        };
        instance = Gerenciador.getInstance(paramentros);
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
    @Test
    public void testGetInstance_StringArrArr() {
        System.out.println("Class Gerenciador: Method getInstance(String[][])");
        String[][] paramentros =
        {
            {"1", "Player", "0"},
            {"0", "Maquina 1", "1"},
            {"0", "Maquina 2", "2"},
            {"0", "Maquina 3", "3"}
        };
        Gerenciador expResult = Gerenciador.getInstance(paramentros);
        assertNotNull(expResult);
        
        paramentros = new String[][]
        {
            {"1", "Player", "0"},
            {"0", "Maquina 1", "1"},
            {"0", "Maquina 2", "2"},
            {"0", "Maquina 3", "3"}
        };
        Gerenciador result = Gerenciador.getInstance(paramentros);
        assertNotSame(expResult, result);
    }

    /**
     * Test of getInstance method, of class Gerenciador.
     */
    @Test
    public void testGetInstance_0args() {
        System.out.println("Class Gerenciador: Method getInstance()");
        String[][] paramentros =
        {
            {"1", "Player", "0"},
            {"0", "Maquina 1", "1"},
            {"0", "Maquina 2", "2"},
            {"0", "Maquina 3", "3"}
        };
        Gerenciador expResult = Gerenciador.getInstance(paramentros);
        assertNotNull(expResult);
        Gerenciador result = Gerenciador.getInstance();
        assertEquals(expResult, result);
    }

    /**
     * Test of getTerritorios method, of class Gerenciador.
     */
    @Test
    public void testGetTerritorios() {
        System.out.println("Class Gerenciador: Method getTerritorios()");
        Territorio[] territorios = instance.getTerritorios();
        assertTrue(territorios.length == DadosJogo.qtdTerritorios);
    }

    /**
     * Test of getFaseDaRodada method, of class Gerenciador.
     */
    @Test
    public void testGetFaseDaRodada() {
        System.out.println("Class Gerenciador: Method getFaseDaRodada()");
        int result = instance.getFaseDaRodada();
        assertTrue((0 <= result) && (result <= 2));
    }

    /**
     * Test of autalizaFaseDaRodada method, of class Gerenciador.
     */
    @Test
    public void testAutalizaFaseDaRodada() {
        System.out.println("Class Gerenciador: Method autalizaFaseDaRodada()");
        int result;
        
        do
        {
            instance.autalizaFaseDaRodada();
            result = instance.getFaseDaRodada();
            assertTrue((0 <= result) && (result <= 2));
        }
        while(result != 0);
        
        for(int i = 0; i < 3; i++)
        {
            result = instance.getFaseDaRodada();
            assertEquals(i, result);
            
            instance.autalizaFaseDaRodada();
        }
    }

    /**
     * Test of atualizaJogadorDaRodada method, of class Gerenciador.
     */
    @Test
    public void testAtualizaJogadorDaRodada() {
        System.out.println("Class Gerenciador: Method atualizaJogadorDaRodada()");
        Jogador[] result = new Jogador[4];
        
        for(int i = 0; i < 4; i++)
        {
            result[i] = instance.pegaJogadorDaRodada();
            instance.atualizaJogadorDaRodada();
        }
        
        for(int i = 0; i < 4; i++)
        {
            for(int k = i + 1; k < 4; k++)
            {
                if(i != k)
                    assertNotSame(result[i], result[k]);
            }
        }
    }

    /**
     * Test of pegaJogadorDaRodada method, of class Gerenciador.
     */
    @Test
    public void testPegaJogadorDaRodada() {
        System.out.println("Class Gerenciador: Method pegaJogadorDaRodada()");
        Jogador result = instance.pegaJogadorDaRodada();
        assertTrue(result != null);
    }

    /**
     * Test of setEditavelApenasTerritoriosDoJogadorAtual method, of class Gerenciador.
     */
    @Ignore
    @Test
    public void testSetEditavelApenasTerritoriosDoJogadorAtual() {
        System.out.println("Class Gerenciador: Method setEditavelApenasTerritoriosDoJogadorAtual(JButton[])");
        JButton[] btnterritorios = null;
        Gerenciador instance = null;
        instance.setEditavelApenasTerritoriosDoJogadorAtual(btnterritorios);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEditavelTodosOsTerritorios method, of class Gerenciador.
     */
    @Ignore
    @Test
    public void testSetEditavelTodosOsTerritorios() {
        System.out.println("Class Gerenciador: Method setEditavelTodosOsTerritorios(JButton[])");
        JButton[] btnterritorios = null;
        Gerenciador instance = null;
        instance.setEditavelTodosOsTerritorios(btnterritorios);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTerritoriosJogadores method, of class Gerenciador.
     */
    @Ignore
    @Test
    public void testSetTerritoriosJogadores() {
        System.out.println("Class Gerenciador: Method setTerritoriosJogadores(JButton[])");
        JButton[] btnterritorios = null;
        Gerenciador instance = null;
        instance.setTerritoriosJogadores(btnterritorios);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getQtdExercitosParaDistribuirJogadorAtual method, of class Gerenciador.
     */
    @Test
    public void testGetQtdExercitosParaDistribuirJogadorAtual() {
        System.out.println("Class Gerenciador: Method getQtdExercitosParaDistribuirJogadorAtual()");
        int result = instance.getQtdExercitosParaDistribuirJogadorAtual();
        assertTrue(result >= 0);
    }

    /**
     * Test of atualizaQtdExercitosParaDistribuirJogadorAtual method, of class Gerenciador.
     */
    @Test
    public void testAtualizaQtdExercitosParaDistribuirJogadorAtual() {
        System.out.println("Class Gerenciador: Method atualizaQtdExercitosParaDistribuirJogadorAtual()");
        instance.atualizaQtdExercitosParaDistribuirJogadorAtual();
        int result = instance.getQtdExercitosParaDistribuirJogadorAtual();
        assertEquals(result, instance.pegaJogadorDaRodada().qtdExercitosParaDistribuir());
    }

    /**
     * Test of reduzQtdExercitosParaDistribuirJogadorAtual method, of class Gerenciador.
     */
    @Test
    public void testReduzQtdExercitosParaDistribuirJogadorAtual() {
        System.out.println("Class Gerenciador: Method reduzQtdExercitosParaDistribuirJogadorAtual()");
        instance.atualizaQtdExercitosParaDistribuirJogadorAtual();
        int result = instance.getQtdExercitosParaDistribuirJogadorAtual();
        int expResult = result - 1;
        instance.reduzQtdExercitosParaDistribuirJogadorAtual();
        result = instance.getQtdExercitosParaDistribuirJogadorAtual();
        assertEquals(expResult, result);
    }

    /**
     * Test of aumentaQtdExercitosParaDistribuirJogadorAtual method, of class Gerenciador.
     */
    @Test
    public void testAumentaQtdExercitosParaDistribuirJogadorAtual() {
        System.out.println("Class Gerenciador: Method aumentaQtdExercitosParaDistribuirJogadorAtual()");
        instance.atualizaQtdExercitosParaDistribuirJogadorAtual();
        int result = instance.getQtdExercitosParaDistribuirJogadorAtual();
        int expResult = result + 1;
        instance.aumentaQtdExercitosParaDistribuirJogadorAtual();
        result = instance.getQtdExercitosParaDistribuirJogadorAtual();
        assertEquals(expResult, result);
    }

    /**
     * Test of geraDadosDadosOrdenados method, of class Gerenciador.
     */
    @Test
    public void testGeraDadosDadosOrdenados() {
        System.out.println("Class Gerenciador: Method geraDadosDadosOrdenados(int)");
        int[] dado;
        
        assertNull(instance.geraDadosDadosOrdenados(0));
        
        for(int i = 1; i < 4; i++)
        {
            dado = instance.geraDadosDadosOrdenados(i);
            for(int k = 0; k < i; k++)
                assertNotSame(0, dado[k]);
            for(int k = i; k < 3; k++)
                assertEquals(0, dado[k]);
        }
        
        for(int i = 4; i < 10; i++)
        {
            dado = instance.geraDadosDadosOrdenados(i);
            assertEquals(3, dado.length);
        }
    }

    /**
     * Test of ordena method, of class Gerenciador.
     */
    @Test
    public void testOrdena() {
        System.out.println("Class Gerenciador: Method ordena(int[])");
        int[] dado;
        
        for(int i = 1; i < 10; i++)
        {
            dado = new int[i];
            for(int k = 0; k < i; k++)
                dado[k] = new Random().nextInt();
            
            dado = instance.ordenaDecrescente(dado);
            
            for(int k = 1; k < dado.length; k++)
                assertTrue(dado[k - 1] >= dado[k]);
        }
        
    }

    /**
     * Test of comparaSeAtaqueGanhouNoDado method, of class Gerenciador.
     */
    @Ignore
    @Test
    public void testComparaSeAtaqueGanhouNoDado() {
        System.out.println("Class Gerenciador: Method comparaSeAtaqueGanhouNoDado(int[], int[])");
        int[] dadoAtaque, dadoDefesa;
        boolean[] result, expResult;
        
        for(int i = 1; i < 4; i++)
        {
            for(int k = 1; k < 4; k++)
            {
                dadoAtaque = instance.geraDadosDadosOrdenados(k);
                dadoDefesa = instance.geraDadosDadosOrdenados(i);
                
                result = Ataque.comparaSeAtaqueGanhouNoDado(dadoAtaque, dadoDefesa);
                
                int min;
                
                if((dadoAtaque[1] == 0) || (dadoDefesa[1] == 0))
                    min = 1;
                else if((dadoAtaque[2] == 0) || (dadoDefesa[2] == 0))
                    min = 2;
                else
                    min = 3;
                
                assertEquals(min, result.length);
                
                expResult = new boolean[min];
                
                for(int j = 0; j < min; j++)
                {
                    expResult[j] = dadoAtaque[j] > dadoDefesa[j];
                    assertTrue(expResult[j] == result[j]);
                }
            }
        }
    }
    
}
