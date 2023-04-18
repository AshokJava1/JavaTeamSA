package com.Nerchuko.Array;

public class StartPatterns {


	//start pattern 1 to 10
	public void startP1() {


		     for(int i=0;i<=10;i++) {


		    	 for(int j=0; j<=i;j++ ) {
		    		 System.out.print("*");
		    	 }
		    	 System.out.println();
		     }

	}

	 public void startp2() {



	 }

	public static void main(String[] args) {
		StartPatterns v=new StartPatterns();
		v.startP1();

	}

}
