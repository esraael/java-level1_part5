package lecture5;

import java.util.Scanner;

public class Break {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int sum = 0;
        while (num < 20) {
            num++;
            sum += num;
            if (num >= 100) {
                break;
            }
        }
        System.out.println("the num is " + num);
        System.out.println("the sum is" + sum);
    }

}
