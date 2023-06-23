import java.util.Scanner;

public class PrimeNumberBetween2no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st number: ");
        int start = sc.nextInt();
        System.out.println("Enter 2nd number: ");
        int end = sc.nextInt();

        System.out.println("Prime numbers between " + start + " and " + end + ":");

        for (int num = start; num <= end; num++) {
            boolean isPrime = true;

            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(num + " ");
            }
        }
    }
}
