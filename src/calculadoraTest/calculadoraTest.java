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

    @Test
    public void raizCuadraticaTest(){
        assertNotEquals(calculator.raizCuadratica(2,4,6),-4,2);
    }
}
