package calculadora;

public class Calculadora {


    public int suma(int a, int b) {
        return a + b;
    }

    public int resta(int a, int b) {
        return a - b;
    }

    public int multiplicar(int a, int b){
        return a * b;
    }

    public int dividir(int a, int b) {
        return a / b;
    }

    public double[] raizCuadratica(int a, int b, int c) {
        if (a == 0 || b == 0) {
            throw new ArithmeticException();
        }

        double preMasMenos = Math.sqrt((b * b) - (4 * a * c));
        double postMasMenosPositivo = (-b + preMasMenos) / 2 * a;
        double postMasMenosNegativo = (-b - preMasMenos) / 2 * a;

        double[] rta = {postMasMenosPositivo, postMasMenosNegativo};
        return rta;
    }
}
