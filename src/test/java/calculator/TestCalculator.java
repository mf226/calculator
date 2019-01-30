package calculator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestCalculator {

    @Test
    public void testAddFunction1() {
        Calculator calc = new Calculator();
        int n1 = 4;
        int n2 = 7;

        int result = calc.add(n1, n2);
        int expected = 11;

        assertEquals(expected, result);
    }

    @Test
    public void testAddFunction2() {
        Calculator calc = new Calculator();
        int n1 = 4;
        int n2 = -7;

        int result = calc.add(n1, n2);
        int expected = -3;

        assertEquals(expected, result);
    }

    @Test
    public void testAddFunction3() {
        Calculator calc = new Calculator();
        int n1 = -4;
        int n2 = -7;

        int result = calc.add(n1, n2);
        int expected = -11;

        assertEquals(expected, result);
    }

    @Test
    public void testSubFunction1() {
        Calculator calc = new Calculator();
        int n1 = 14;
        int n2 = 3;

        int result = calc.sub(n1, n2);
        int expected = 11;

        assertEquals(expected, result);
    }

    @Test
    public void testSubFunction2() {
        Calculator calc = new Calculator();
        int n1 = 14;
        int n2 = -3;

        int result = calc.sub(n1, n2);
        int expected = 17;

        assertEquals(expected, result);
    }

    @Test
    public void testSubFunction3() {
        Calculator calc = new Calculator();
        int n1 = -14;
        int n2 = -3;

        int result = calc.sub(n1, n2);
        int expected = -11;

        assertEquals(expected, result);
    }

    @Test
    public void testMulFunction1() {
        Calculator calc = new Calculator();
        int n1 = 5;
        int n2 = 11;

        int result = calc.mul(n1, n2);
        int expected = 55;

        assertEquals(expected, result);
    }

    @Test
    public void testMulFunction2() {
        Calculator calc = new Calculator();
        int n1 = 5;
        int n2 = -11;

        int result = calc.mul(n1, n2);
        int expected = -55;

        assertEquals(expected, result);
    }

    @Test
    public void testMulFunction3() {
        Calculator calc = new Calculator();
        int n1 = -5;
        int n2 = -11;

        int result = calc.mul(n1, n2);
        int expected = 55;

        assertEquals(expected, result);
    }

    @Test
    public void testDivFunction1() {
        Calculator calc = new Calculator();
        int n1 = 40;
        int n2 = 11;

        int result = calc.div(n1, n2);
        int expected = 3;

        assertEquals(expected, result);
    }

    @Test
    public void testDivFunction2() {
        Calculator calc = new Calculator();
        int n1 = -40;
        int n2 = 11;

        int result = calc.div(n1, n2);
        int expected = -3;

        assertEquals(expected, result);
    }

    @Test
    public void testDivFunction3() {
        Calculator calc = new Calculator();
        int n1 = 11;
        int n2 = -40;

        int result = calc.div(n1, n2);
        int expected = 0;

        assertEquals(expected, result);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivFunction4() {
        Calculator calc = new Calculator();
        int n1 = 40;
        int n2 = 0;

        int result = calc.div(n1, n2);
    }
}
