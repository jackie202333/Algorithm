package com.search;
/**
 * 二分查找法
 * @author jackie202333
 *
 */
public class BinarySearch {
	public <T> int binarySearch(T arr[] , T target){
		int l = 0;
		int r = arr.length;
		while(l <= r){
			int middle = (l + r)/2;
			if(arr[middle] == target){
				return middle;
			}else if(target < arr[middle]){
				r = middle - 1;
			}else{
				l = middle + 1;
			}
		}
		return -1;
	}
}
