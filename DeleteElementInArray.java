import java.util.Scanner;

public class DeleteElementInArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of array :");
        int n = sc.nextInt();

        int[] myArry = new int[n];

        for (int i = 0; i < myArry.length; i++) {
            System.out.print("Enter element " + (i + 1) + " : ");
            myArry[i] = sc.nextInt();
        }

        System.out.println("Enter index to remove number : ");
        int pos = sc.nextInt();

        System.out.println("New Array after delete the element :     ");

        for (int i = 0; i < pos; i++) {
            System.out.println("arr[" + i + "] = " + myArry[i]);
        }

        for (int i = pos + 1; i < n; i++) {
            System.out.println("arr[" + (i - 1) + "] = " + myArry[i]);
        }
    }
}
