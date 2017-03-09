package com.sort;
/**
 * ��������
 * @author jackie20233
 *
 */
public class QuickSort {
	public <T> void quickSort(T arr[],int l , int r){
		if(l >= r){
			return;
		}else{
			int p = partation(arr , l , r);
			quickSort(arr , l , p-1);
			quickSort(arr , p+1 , r);
		}
	}
	/**
	 * ���������partation����
	 * @param <T>
	 * @param arr
	 * @param l
	 * @param r
	 * @return
	 */
	
	public <T> int partation(T arr[] , int l , int r){
		T  middleValue = arr[l];
		int j = l;
		for(int i = l+1 ; i <= r ; i++){
			if(arr[i] < middleValue){
				swap(arr[i] , arr[j+1]);
				j++;
			}
		}
		swap(arr[l] , arr[j]);
		return j;
	}
	/**
	 * �Լ�����һ�������ķ���
	 * @param <T>
	 * @param value1
	 * @param value2
	 */
	public <T> void swap(T value1 , T value2){
		T temp = value1;
		value1 = value2;
		value2 = temp;
	}

}
