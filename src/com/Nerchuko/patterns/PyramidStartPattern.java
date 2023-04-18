package com.Nerchuko.patterns;

public class PyramidStartPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i < 6; i++) {

			for (int j =6-i; j > 0; j--) {
				System.out.print(" ");

			}


			for (int st = 0; st <= i; st++) {

				System.out.print(" *");
			}

			System.out.println();
		}

	}

}
