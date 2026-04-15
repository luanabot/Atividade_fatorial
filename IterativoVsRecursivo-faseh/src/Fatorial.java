public class Fatorial {

    // Iterativo
    public long fatorialIterativo(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Número não pode ser negativo");
        }

        long resultado = 1;

        for (int i = 2; i <= n; i++) {
            resultado *= i;
        }

        return resultado;
    }

    // Recursivo
    public long fatorialRecursivo(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Número não pode ser negativo");
        }

        if (n == 0 || n == 1) {
            return 1;
        }

        return n * fatorialRecursivo(n - 1);
    }
}
