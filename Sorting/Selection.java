public class Selection{

	public static void selectionSort(int[] arr){
		for(int i=0;i<arr.length-1;i++){

			int index=i;

			for(int j=i+1;j<arr.length;j++){
				if(arr[j]<arr[index]){
					index=j;
				}
			}

			int smallNumber=arr[index];
			arr[index]=arr[i];
			arr[i]=smallNumber;

		}
	}

	public static void main(String[] args) {
		int[] arr={64,25,11,15,89};

		System.out.println("Before Selection Sort");  
        for(int i:arr){  
            System.out.print(i+" ");  
        }  
        System.out.println();  
          
        selectionSort(arr);
         
        System.out.println("After Selection Sort");  
        for(int i:arr){  
            System.out.print(i+" ");  
        }  
	}
}