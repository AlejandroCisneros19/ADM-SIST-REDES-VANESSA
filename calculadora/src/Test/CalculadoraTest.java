package Test;

import calculadora.Calculadora;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;


public class CalculadoraTest {

    Calculadora calculator = new Calculadora();

    public void evento(){
        calculator = new Calculadora();}


    // 2 TEST SUMA
    @org.junit.Test
    public void testsuma(){
        evento();
        Assert.assertEquals(7, calculator.suma(5, 2));
    }
    @Test
    public void testsumaFail(){
        evento();
        Assert.assertEquals(4, calculator.suma(5, 2));
    }



    // 2 TEST RESTA
    @org.junit.Test
    public void testresta(){
        evento();
        Assert.assertEquals(3, calculator.resta(5, 2));
    }
    @Test
    public void testrestaFail(){
        evento();
        Assert.assertEquals(4, calculator.resta(5, 2));
    }



    // 2 TEST MULTIPLICACION
    @org.junit.Test
    public void testmultiplicar(){
        evento();
        Assert.assertEquals(10, calculator.multiplicar(5, 2));
    }
    @Test
    public void testmultiplicarFail(){
        evento();
        Assert.assertEquals(8,calculator.multiplicar(5, 2));
        }



    // 3 TEST DIVISION
    @org.junit.Test
    public void testdividir(){
        evento();
        Assert.assertEquals(5, calculator.dividir(10, 2));
    }
    @Test
    public void testdividirFail(){
        evento();
        Assert.assertEquals(3, calculator.dividir(10, 2));
    }
    //division por 0
    @org.junit.Test(expected = ArithmeticException.class)
    public void dividirExceptionTest(){
        evento();
        calculator.dividir(1,0);
    }



    // 3 TEST RAIZ CUADRADA
    @Test
    public void raizCuadraticaTest(){
        assertArrayEquals(calculator.raizCuadratica(1, -1 ,-2 ), new double[] {2, -1},0);
    }
    @Test
    public void raizCuadraticaTestFail(){
        assertArrayEquals(calculator.raizCuadratica(1, -1, -4), new double[] {2, -1}, 0);
    }
    @Test(expected = ArithmeticException.class)
    public void raizCuadrarticaExceptionTest(){
        calculator.raizCuadratica(1, 0, -2); //si el valor de B vale 0
        calculator.raizCuadratica(0, -1, -2); // si el valor de A vale 0
    }
}