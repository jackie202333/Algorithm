package com.sort;
/**
 * ��������
 * @author jackie202333
 *
 */
public class InsertSort {
	/**
	 * ʹ�÷��ͱ�֤���ڸ�������Ͷ����Բ���
	 * @param <T>
	 * @param arr
	 */
	public <T> void insertSort(T arr[]) {
		//Ѱ��Ԫ��arr[i]���ʵĲ���λ��
		for(int i = 1; i < arr.length; i++) {
			T temp = arr[i];
			//����tempԪ��λ��
			int j;
			for(j = i ; j > 0 && arr[j-1] > temp;j--) {
				/*
				 * һ�ν����������θ�ֵ��ʹ�ø�ֵ���ٲ���
				 */
				arr[j] = arr[j-1];
			}
			arr[j] = temp ;
		}
	}
}
