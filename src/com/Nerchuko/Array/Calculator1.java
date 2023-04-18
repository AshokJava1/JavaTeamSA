package com.Nerchuko.Array;

public class Calculator1 {

	public void Addition(int a, int b, int c) {

		int x = a + b + c;
		System.out.println("Add " + x);

	}

	public void subtraction(int a, int b, int c) {
		int sub = a - b - c;

		System.out.println("sub "+sub);

	}

	public void Multiply(int a ,int b,int c) {

		 int mul=a*b*c;
		 System.out.println("mul "+mul);

	}

	public void divison(int a ,int b) {

		int div=a/b;
		System.out.println("divison "+div);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator1 c = new Calculator1();
		c.Addition(10, 10, 0);

		c.subtraction(100,20,50);
		c.Multiply(100,2,1);
		c.divison(100,25);

	}

}
