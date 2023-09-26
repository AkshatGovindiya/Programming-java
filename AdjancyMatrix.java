import java.util.Scanner;
public class AdjancyMatrix{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter number of Nodes : ");
		int nodes=sc.nextInt();

		System.out.println("Enter number of Edges : ");
		int edges=sc.nextInt();

		int adjMatrix[][]=new int[nodes][nodes];

		for(int i=0;i<edges;i++){

			System.out.println("Enter Starting point of Node :");
			int x=sc.nextInt();
			System.out.println("Enter Ending point of Node :");
			int y=sc.nextInt();

			adjMatrix[x][y]=1;
			adjMatrix[y][x]=1;


		}

		System.out.println("Adjency Matrix : ");

		for(int i=0;i<nodes;i++){
			for(int j=0;j<nodes;j++){

				System.out.print(adjMatrix[i][j]+" ");	
			}

			System.out.println();
		}




	}
}
