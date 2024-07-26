public class Fibo {
    public static void main(String[] args) {
        short n = 10; // Número de términos de la serie de Fibonacci
        int a = 0, b = 1, c;

        System.out.println("Serie de Fibonacci hasta " + n + " términos:");
        System.out.print(a + " " + b);

        for (int i = 2; i < n; i++) {
            c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
    }
}
