package lecture5;

public class Sheet88 {

    public static void main(String[] args) {

        int num = 2;
        boolean isprime;
        while (num <= 100) {
            isprime = true;
            for (int i = num / 2; i >= 2; i--) {
                if (num % i == 0) {
                    isprime = false;
                    break;
                }

            }
            if (isprime) {
                System.out.println(num);
            }
            num++;
        }
    }
}
