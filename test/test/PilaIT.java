/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author joanmi
 */
public class PilaIT {
    
    public PilaIT() {
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

    @Test
    public void testPush() {
        System.out.println("Push");
        int n = 2904285;
        Pila instance = new Pila();
        instance.Push(n);
        int valEsperat = instance.c.get(instance.c.size()-1);
        assertEquals("Error en la pujada", n, valEsperat);
    }

    @Test
    public void testPop() {
        System.out.println("Pop");
        int n = 6;
        Pila instance = new Pila();
        instance.Push(n);
        instance.Push(3);
        instance.Pop();
        int valorFinal = instance.c.get(instance.c.size()-1);
        assertEquals("Error en la pujada", n, valorFinal);
    }

    @Test
    public void testIsEmpty() {
        System.out.println("IsEmpty");
        Pila instance = new Pila();
        boolean expResult = true;
        boolean result = instance.IsEmpty();
        assertEquals(expResult, result);
    }

    @Test
    public void testTOP() {
        System.out.println("TOP");
        Pila instance = new Pila();
        instance.Push(1);
        instance.Push(2);
        instance.Push(3);
        int expResult = 3;
        int result = instance.TOP();
        assertEquals(expResult, result);
    }

    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Pila.main(args);
    }
    
}
