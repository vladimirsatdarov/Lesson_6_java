package guru.guru;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 25;
        int d = 25;
        System.out.println("int a = " + a + ", int b = " + b + ", int c = " + c + ", int d = " + d);
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("b / a = " + (b / a));
        System.out.println("b % a = " + (b % a));
        System.out.println("c % a = " + (c % a));
        System.out.println("\na++   = " +  a++);
        System.out.println("a     = " +  a);
        System.out.println("--a   = " +  --a);
        System.out.println("\nb--   = " +  b--);
        System.out.println("b new = " +  b);
        // Проверьте разницу в d++ и ++d
        System.out.println("d++   = " +  (d++));
        System.out.println("++d   = " +  (++d));

        byte e = 100;
        byte f = 30;
        System.out.println("\nbyte e = " + e + ", byte f = " + f);
        System.out.println("e + f = " + (e + f));

        short g = -32000;
        short h = -1000;
        System.out.println("\nshort g = " + g + ", short h = " + h);
        System.out.println("g + h = " + (g + h));

        float i = 8.5F;
        double j = -3.2;
        System.out.println("\nfloat i = " + i + ", double j = " + j);
        System.out.println("i + j = " + (i + j));
        System.out.println("i + a = " + (i + a));

        a = 11;
        if (a == 10) {
            System.out.println("a = 10");
        } else {
            System.out.println("a != 10");
        }

        System.out.println("\na == b = " + (a == b) );
        System.out.println("a != b = " + (a != b) );
        System.out.println("a > b = " + (a > b) );
        System.out.println("a < b = " + (a < b) );
        System.out.println("b >= a = " + (b >= a) );
        System.out.println("b <= a = " + (b <= a) );
    }
}