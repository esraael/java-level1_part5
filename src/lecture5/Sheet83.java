package lecture5;

import java.util.Scanner;

public class Sheet83 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, max;
        num = sc.nextInt();
        max = num;
        do {
            num = sc.nextInt();
            if (num > max) 
                max = num;
            

        } while (num!=0); {
            System.out.println("max is" + max);
            System.out.println("num is" + num);
        }
    }
}
