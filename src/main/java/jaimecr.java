public class jaimecr {
    public static void main(String[] args) {
        int numero = 1;
        while (numero <= 10) {
            extracted(numero);
            numero = numero + 1;
        }


    }

    private static void extracted(int i) {
        if (i % 2 == 0) {
            System.out.println( i + "hola");
        } else {
            System.out.println(i + "adios");
        }
    }
}
