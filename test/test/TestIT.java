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
public class TestIT {
    
    public TestIT() {
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
        int n = 0;
        test.Pila instance = new test.Pila();
        instance.Push(n);
    }

    @Test
    public void testPop() {
        System.out.println("Pop");
        test.Pila instance = new test.Pila();
        instance.Pop();
    }

    @Test
    public void testIsEmpty() {
        System.out.println("IsEmpty");
        test.Pila instance = new test.Pila();
        boolean expResult = false;
        boolean result = instance.IsEmpty();
        assertEquals(expResult, result);
    }

    @Test
    public void testTOP() {
        System.out.println("TOP");
        test.Pila instance = new test.Pila();
        int expResult = 0;
        int result = instance.TOP();
        assertEquals(expResult, result);
    }

    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        test.Pila.main(args);
    }
    
}
