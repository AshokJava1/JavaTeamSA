package com.Nerchuko.patterns;

public class SanglassPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j, k;

		for (i = 0; i <= 10; i++) {

			for (j = 0; j < i; j++) {

				System.out.print(" ");
			}

			for (k = 10 - i; k >= 0; k--) {

				System.out.print(" *");

			}
			System.out.println("");


		}


		for (int l = 0; l <= 10; l++) {

			 for(int n=9-l;n>=0;n--) {

				 System.out.print(" ");

			 }

			    for(int o=0;o<=l;o++) {
			    	System.out.print(" *");
			    }
		System.out.println();



		}}
 }
