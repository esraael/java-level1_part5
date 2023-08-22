package lecture5;

import java.util.Scanner;

public class SentienalValue {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter an int value (the program exit if the input is =0 ) ");
        int data = sc.nextInt();
        int sum = 0;
        while (data != 0) {
            sum += data;
            System.out.println("enter an int value (the program exit if the input is=0 ");
            data = sc.nextInt();
        }
        System.out.println("the sum is " + sum);
    }
}
