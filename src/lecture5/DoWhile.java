package lecture5;

import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {
        int grade = 0, sum = 0, counter = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter grade for 5 student");
        do {
            System.out.println("enter your grade" + counter);
            grade = sc.nextInt();
            sum += grade;
            counter++;
        } while (counter <= 5);

        System.out.println("the average of 5 grade is" + sum / 5);

    }
}
