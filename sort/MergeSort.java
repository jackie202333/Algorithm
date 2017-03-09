package com.sort;
/**
 * 归并排序,优化
 * @author jackie20233
 *
 */
public class MergeSort {
   public  void mergeSort(int arr[] , int l , int r){
	   if(r-l<=15){
		   insertSort(arr , l , r);
		   return;
	   }else{
		   int middle=(l+r)/2;
		   mergeSort(arr , l , middle);
		   mergeSort(arr , middle , r);
		   merge(arr , l , middle , r);
	   }
   }
   public void merge(int arr[] , int l , int middle ,int r){
	  int aux[] = new int[r-l+1] ;
	   for(int i = l ;i <= r ;i++){
		   aux[i-l] = arr[i];
	   }
	   int i = l ; 
	   int j = middle + 1;
	   for(int k = l ; k <= r ;k++ ){
		   if(i>middle){
			   arr[k]=aux[j-1];
			   j++;
		   }else if(j > r){
			   arr[k]=aux[i-1];
			   i++;
		   }else if(aux[i-l] < aux[j-1]){
			   arr[k] = aux[i-1];
			   i++;
		   }else{
			   arr[k]=aux[j-1];
			   j++;
		   }
	   }
   }
   /**
    * 改进插入排序
    * @param <T>
    * @param arr
    * @param l
    * @param r
    */
   public void insertSort(int arr[] , int l , int r) {
		for(int i = l+1 ; i <= r ; i++){
			int temp = arr[i];
			int j;
			for(j = i;j < l && arr[j-1] > temp ; j--){
				arr[j] = arr[j-1];
			}
			arr[j] = temp;
		}
	}
}
