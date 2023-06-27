import java.util.Scanner;

public class AscendingOrderInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size of array : ");
        int n = sc.nextInt();

        int[] myArry = new int[n];
        for (int i = 0; i < myArry.length; i++) {
            System.out.print("Enter element " + (i + 1) + " : ");
            myArry[i] = sc.nextInt();
        }
        // Ascending Insertion Sort Algorithm
        int temp;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < myArry.length; j++) {
                if (myArry[i] > myArry[j]) {
                    temp = myArry[i];
                    myArry[i] = myArry[j];
                    myArry[j] = temp;
                }
            }
        }
        System.out.println("\nSorted Array is: \n");
        for (int i = 0; i < myArry.length; i++) {
            System.out.println("arr[" + (i) + "] : " + myArry[i]);

        }

    }
}
