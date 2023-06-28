import java.util.Scanner;

public class AscendingInsertElement {
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

        int[] newArray = new int[n + 1];
        System.out.println("Enter Number To Insert in array :");
        int elementToInsert = sc.nextInt();
        int j = 0, i = 0;
        for (i = 0; i < n; i++) {
            if (myArry[i] >= elementToInsert) {
                newArray[i] = elementToInsert;
                break;

            } else {
                newArray[j] = myArry[j++];
            }
        }
        for (int k = i + 1; k < newArray.length; k++)
            newArray[k] = myArry[j++];

        for (i = 0; i < n + 1; i++) {
            System.out.println("arr[" + (i) + "] : " + newArray[i]);
        }
    }
}
