//TIME COMPLEXITY O(nlogn)

package sort;

import java.util.Arrays;

import chapter6.MergeSorter;

public class MergeSort_Recursion {

	
	public static void sort(int [] data) {
		mergeSort(data,0,data.length-1);
	}
	
	
	public static void mergeSort(int []A,int start,int end) {
		if(start<end) {
			int middle=(int) Math.floor((start+end)/2);
			mergeSort(A,start,middle);
			mergeSort(A,middle+1,end);
			
			merge(A,start,middle,end);
		}
	}
	
	public static void merge(int []A,int start,int middle,int end) {
		int ni= middle-start+1;
		int nj=end-middle;
		
		int []left=new int[ni];
		int[]right=new int[nj];
		
		
		for(int i=0;i<ni;i++) {
			 left[i]=A[i];
		}
		
		for(int j=0;j<nj;j++) {
			right[j]=A[middle+1+j];
		}
		
		int i=0, j=0;
		for(int k=0;k<=end;k++) {
			if((j>=nj)||(i<ni)&&(left[i]<=right[j])) {
				A[k]=left[i];
				i++;
			}
			else {
				A[k]=right[j];
				j++;
			}
		}
		
	}
	
	public static void main(String[] args) {
		MergeSorter sorter = new MergeSorter();
		int[] data = {4,1,6,9,5};
		sorter.sort(data);
		System.out.println(Arrays.toString(data));
	}
	
}




