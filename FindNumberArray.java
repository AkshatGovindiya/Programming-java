import java.util.Scanner;

public class FindNumberArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of array :");
        int n=sc.nextInt();
        
        int[] myArry=new int[n];

        for (int i = 0; i < myArry.length; i++) {
            System.out.print("Enter element " + (i + 1) + " : ");
            myArry[i] = sc.nextInt();
        }

        System.out.println("Enter a element to find position :");
        int a = sc.nextInt();
        for (int i = 0; i < myArry.length; i++) {
            if (a == myArry[i]) {
                System.out.println("Element found at index " + (i));
            }
        }

    }

}
