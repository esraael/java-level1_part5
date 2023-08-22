package lecture5;

import java.util.Scanner;

public class Continue {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <= 10; i++) {
            if (i == 3) {
                continue;
            }
            {
//                break;
            }
            System.out.println("i =" + i);

        }

    }

}
