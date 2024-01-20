package com.transaction;
import java.util.Scanner;

public class payMoney {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the size of transaction Arrray: ");
	int noOfDays = scanner.nextInt();
	int rev[] = new int[noOfDays];
	System.out.println("Enter Array Values");
	for(int i=0;i<rev.length;i++) {
		rev[i]=scanner.nextInt();
	}
	System.out.println("Enter number of Targets to be achieved");
	int totalTargets=scanner.nextInt();
	int sum;
	int notAch;
	for(int i=1;i<=totalTargets;i++) {
		sum=0;
		notAch=0;
		System.out.println("Enter Target Value");
		int target=scanner.nextInt(); 
		for(int j = 0;j<rev.length;j++) {
			sum+=rev[j];
			if(sum>=target) {
				System.out.println("Target achieved on Day" +(j+1));
				notAch = 1;
				break;  
			}
		}if(notAch == 0)
			System.out.println("Target not Achieved" );
	}
}
}
