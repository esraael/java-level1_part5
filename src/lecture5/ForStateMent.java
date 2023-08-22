package lecture5;

import java.util.Scanner;

public class ForStateMent {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int grade, sum = 0;

        for (int counter = 1; counter <= 5; counter++) {
            System.out.println("enter 5 grade for student" + counter);
            grade = sc.nextInt();
            sum = sum + grade;

        }
        System.out.println("the average for 5 grade is " + sum / 5);
    }
}
