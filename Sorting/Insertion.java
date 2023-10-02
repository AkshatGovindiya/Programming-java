public class Insertion{

	public static void insertionSort(int[] arr){

		int n=arr.length;
		for(int j=1;j<n;j++){

			int key=arr[j];
			int i=j-1;

			while((i>-1) && (key<arr[i])){
				arr[i+1]=arr[i];
				i--;
			}
			arr[i+1] = key; 
		}
	}

	public static void main(String[] args) {

		int[] arr={64,25,11,15,89};

		System.out.println("Before Insertion Sort");

        for(int i=0;i<arr.length;i++){

            System.out.print(i+" ");  
        }  
        System.out.println();  
          
        insertionSort(arr);
         
        System.out.println("After Insertion Sort");
          
        for(int i;i<arr.length;i++){

            System.out.print(i+" ");  
        }  	
	}
}