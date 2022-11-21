package CalculadoraAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Api {
    num;
    num2;

    public static int suma(int num, int num2){
        int resultado = num + num2;
        return resultado;
    }

    public static int resta(int num, int num2){
        int resultado = num - num2;
        return resultado;
    }

    public static int multi(int num, int num2){
        int resultado = num * num2;
        return resultado;
    }

    public static int div(int num, int num2){
        int resultado = num/num2;
        return resultado;
    }




}
