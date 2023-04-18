package com.Nerchuko.patterns;

public class Triangle_Star_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i <= 10; i++) {

			for (int j = 10 - i; j >= 0; j--) {

				System.out.print(" ");

			}
			System.out.println("*");
		}

	}
}