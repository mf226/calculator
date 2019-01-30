/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integrationtests;

import java.io.IOException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import utils.HttpClient;

/**
 *
 * @author Fen
 */
public class WebCalculatorTest {

    public WebCalculatorTest() {
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
    public void test() {
        assertTrue(true);
    }

    @Test
    public void testAdd() throws IOException {
        HttpClient client = new HttpClient("http://localhost:7777/Calculator/calculator");
        String res = client.makeHttpRequest("?operation=add&n1=2&n2=3");
        String expected = "Result of: 2+3= 5";
        assertEquals(expected, res);
    }

    @Test
    public void testSub() throws IOException {
        HttpClient client = new HttpClient("http://localhost:7777/Calculator/calculator");
        String res = client.makeHttpRequest("?operation=sub&n1=2&n2=3");
        String expected = "Result of: 2-3= -1";
        assertEquals(expected, res);
    }

    @Test
    public void testMul() throws IOException {
        HttpClient client = new HttpClient("http://localhost:7777/Calculator/calculator");
        String res = client.makeHttpRequest("?operation=mul&n1=2&n2=3");
        String expected = "Result of: 2*3= 6";
        assertEquals(expected, res);
    }
    
    @Test
    public void testDiv() throws IOException {
        HttpClient client = new HttpClient("http://localhost:7777/Calculator/calculator");
        String res = client.makeHttpRequest("?operation=div&n1=2&n2=3");
        String expected = "Result of: 2/3= 0";
        assertEquals(expected, res);
    }
    
    @Test(expected = IOException.class)
    public void testDivBy0() throws IOException {
        HttpClient client = new HttpClient("http://localhost:7777/Calculator/calculator");
        String res = client.makeHttpRequest("?operation=div&n1=2&n2=0");
        
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
