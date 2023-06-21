import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println("Enter Number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int r = 0, sum = 0, temp = n;

        do {
            r = n % 10;
            sum = sum + (r * r * r);
            n = n / 10;
        } while (n > 0);

        if (sum == temp) {
            System.out.println("Armstrong number.");
        } else {
            System.out.println("Not an armstrong number");
        }
    }

}
