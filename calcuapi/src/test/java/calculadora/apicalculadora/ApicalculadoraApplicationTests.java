package calculadora.apicalculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApiCalculadoraApplicationTests {

	CalculadoraApi calculadora = new CalculadoraApi();

	//Test suma
	@Test
	public void suma() {
		assertEquals(7, calculadora.suma(5, 2));
	}
	@Test
	public void sumaFail() {
		assertNotEquals(5,calculadora.suma(5,2));
	}



	//Test resta
	@Test
	public void resta() {
		assertEquals(3, calculadora.resta(5, 2));
	}
	@Test
	public void restaFail() {
		assertNotEquals(4,calculadora.resta(5,2));
	}



	//Test multiplicar
	@Test
	public void multiplicar() {
		assertEquals(10, calculadora.multiplicar(5, 2));
	}
	@Test
	public void multiplicarFail() {
		assertNotEquals(8,calculadora.multiplicar(5,2));
	}


	//Test dividir
	@Test
	public void dividir() {
		assertEquals(5, calculadora.dividir(10, 2));
	}
	@Test
	public void dividirFail() {
		assertNotEquals(3, calculadora.dividir(10, 2));
	}
	@Test
	public void dividirExceptionTest(){
		Assertions.assertThrows(ArithmeticException.class, ()->{
			calculadora.dividir(10, 0);
		});
	}

	//Test cuadratica
	@Test
	public void raizCuadraticaTest(){
		assertArrayEquals(calculadora.cuadratica(1, -1, -2), new double[] {2, -1},0);
	}
/*
	@Test( expected = ArithmeticException.class)
	public void raizCuadrarticaExceptionTest(){
		calculadora.cuadratica(1, 0, -2); //si el valor de B vale 0
		calculadora.cuadratica(0, -1, -2); // si el valor de A vale 0
	}	*/
}