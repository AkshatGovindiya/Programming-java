import java.util.*;

public class MergeSort{

	public static int[] mergeSort(int[] arr){
		if(arr.length==1){
			return arr;
		}
		int mid=arr.length/2;
		int[] leftArr=Arrays.copyOfRange(arr,0,mid);
		int[] rightArr=Arrays.copyOfRange(arr,mid,arr.length);
		return merge(mergeSort(leftArr),mergeSort(rightArr));
	}  

	public static int[] merge(int[] firstArr,int[] secArr){
		int[] mix=new int[firstArr.length+secArr.length];
		int i=0,j=0,k=0;

		while(i<firstArr.length && j<secArr.length){
			if(firstArr[i]<=secArr[j]){
				mix[k]=firstArr[i];
				i++;
			}
			else{
				mix[k]=secArr[j];
				j++;
			}
			k++;
		}

		while(i<firstArr.length){
			mix[k]=firstArr[i];
			i++;
			k++;
		}

		while(j<secArr.length){
			mix[k]=secArr[j];
			j++;
			k++;
		}

		return mix;

	}
 	
	public static void main(String[] args) {
		int[] arr={64,25,11,15,89};
		System.out.println(Arrays.toString(mergeSort(arr)));
		
	}
}
