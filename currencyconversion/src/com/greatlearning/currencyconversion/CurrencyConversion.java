package com.greatlearning.currencyconversion;
import java.util.Arrays;
import java.util.Scanner;
public class CurrencyConversion {
	
	static int[] reverse(int a[], int n) 
    { 
        int[] b = new int[n]; 
        int j = n; 
        for (int i = 0; i < n; i++) { 
            b[j - 1] = a[i]; 
            j = j - 1; 
        } 
        
        return b;
  
    } 

	public static void main(String[] args) {
		System.out.println("Enter Size of currency denomination: ");
		Scanner availDenom = new Scanner(System.in);
		int n = availDenom.nextInt();
		
		int curSize[] = new int[n];
		System.out.println("Enter denomination value: ");
		for(int i = 0; i<curSize.length; i++) {
			curSize[i]=availDenom.nextInt();
		}
		System.out.println("Before Sorting "+Arrays.toString(curSize));
		SelectionSort is = new SelectionSort();
		SelectionSort.selectionSort(curSize);
		curSize = reverse(curSize, curSize.length);
		System.out.println("After Sorting: "+Arrays.toString(curSize));
		System.out.println("Enter the Amount you want to pay: ");
		int amt = availDenom.nextInt();
		 CC currencyCount=new CC();
		currencyCount.counting(curSize,amt);
	}
}

		 