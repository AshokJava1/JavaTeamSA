package com.Nerchuko.Array;

public class Patterns {

	// 10 rows and 10 columns
	public void patter1() {

		for (int i = 0; i <= 10; i++) {

			for (int j = 0; j <= 10; j++) {

				System.out.print("*"+"\t");
			}
			System.out.println();
		}

	}

	// Pattern 1 with nunbers

	public void pattern2() {

		for (int i = 1; i <= 10; i++) {

			for (int j = 1; j <= 10; j++) {

					System.out.print(i+"\t");  //with space
				//System.out.print(" "+i);       //with out space
			}
			System.out.println(" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println();
		Patterns p1 = new Patterns();
		p1.patter1();
		p1.pattern2();

	}

}
