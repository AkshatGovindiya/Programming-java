import java.util.Scanner;

public class InsertingArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of array :");
        int n = sc.nextInt();

        int[] myArry = new int[n];

        for (int i = 0; i < myArry.length; i++) {
            System.out.print("Enter element " + (i + 1) + " : ");
            myArry[i] = sc.nextInt();

        }

        System.out.println("Enter the number to be inserted : ");
        int elementToInsert = sc.nextInt();
        System.out.println("Enter the position at which the number has to be added : ");
        int pos = sc.nextInt();

        int[] newArry = new int[n + 1];

        for (int i = 0, j = 0; i < n; i++, j++) {
            if (i == pos) {
                newArry[i] = elementToInsert;
                j++;
            }
            newArry[j] = myArry[i];
        }
        System.out.println(" The array after insertion of " + elementToInsert + " is : ");

        for (int i = 0; i < n + 1; i++)
            System.out.println("Arry[" + i + "] =" + newArry[i]);
    }

}
