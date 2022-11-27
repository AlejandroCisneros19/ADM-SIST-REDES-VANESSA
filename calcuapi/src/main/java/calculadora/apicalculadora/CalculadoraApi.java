package calculadora.apicalculadora;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class CalculadoraApi {

	public static void main(String[] args) {
		SpringApplication.run(CalculadoraApi.class, args);
	}

	@GetMapping("/suma")
	public int suma(@RequestParam(value="a") int a,@RequestParam(value = "b") int b)
	{
		return a + b;
	}

	@GetMapping("/resta")
	public int resta(@RequestParam(value="a") int a,@RequestParam(value = "b") int b)
	{
		return a - b;
	}

	@GetMapping("/multiplicar")
	public int multiplicar(@RequestParam(value="a") int a ,@RequestParam(value = "b") int b)
	{
		return a * b;
	}

	@GetMapping("/dividir")
	public int dividir(@RequestParam(value="a") int a ,@RequestParam(value = "b") int b){
			if (a==0 || b==0)
				throw new ArithmeticException();

			return a / b;
	}

	@GetMapping("/cuadratica")
	public double[] cuadratica(@RequestParam(value = "a") int a, @RequestParam(value = "b") int b, @RequestParam(value = "c") int c) {
		if (a == 0 || b == 0)
			throw new ArithmeticException();

		double preMasMenos = Math.sqrt((b * b) - (4 * a * c));
		double postMasMenosPositivo = (-b + preMasMenos)/2*a;
		double postMasMenosNegativo = (-b - preMasMenos)/2*a;

		double[] rta;
		rta = new double[]{postMasMenosPositivo,postMasMenosNegativo};
		return rta;
	}
}
