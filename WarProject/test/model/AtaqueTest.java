/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author Igor
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

    /**
     * Test of comparaSeAtaqueGanhouNoDado method, of class Ataque.
     */
    @Ignore
    @Test
    public void testComparaSeAtaqueGanhouNoDado() {
        System.out.println("Class Ataque: Method comparaSeAtaqueGanhouNoDado(int[], int[])");
        int[] dados_ataque = null;
        int[] dados_defesa = null;
        boolean[] expResult = null;
        boolean[] result = Ataque.comparaSeAtaqueGanhouNoDado(dados_ataque, dados_defesa);
        //assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of realizaAtque method, of class Ataque.
     */
    @Ignore
    @Test
    public void testRealizaAtque() {
        System.out.println("Class Gerenciador: Method realizaAtque(int[], int[], Territorio, Territorio)");
        int[] dados_ataque = null;
        int[] dados_defesa = null;
        Territorio territorio_ataque = null;
        Territorio territorio_defesa = null;
        Ataque.realizaAtque(dados_ataque, dados_defesa, territorio_ataque, territorio_defesa);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
