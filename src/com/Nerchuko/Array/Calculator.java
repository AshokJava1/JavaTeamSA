package com.Nerchuko.Array;

import java.util.Scanner;

public class Calculator {

	public void Addition() {


		int a []=new int [20];
		      Scanner add=new Scanner(System.in);
		    System.out.println("Enter number's");
		    for(int i=0;i<=a.length;i++) {

		    	a[i]=add.nextInt();

		    }










	}

	public void subtraction() {

	}

	public void Multiply() {

	}

	public void divison() {

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c = new Calculator();

		Scanner cal = new Scanner(System.in);
		System.out.println(" Enter below Action Anyone You want to do  ");
		System.out.println("1:Addition");
		System.out.println("2:subtraction");
		System.out.println("3:Multiplication");
		System.out.println("4:Divison");

		int a = cal.nextInt();
		switch (a) {

		case 1:

			break;

		case 2:

			break;

		case 3:
			break;

		case 4:
			break;

		}

	}

}
