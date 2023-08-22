package lecture5;

import java.util.Scanner;

public class Lecture5 {

    public static void main(String[] args) {
        int grade = 0, sum = 0, count = 1;
        Scanner sc = new Scanner(System.in);

        while (count <= 6) {
            System.out.println("enter grade for num " + count);

            grade = sc.nextInt();
            sum += grade;
            count++;

        }
        System.out.println("the average for 6 student = " + sum / 6);

    }

}
