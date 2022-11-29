package patterns;

import java.util.Scanner;

public class Pattern5 {
    public static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        System.out.print("Enter Right Triangle Fibonacci Number Rows = ");
        int rows = sc.nextInt();

        System.out.println(" The Right Triangle of Fibonacci Series Numbers Pattern");
        for (int i = 1; i <= rows; i++) {
            int first_value = 0;
            int second_value = 1;
            for (int j = 1; j <= i; j++) {
                int Next = first_value + second_value;
                System.out.print(Next + " ");
                first_value = second_value;
                second_value = Next;
            }
            System.out.println();
        }
    }
}
