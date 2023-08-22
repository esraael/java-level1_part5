package lecture5;

import java.util.Scanner;

public class theAverageFor5grade {

    public static void main(String[] args) {
        int grade = 0, sum = 0, count = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your grade or exit for -1");
        while (count <= 5 && grade != -1) {
            System.out.println("enter grade for 5 average " + count);
            grade = sc.nextInt();
            sum += grade;
            count++;

        }
        System.out.println("the average for 5 grade is " + sum / 5);
    }
}
