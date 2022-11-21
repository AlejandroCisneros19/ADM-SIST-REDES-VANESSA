package calculadoraTest;
import static org.junit.Assert.*;

import org.junit.Test;

import calculadora.calculadora;

public class calculadoraTest {

    calculadora calculator = new calculadora();

    @Test
    public void sumaTest() {
        assertEquals(calculator.sumar(1, 2), 3);
    }
    @Test
    public void sumaTest2(){
        assertNotEquals(calculator.sumar(1,2), 5 );
    }




    @Test
    public void restarTest() {
        assertEquals(calculator.restar(2, 2), 0);
    }
    @Test
    public void restarTest2(){
        assertNotEquals(calculator.restar(2,2), 3 );
    }



    @Test
    public void multiplicarTest(){
        assertEquals(calculator.multiplicar(3,2), 6);
    }
    @Test
    public void multiplicarTest2(){
        assertNotEquals(calculator.multiplicar(3,2), 9);
    }




    @Test
    public void dividirTest(){
        assertEquals(calculator.dividir(4,1), 4);
    }
    @Test
    public void dividirTest2(){
        assertNotEquals(calculator.dividir(4,1), 5);
    }
    /*division por 0*/
    @Test
   public void dividirTest3() { assertNotEquals(calculator.dividir(5,0); }

    /*correcion de division por 0*/
    @Test (expected = ArithmeticException.class)
    public void dividirExceptionTest(){
        calculator.dividir(1,0);
    }





    /*raiz negativa*/
    @Test
    public void raizCuadraticaTest() { assertEquals(calculadora.cuadratica(1, -1, -2), 2, -1) }
    @Test
    public void raizCuadraticaTest() { assertEquals(calculadora.cuadratica( 2, 3, -2), 0.5, -2) }

/*correcion de raiz negativa + cuadratica*/
    @Test
    public void raizCuadraticaTest(){
        double[] result = calculadora.Cuadratica(1, -1, -2);
        double[] expectedResults = {2, -1};
        assertTrue(Arrays.equals(expectedResults, result));
    }
    @Test
    public void raizCuadraticaFailTest(){
        double[] result = calculadora.Cuadratica(1, -1, -2);
        double[] expectedResults = {0.5, -1};
        assertFalse(Arrays.equals(expectedResults, result));
    }
    @Test
    public void raizCuadraticaFailExceptions(){
        assertThrows(
                ArithmeticException.class,
                () -> calculadora.Cuadratica(2, 4,  20)
        );
    }

}