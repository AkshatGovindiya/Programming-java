import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = sc.nextInt();

        int ans = getSum(n);
        System.out.println("Ans is : " + ans);
    }

    public static int getSum(int n) {
        if (n == 0) {
            return 0;
        }
        return (n % 10 + getSum(n / 10));
    }
}
