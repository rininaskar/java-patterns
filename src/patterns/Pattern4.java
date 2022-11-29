package patterns;

import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int a = 0;
        int b = 1;
        for (int i = 1; i <= c; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(a + "\t");
                int k = a + b;
                a = b;
                b = k;
            }
            System.out.println();
        }
    }
}
