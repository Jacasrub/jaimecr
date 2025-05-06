public class jaimecr {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            extracted(i);
            i = i + 1;
        }


    }

    private static void extracted(int i) {
        if (i % 2 == 0) {
            System.out.println("El número " + i + " es par");
        } else {
            System.out.println("El número " + i + " es impar");
        }
    }
}
