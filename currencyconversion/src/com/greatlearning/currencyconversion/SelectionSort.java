package com.greatlearning.currencyconversion;
import java.util.Scanner;
public class SelectionSort{
public static void selectionSort(int[]userArray){	
	for(int i=0;i<userArray.length - 1;i++) {
		int numLeft = userArray[i];
	for (int j = i+1;j<userArray.length;j++) {
		if(userArray[j]<userArray[i]) {
			int temp = userArray[j];
			if(temp < numLeft) {
			userArray[j] = numLeft;
			userArray[i] = temp;
			numLeft = temp;
			}else {
				break;
				}
		}
}
	}
}
public static void main(String[] args){
Scanner scanner =  new Scanner(System.in);
System.out.print("Enter the number of elements: ");
int n = scanner.nextInt();
int[] userArray = new int[n];
for(int i=0; i<n;i++) {
	System.out.println("Enter element: ");
	userArray[i] = scanner.nextInt();
}
System.out.println("unsorted array: ");
for(int num: userArray) {
	System.out.print(num + "  ");
}

selectionSort(userArray);

System.out.println("\nsorted array");
for(int num: userArray) {
	System.out.print(num + "  ");
	}
	}

}