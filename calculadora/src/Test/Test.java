package Test;

import calculadora.Calculadora;
import junit.framework.TestCase;


public class Test extends TestCase{

    Calculadora calculator = new Calculadora();

    public void evento(){
        calculator = new Calculadora();
    }

    public void testsuma(){
        evento();
        assertEquals(7,calculator.suma(5,2));
    }
    public void testresta(){
        evento();
        assertEquals(3, calculator.resta(5, 2 ));
    }
    public void testmultiplicar(){
        evento();
        assertEquals(10, calculator.multiplicar(5, 2));
    }
    public void testdividir(){
        evento();
        assertEquals(5, calculator.dividir(10, 2));
    }


}