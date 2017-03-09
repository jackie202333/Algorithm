package com.sort;
/**
 * 冒泡排序
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
	 * 自己定义一个互换的方法
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
