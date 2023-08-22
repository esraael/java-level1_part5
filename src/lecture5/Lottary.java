package lecture5;

import java.util.Scanner;

public class Lottary {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lottary, guess;
        lottary = (int) (Math.random() * 100);
        boolean count = true;
        System.out.println("the generated num random is " + lottary);
        while (count) {
            System.out.println("enter your grade from 0 to 100");
            guess = sc.nextInt();
            if (guess > lottary) {
                System.out.println("guess too very large");
            } else if (guess < lottary) {
                System.out.println("guess too very small");
            } else {
                System.out.println("you win");
            }

        }
        count = false;
    }
}
