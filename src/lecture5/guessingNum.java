package lecture5;

import java.util.Scanner;

public class guessingNum {

    public static void main(String[] args) {
        int num = (int) (Math.random() * 101);
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your magic num between 0 to 100");
        int guess = -1;
        while (guess != num) {
            System.out.println("enter your guess");
            guess = sc.nextInt();
            if (guess == num) {
                System.out.println("the num is " + num);
            } else if (guess > num) {
                System.out.println("very high");
            } else if (guess < num) {
                System.out.println("very low");
            }
        }
    }

}
