package com.sort;
/**
 * ѡ������ʹ�÷��ͱ�֤��������ζ��ɲ���
 * @author jackie202333
 *
 */
public class SelectionSort{
	public <T> void selectionSort(T arr[]){
		for(int i = 0 ; i < arr.length ; i++){
			int minIndex = i;
			for(int j = 0 ; j < arr.length ; j++){
				if(arr[j] < arr[minIndex]){
					T temp = arr[i];
					arr[i] = arr[minIndex];
					arr[minIndex] = temp;
				}
			}
		}
	}
}
