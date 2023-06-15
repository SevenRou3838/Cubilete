public class Sumar {
    public static int sumar(int a, int b) {
        int c;
        c = a + b;
        return c;
    }

    public static int resta(int a, int b) {
        int d;
        d = a - b;
        return d;
    }

    public static int multiplicar(int a, int b) {
        int d;
        d = a * b;
        return d;
    }

    public static int dividir(int a, int b) {
        int d;
        d = a / b;
        return d;
    }

    public static int op(int a, int b) {
        int d;
        d = (a * 3) / b;
        return d;
    }

    public static void main(String[] args) {
        int m = 10;
        int n = 5;
        int r;
        // metodo sumar
        r = sumar(n, m);
        System.out.println("sumar: " + r);
        // resta
        r = resta(n, m);
        System.out.println("resta: " + r);
        // Multiplicar
        r = multiplicar(n, m);
        System.out.println("multilicar: " + r);
        // dividir
        r = dividir(n, m);
        System.out.println("dividir: " + r);
        // op
        r = op(n, m);
        System.out.println("op :  " + r);
        if (r > 2) {
            System.out.println("paso :  ");
        } else {
            System.out.println("denegado :  ");

        }
    }
}