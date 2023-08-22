package lecture5;

import java.util.Scanner;

public class RepeatAditionQuiz {

    public static void main(String[] args) {
        int num1 = (int) (Math.random() * 10);
        int num2 = (int) (Math.random() * 10);

        Scanner sc = new Scanner(System.in);
                
        System.out.println("whats is " + num1 + "+" + num2 + "?");
        int answer = sc.nextInt();
        while (num1 + num2 != answer) {
            System.out.println("wrong try again what is " + num1 + "+" + num2 + "?");
            answer = sc.nextInt();
        }
        System.out.println("you do it");
    }

}
