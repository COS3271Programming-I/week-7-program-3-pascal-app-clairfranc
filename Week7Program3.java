package week7;

import java.util.Scanner;

//Claire Francis, Week7Program3, October 17, 2025

// Use a 2 dimensional array to store and then print the rows 0-10 of Pascal's triangle. 
// The triangle starts with a 1 in the first row.
// Then each subsequent entry MUST BE COMPUTED BY THE PROGRAM as the sum of the entry above it and the one above and to the left of it. 
// Rows 0-3 of Pascal's triangle are:

// 1

// 1   1

// 1   2   1

// 1   3   3   1

public class Week7Program3 {
	static Scanner userinput = new Scanner(System.in);

	public static void main(String[] args) {
		int rows = 11;
		int[][] ptriangle = new int[rows][rows];
		
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j <= i; j++) {
				if(j == 0 || j == i) {
					ptriangle[i][j] = 1;
				}
					else {
						ptriangle[i][j] = ptriangle[i - 1][j -1] + ptriangle[i - 1][j];

				}
			}
		}
		
		System.out.println("Pascal's Triangle:\n");
		for(int i = 0; i < rows; i++) {
			for(int space = rows - i; space > 1; space--) {
				System.out.print(" ");
			}
			
			for(int j = 0; j <= i; j++) {
				System.out.print(ptriangle[i][j] + " ");
			}
			System.out.println();
		}
		


	}

}
