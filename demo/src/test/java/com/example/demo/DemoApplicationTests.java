package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import org.springframework.boot.test.context.SpringBootTest;


import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DemoApplicationTests {

	DemoApplication calculadora = new DemoApplication();

	@Test
	public void SUMA() { assertEquals(calculadora.SUMA(1, 2), 3);}

	@Test
	public void SUMA2() {
		assertNotEquals(calculadora.SUMA(4, 1), 3);
	}

	@Test
	public void RESTA() {
		assertNotEquals(calculadora.RESTA(3, 1), 3);
	}
	@Test
	public void RESTA2() {
		assertNotEquals(calculadora.RESTA(3, 1), 2);
	}

	@Test
	public void MULTIPLICACION() {
		assertEquals(calculadora.MULTIPLICACION(5, 2), 10);
	}
	@Test
	public void MULTIPLICACION2() {
		assertNotEquals(calculadora.MULTIPLICACION(4, 1), 3);
	}

	@Test
	public void DIVISON() {
		assertEquals(calculadora.DIVISION(6, 2), 3);
	}
	@Test
	public void DIVISION() {
		assertNotEquals(calculadora.DIVISION(6, 2), 4);
	}
	@Test
	public void divisionException() {
		Assertions.assertThrows(ArithmeticException.class, ()->{
			calculadora.DIVISION(1, 0);
		});
	}

	@Test
	public void CUADRATICA(){
		assertArrayEquals(calculadora.CUADRATICA(1, 2, -8), new double[]{2, -4});
	}

	@Test
	public void CUADRATICA2(){
		assertNotEquals(calculadora.CUADRATICA(1, 2, 80), new double[]{2, -4});
	}

	@Test
	public void CUADRATICAException() {
		Assertions.assertThrows(ArithmeticException.class, () -> {
			calculadora.CUADRATICA(1, 0, -8);
			calculadora.CUADRATICA(0, 2, -8);
		});
	}}