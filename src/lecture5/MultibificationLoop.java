package lecture5;

import java.util.Scanner;

public class MultibificationLoop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("        multification loop");
        System.out.println("     ");
        for (int j = 0; j <= 9; j++) {
            System.out.print("    " + j);
        }
        System.out.println("\n________________________________________");

        for (int i = 0; i <= 9; i++) {
            System.out.println(i + "|");
            for (int j = 0; j <= 9; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println(" ");
        }

    }

}
