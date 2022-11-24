package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[]args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("/SUMA")
	public int SUMA	(@RequestParam(value="a") int num1,@RequestParam(value = "b") int num2) {
		return num1 + num2;
	}

	@GetMapping("/RESTA")
	public int RESTA (@RequestParam(value="a") int num1,@RequestParam(value = "b") int num2) {
		return num1 - num2;
	}

	@GetMapping("/MULTIPLICACION")
	public int MULTIPLICACION(@RequestParam(value="a") int num1,@RequestParam(value = "b") int num2) {
		return num1 * num2;
	}

	@GetMapping("/DIVISION")
	public int DIVISION(@RequestParam(value="a") int num1,@RequestParam(value = "b") int num2) {

		return num1 / num2;
	}

	@GetMapping("/CUADRATICA")
	public double[] CUADRATICA(@RequestParam(value="a") int a,@RequestParam(value = "b")int b,@RequestParam(value = "c")int c) {
		if(a ==0 || b == 0)  { throw new ArithmeticException(); }

		double preMasMenos = Math.sqrt((b * b) - (4 * a * c));
		double postMasMenosPositivo = (-b + preMasMenos)/2*a;
		double postMasMenosNegativo = (-b - preMasMenos)/2*a;

		double[] result ={postMasMenosPositivo,postMasMenosNegativo};
		return result;
	}
}