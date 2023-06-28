import java.util.Scanner;

public class MergeTwoArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size of 1st array : ");
        int a = sc.nextInt();

        int[] arr1 = new int[a];
        for (int i = 0; i < arr1.length; i++) {
            System.out.print("Enter element " + (i + 1) + " : ");
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter Size of 2nd array : ");
        int b = sc.nextInt();

        int[] arr2 = new int[b];
        for (int i = 0; i < arr2.length; i++) {
            System.out.print("Enter element " + (i + 1) + " : ");
            arr2[i] = sc.nextInt();
        }
        int a1 = arr1.length;
        int b1 = arr2.length;
        int c1 = a1 + b1;

        int[] newArray = new int[c1];

        for (int i = 0; i < a1; i++) {
            newArray[i] = arr1[i];
        }
        for (int i = 0; i < b1; i++) {
            newArray[a1 + i] = arr2[i];
        }

        for (int i = 0; i < newArray.length; i++) {
            System.out.println("arr[" + (i) + "] : " + newArray[i]);
        }
    }
}