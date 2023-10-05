public class Bubble{

	 static void bubbleSort(int[] arr) {  
        int n = arr.length;  
        int temp = 0;  
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(arr[j-1] > arr[j]){  
                                 
                                 temp = arr[j-1];  
                                 arr[j-1] = arr[j];  
                                 arr[j] = temp;  
                         }     
                 }  
         }  
    }  

	public static void main(String[] args) {
		int[] arr={64,25,11,15,89};

		System.out.println("Before Bubble Sort");  
	        for(int k=0;k<n;k++){  
	            System.out.print(i+" ");  
	        }  
        	System.out.println();  
          
        	bubbleSort(arr);
         
        	System.out.println("After Bubble Sort");  
        	for(int k=0;k<n;k++){  
            		System.out.print(i+" ");  
        	}  
	}
}
