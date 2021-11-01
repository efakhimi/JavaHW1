/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javahw1;

import static java.lang.Math.sqrt;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Veteran
 */
public class JavaHW1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //question01();
        //question02();
        //question03();
        //question04();
        //question05();
        //question06();
        //question06b();
        //question07();
        //question07b();
        //question08();
    }
    

    private static void question01() {
        Scanner input = new Scanner(System.in);

        System.out.println("please Enter a float number : ");
        double n = input.nextDouble();

        int m = (int) n;
        float a = (float) (n - m);
        while (a % 1 != 0) {
            a *= 10;
        }
        while (true) {
            System.out.println("Enter the decimal number you want to change : ");
            int b = input.nextInt();
            System.out.println("Enter the desired number: ");
            int c = input.nextInt();

            int x = (int) a;

            for (int i = 1; x > 0; i *= 10) {
                if (x % 10 == b) {
                    a = (int) (a + c * i - b * i);
                }
                x /= 10;
            }

            System.out.println("Enter the integer number you want to change : ");
            int d = input.nextInt();
            System.out.println("Enter the desired number: ");
            int e = input.nextInt();

            int z = (int) m;

            for (int i = 1; z > 0; i *= 10) {
                if (z % 10 == d) {
                    m = (int) (m + e * i - d * i);
                }
                z /= 10;
            }

            System.out.println((int) m + "." + (int) a);
            System.out.println("Do you want continue [Y/N] ? ");
            String ans = input.next();
            if (!(ans.startsWith("y") || ans.startsWith("Y"))) {
                break;
            }
        }

    }

    private static void question02() {
        Scanner input = new Scanner(System.in);

        System.out.println("Please Enter a number : ");
        long n = input.nextInt();
        System.out.println("Please enter the base: 2, 3, 5 or 7: ");
        int m = input.nextInt();

        long a = 0;
        long b = 1;

        switch (m) {
            case 2:
            case 3:
            case 5:
            case 7:
                base(n, m);
                break;
            default:
                System.out.println("worng number");
                break;
        }
    }

    private static void question03() {
        Scanner input = new Scanner(System.in);

        System.out.println("please Enter a number : ");
        double n = input.nextDouble();

        if (n % 1 == 0) {
            int m = Reverse((int) n);

            if (n == m) {
                System.out.println("The number is two-sided");
            } else {
                System.out.println("The number is Not two-sided");
            }

        } else {
            int m = (int) n;
            float b = (float) (n - m);

            while (b % 1 != 0) {
                b *= 10;

            }
            if (b == Reverse((int) m)) {
                System.out.println("The number is two-sided");
            } else {
                System.out.println("The number is Not two-sided");
            }
        }
    }

    private static void question04() {
        Scanner input = new Scanner(System.in);

        System.out.println("Ples Enter a number: ");
        int n = input.nextInt();
        int max = n, min = n, smax = 0;

        while (true) {
            System.out.println("Do you want continue [Y/N] ? ");
            String ans = input.next();

            if (!(ans.startsWith("y") || ans.startsWith("Y"))) {
                break;
            }

            System.out.println("Please Enter a number: ");
            n = input.nextInt();

            if (n > smax && n < max) {
                smax = n;
            }

            if (n > max) {
                smax = max;
                max = n;
            }
            if (n < min) {
                min = n;
            }

        }

        System.out.println("Max : " + max);
        System.out.println("Second Max : " + smax);
        System.out.println("Min : " + min);

    }

    private static void question05() {
        Scanner input = new Scanner(System.in);

        System.out.println("Please Enter number betwen 2 - 9 : ");
        int n = input.nextInt();

        System.out.println();
        for (int x = 1; x <= n; x++) {
            for (int y = 1; y <= n - x; y++) {
                System.out.print(" ");
            }
            for (int y = 1; y <= x; y++) {
                System.out.print(x);
            }
            for (int y = 1; y <= x - 1; y++) {
                System.out.print(x);
            }
            System.out.print("   ");

            for (int y = 1; y <= n - x + 1; y++) {
                System.out.print(n - x + 1);
            }
            for (int y = 1; y <= n - x; y++) {
                System.out.print(n - x + 1);
            }
            System.out.print("   ");

            for (int y = 1; y <= x; y++) {
                System.out.print(x);
            }
            for (int y = 1; y <= x - 1; y++) {
                System.out.print(x);
            }
            System.out.println("");
        }
    }

    public static int Reverse(int n) {
        long r;
        long sum = 0;
        while (n > 0) {
            r = n % 10;
            sum = sum * 10 + r;
            n /= 10;
        }

        return (int) sum;
    }

    public static int base(long n, int m) {
        long a = 0;
        long b = 1;
        while (n > 0) {
            a = a + b * (n % m);
            b = b * 10;
            n = n / m;
        }
        System.out.println("Input number in base #" + m + " : " + a);
        return 0;

    }
    private static void question06()
    {
        try {
            Scanner input = new Scanner(System.in);

            String line = "###";
            for (int i = 0, j = 0; j < 3; i++) {
                System.out.print("\r" + line);
                line =" "+line;
                Thread.sleep(400);
                if (i == 12) {
                    j++;
                    i = 0;
                    line = "###";
                }
            }
        } catch (Exception e) {
            System.out.println("Error!");
        }

    }

    private static void question06b() throws InterruptedException {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("|***         |\n\n\n\n\n\n\n\n");
            Thread.sleep(500);
            System.out.println("| ***        |\n\n\n\n\n\n\n\n");
            Thread.sleep(500);
            System.out.println("|  ***       |\n\n\n\n\n\n\n\n");
            Thread.sleep(500);
            System.out.println("|   ***      |\n\n\n\n\n\n\n\n");
            Thread.sleep(500);
            System.out.println("|    ***     |\n\n\n\n\n\n\n\n");
            Thread.sleep(500);
            System.out.println("|     ***    |\n\n\n\n\n\n\n\n");
            Thread.sleep(500);
            System.out.println("|      ***   |\n\n\n\n\n\n\n\n");
            Thread.sleep(500);
            System.out.println("|       ***  |\n\n\n\n\n\n\n\n");
            Thread.sleep(500);
            System.out.println("|        *** |\n\n\n\n\n\n\n\n");
            Thread.sleep(500);
            System.out.println("|         ***|\n\n\n\n\n\n\n\n");
            Thread.sleep(500);
            System.out.println("|*         **|\n\n\n\n\n\n\n\n");
            Thread.sleep(500);
            System.out.println("|**         *|\n\n\n\n\n\n\n\n");
            Thread.sleep(500);
        }

    }
    private static void question07() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter a Number: ");
        int n = input.nextInt();

        double b = sqrt(n);
        int c = (int) b;
        int d = n / c;
        int m = c;
        while (m > 0) {
            for (int i = 1; i <= 4; i++) {
                d = n / c;
                while (d > 0) {
                    for (int j = 1; j <= 4; j++) {
                        System.out.print("* ");
                    }
                    System.out.print("   ");
                    d--;
                }
                System.out.println();
            }
            System.out.println();
            m--;
        }

        int f = n % c;
        int h = f;
        if (f != 0) {
            for (int i = 1; i <= 4; i++) {
                f = h;
                while (f > 0) {
                    for (int j = 1; j <= 4; j++) {
                        System.out.print("* ");
                    }
                    System.out.print("   ");
                    f--;
                }
                System.out.println();
            }
        }

    }

    private static void question07b()
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
          for (int j = 1; j <= n; j++) {
            System.out.println();
        }
        for (int h = 1; h <= n; h++) {
            for (int r = n * 6; r >= h; r--) {
                System.out.print(" ");
            }
            for (int y = 1; y <= h; y++) {

                System.out.print("* ");
            }
            for (int j = 10 * n; j >= h; j--) {
                System.out.print(" ");

            }
            for (int r = n; r >= h; r--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= h; k++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        for (int j = 1; j <= n; j++) {
            System.out.println();
        }
        for (int h = 1; h <= n; h++) {
            for (int r = n * 6; r >= h; r--) {
                System.out.print(" ");
            }
            for (int y = 1; y <= h; y++) {

                System.out.print("* ");
            }
            for (int j = 10 * n; j >= h; j--) {
                System.out.print(" ");

            }
            for (int r = n; r >= h; r--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= h; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    private static void question08() {
        Scanner input = new Scanner(System.in);
        Random generator = new Random();

        int a = generator.nextInt(999999999);
        int m = a;
        int b = 0;
        while (m > 0) {
            m /= 10;
            b++;
        }
        System.out.println("Number of digits : " + b);
        for (int i = 1; i <= b; i++) {
            System.out.print("*");
        }
        System.out.println();
        System.out.println("Let's Gooooo... ");
        int i = 20;
        while (true) {
            m = a;
            System.out.println("Guess the number: ");
            int n = input.nextInt();
            if (n == a) {
                System.out.println("Great , You managed to guess correctly");
                break;
            }
            m = Reverse(m);
            n = Reverse(n);

            while (n > 0) {
                if (n % 10 == m % 10) {
                    System.out.print(n % 10);
                } else {
                    System.out.print("*");
                }
                m /= 10;
                n /= 10;
            }
            System.out.println();

            i--;
        }
        if (i < 1) {
            i = 1;
        }
        System.out.println("Your score is [" + i * 5 + "] of [100]");

    }
}
