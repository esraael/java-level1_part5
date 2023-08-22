package lecture5;

//import java.util.Scanner;
public class PrimeNum {

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        final int num_of_prime = 50;
        final int num_of_prime_per_line = 10;
        int count = 0;
        int num = 2;
        System.out.println("enter the 50 prime num");
        while (count < num_of_prime) {
            boolean isprime = true;
            for (int divisior = 2; divisior <= num / 2; divisior++) {
                if (num % divisior == 0) {
                    isprime = false;
                    break;
                }

            }
            if (isprime) {
                count++;
                if (count % num_of_prime_per_line == 0) {
                    System.out.println("the num =" + num);
                } else {
                    System.out.println(num + " ");
                }

            }
            num++;
        }

    }
}
