package com.sort;
/**
 * ð������
 * @author jackie202333
 *
 */
public class BubbleSort {
 public <T> void bubbeSort(T arr[]){
	 for(int i = 0 ; i < arr.length ; i++){
		 for(int j = i ; j < arr.length ; j++){
			 if(arr[i]>arr[j]){
				 swap(arr[i] , arr[j]);
			 }
		 }
	 }
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
