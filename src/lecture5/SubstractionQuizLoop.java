package lecture5;

import java.util.Scanner;

public class SubstractionQuizLoop {

    public static void main(String[] args) {
        final int num_of_quesion = 5;
        int correctcount = 0;
        int count = 0;
        long starttime = System.currentTimeMillis();
        String output = "";
        Scanner sc = new Scanner(System.in);
        while (count < num_of_quesion) {
            int num1 = (int) (Math.random() * 10);
            int num2 = (int) (Math.random() * 10);
            if (num1 < num2) {
                int temp = num1;
                num1 = num2;
                num2 = temp;
            }
            System.out.println("what is " + num1 + "_" + num2 + "?");
            int answer = sc.nextInt();
            if (num1 - num2 == answer) {
                System.out.println("you are correct");
                correctcount++;
            } else {
                System.out.println("your answer is wron" + num1 + "-" + num2 + "should be = " + (num1 - num2));
            }
            count++;
            output += "\n" + num1 + "-" + num2 + "=" + answer + ((num1 - num2 == answer) ? "correct" : "wrong");
        }

        long endtime = System.currentTimeMillis();
        long testtime = endtime - starttime;
        System.out.println("correctcount is " + correctcount + "testtime is" + testtime / 1000 + "second" + output);
    }
}
