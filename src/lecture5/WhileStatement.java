package Lecture5;

import java.util.Scanner;

public class WhileStatement{

    public static void main(String[] args) {

        int grade = 0, sum = 0, counter = 1;
        Scanner input = new Scanner(System.in);
        while (grade <= 6) {

            System.out.println("enter your grade" + counter);
            grade = input.nextInt();
            sum += grade;
            counter++;

        }
        System.out.println("the avarege of the 6 grade is =" + sum / 6);
    }

}
