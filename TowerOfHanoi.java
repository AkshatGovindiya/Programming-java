public class TowerOfHanoi {
    public static void main(String[] args) {
        int numberOfDiscs = 4; // Change the number of discs as per your requirement
        char source = 'A';
        char intermediate = 'B';
        char destination = 'C';
        
        // Call method 
        solveTowerOfHanoi(numberOfDiscs, source,intermediate, destination);
    }

    public static void solveTowerOfHanoi(int n, char source, char intermediate, char destination) {
        if (n == 1) {
            System.out.println("Move disc 1 from " + source + " to " + destination);
            return;
        }

        solveTowerOfHanoi(n - 1, source, destination, intermediate);
        System.out.println("Move disc " + n + " from " + source + " to " + destination);
        solveTowerOfHanoi(n - 1, intermediate, source, destination);
    }
}
