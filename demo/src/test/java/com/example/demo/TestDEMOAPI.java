package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.calculadoraDEMOAPI;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class TestDEMOAPI {

	calculadoraDEMOAPI calculator = new calculadoraDEMOAPI();

	public void evento(){
		calculator = new calculadoraDEMOAPI();
	}


	//TEST SUMA
	@Test
	public void sumaTest(){
		evento();
		assertEquals(7, calculator.suma(5, 2));
	}
	@Test
	public void sumaTestFail(){
		evento();
		assertEquals(5, calculator.suma(5, 2));
	}


	//TEST RESTA
	@Test
	public void restaTest(){
		evento();
		assertEquals(3, calculator.resta(5, 2));
	}
	@Test
	public void restaTestFail(){
		evento();
		assertEquals(4, calculator.resta(5, 2));
	}


	//TEST MULTIPLICACION
	@Test
	public void multiplicacionTest(){
		evento();
		assertEquals(10, calculator.multiplicacion(5, 2));
	}
	@Test
	public void multiplicacionTestFail(){
		evento();
		assertEquals(8, calculator.multiplicacion(5, 2));
	}


	//TEST DIVISION
	@Test
	public void divisionTest(){
		evento();
		assertEquals(5, calculator.division(10, 2));
	}
	@Test
	public void divisionTestFail(){
		evento();
		assertEquals(10, calculator.division(10, 2));
	}
	@Test
	public void divisionExceptionTest(){
		evento();
		Assertions.assertThrows(ArithmeticException.class, () -> {
			calculator.division(10, 0);
				});
	}


	//TEST CUADRATICA
	@Test
	public void raizCuadraticaTest(){
		evento();
		assertArrayEquals(calculator.cuadratica(1, -1, -2), new double[] {2, -1},0);
	}
	@Test
	public void raizCuadraticaFailTest(){
		evento();
		assertArrayEquals(calculator.cuadratica(1, -1, -4), new double[] {2, -1}, 0);
	}



}
