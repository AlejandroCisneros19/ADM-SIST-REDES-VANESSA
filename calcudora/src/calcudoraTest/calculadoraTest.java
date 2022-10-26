package calcudoraTest;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import calculadoraa.calculadora;

public class calculadoraTest {

		   calculadora calculator = new calculadora();

		    @Test
		    public void sumaTest() {
		        assertEquals(calculator.sumar(1, 2), 3);
		    }

		    @Test
		    public void restarTest() {
		        assertEquals(calculator.restar(5, 2), 3);
		    }

		    @Test
		    public void multiplicarTest() {
		        assertEquals(calculator.multiplicar(5, 2), 10);
		    }

		    @Test
		    public void dividirTest() {
		        assertEquals(calculator.dividir(6, 2), 3);
		    }

		    @Test
		    public void raizCuadraticaTest(){
		        assertEquals(calculator.raizCuadratica(1,2,-8),-4,2);
		    }
		

	
}
