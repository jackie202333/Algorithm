package com.sort;
/**
 * ∂—≈≈–Ú
 * @author jackie202333
 *
 */
public  class  MaxHeap<T> {
	private T data[];
	private int count;
	public MaxHeap(int capacity){
		data = new T[capacity];
		count = 0;
	}
	public int size(){
		return count;
	}
	public boolean isEmpty(){
		return count == 0;
	}
	public  void add(T t){
		data[count+1] = t;
		count ++;
		shiftUp(count);
	}
	public void shiftUp(int k){
		while(data[k/2] < data[k] && k > 1){
			swap(data[k/2] , data[k]);
			k=k/2;
		}
	}
	public T extractMax(){
		if(count > 0){
			T max = data[1];
			swap(data[1] , data[count]);
			count--;
			shiftDown(1);
			return max;
		}else{
			return null;
		}
	}
	public void shiftDown(int k){
		while(2 * k <= count){
			int j = 2 * k;
			if(j+1 <= count && data[j+1] > data[j]){
				j+=1;
			}
			if(data[k] >= data[j]){
				break;
			}
			swap(data[k] , data[j]);
			k=j;
			
		}
	}
	public <T> void heapSort(T arr[]){
		MaxHeap<T> maxHeap = new MaxHeap<T>(arr.length);
		for(int i =0 ; i < arr.length ;i++){
			maxHeap.add(arr[i]);
		}
		for(int i = n-1 ; i >= 0 ; i--){
			arr[i] = maxHeap.extractMax();
		}
	}
	public void swap(T value1 , T value2){
		T temp = value1;
		value1 = value2;
		value2 = temp;
	}
}
