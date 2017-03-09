package com.sort;
/**
 * 插入排序
 * @author jackie202333
 *
 */
public class InsertSort {
	/**
	 * 使用范型保证对于浮点和整型都可以操作
	 * @param <T>
	 * @param arr
	 */
	public <T> void insertSort(T arr[]) {
		//寻找元素arr[i]合适的插入位置
		for(int i = 1; i < arr.length; i++) {
			T temp = arr[i];
			//保存temp元素位置
			int j;
			for(j = i ; j > 0 && arr[j-1] > temp;j--) {
				/*
				 * 一次交换等于三次赋值，使用赋值减少操作
				 */
				arr[j] = arr[j-1];
			}
			arr[j] = temp ;
		}
	}
}
