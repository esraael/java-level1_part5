package lecture5;

import java.util.Scanner;

public class tuition {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double tuition = 10000;
        int year = 1;
        while (tuition < 20000) {
            tuition = tuition * 1.07;
            year++;
        }
        System.out.println("tuition will be doubled in" + year + "years");
    }
}
