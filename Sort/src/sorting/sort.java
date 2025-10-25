package sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class sort {

	public static void main(String[] args) {
     int[] data = {3, 4, 5, 7, 8 , 5, 6 , 4 };
     Selection_sort(data);
     System.out.println(Arrays.toString(data));
     // Selection Sort
     
     int[] data2 = {9, 2, 5, 7, 8 , 5, 6 , 4 };
     Selection_sort(data2);
     System.out.println("Insertion Sort Test Case: "+Arrays.toString(data2));
     
     int[] data3 = {4, 6, 5, 3, 1 , 2, 8 , 9 };
     Selection_sort(data3);
     System.out.println("Insertion Sort Test Case: "+Arrays.toString(data3));
	}
	public static void Intersection_sort(int[] data) {
		int currentValue;
		int j;
		for(int i =1; i < data.length; i++) {
			currentValue=data[i];
			
			j= i-1;
		while(j >=0 && data[j] > currentValue) {
			data[j+1]=data[j];
			j--;
		}
		data[j+1]= currentValue;
			
		}
	}
	public static void Selection_sort(int[]data) {
		for(int i=0; i<data.length-1;i++) {
			int min=i;
			for(int j=i+1;j<data.length;j++) {
				if(data[j]<data[min]) {
					min=j;
				}
			}
			int temp = data[min];
			data[min] = data[i];
			data[i]=temp;
		}
	
	}
	public static void Buble_sort(int[]data) {
		int temp;
		  for (int i = 0; i < data.length - 1; i++) {
		        for (int j = 0; j < data.length - 1 - i; j++) {
		            if (data[j] > data[j + 1]) {  
		                temp = data[j];
		                data[j] = data[j + 1];
		                data[j + 1] = temp;
		            }
		        }
		    }
	}
	
	

}
