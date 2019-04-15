/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.ArrayList;
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
public class LlistaNotesIT {
    
    public LlistaNotesIT() {
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
    public void testConcatArray() {
        System.out.println("concatArray");
        ArrayList expResult = new ArrayList<>();
        expResult.add(1);
        expResult.add(2);
        expResult.add(2);
        expResult.add(3);
        expResult.add(6);
        expResult.add(10);
        ArrayList result = LlistaNotes.concatArray();
        assertEquals(expResult, result);
    }

    @Test
    public void testOrdenarArray() {
        System.out.println("ordenarArray");
        LlistaNotes.ordenarArray();
    }

    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        LlistaNotes.main(args);
    }
    
}
