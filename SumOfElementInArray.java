import java.util.Scanner;

public class SumOfElementInArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of array :");
        int n = sc.nextInt();

        int[] myArry = new int[n];

        for (int i = 0; i < myArry.length; i++) {
            System.out.print("Enter element " + (i + 1) + " : ");
            myArry[i] = sc.nextInt();

        }
        int sum = 0;
        for (int i = 0; i < myArry.length; i++) {
            sum = sum + myArry[i];
        }
        System.out.println("Sum of Element in array is " + sum);

    }
}