package lecture5;

import java.util.Scanner;

public class GreatsCommonDevises {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n1");
        int n1 = sc.nextInt();
        System.out.println("Enter n2");
        int n2 = sc.nextInt();
        int gcd = 1;
        int k = 2;
        while (k < n1 && k < n2) {

            if (n1 % k == 0 && n2 % k == 0) {
                gcd = k;
            }
            k++;
        }
        System.out.println("the greats common division is " + n1 + "and " + n2 + "is" + gcd);

    }
}
