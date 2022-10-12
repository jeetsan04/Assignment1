package assingment.week2;

import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int marks[]= {78,12,89,55,35};
		
		System.out.println("Total Element in this Array: "+marks.length);
		
		for (int i = 0; i < marks.length; i++) {
			
			if (marks[i]>80) {
				System.out.println("Marks is: "+marks[i]);
			}
			
		}
	}
}
