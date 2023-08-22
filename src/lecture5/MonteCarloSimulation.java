package lecture5;

import java.util.Scanner;

public class MonteCarloSimulation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double num_of_trial = 10000000;
        int num_of_hist = 0;
        for (int i = 0; i < num_of_trial; i++) {

            double x = (Math.random() * 2.0 - 1);

            double y = (Math.random() * 2.0 - 1);
            if (x * x + y * y <= 1) {
                num_of_hist++;
            }

        }
        double PI = 4.0 * num_of_hist / num_of_trial;
        System.out.println("the pi is " + PI);
    }
}
