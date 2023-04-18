package com.Nerchuko.Array;

public class Employees_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Employees_Numbers [] emp_numbers=new Employees_Numbers[5];



	     long  emp_numbers []=new long [5];
	       emp_numbers [0]=+27732298848l;
	       emp_numbers [1]=+27732298848l;
	       emp_numbers [2]=+27732298848l;
	       emp_numbers [3]=+27732298848l;
	       emp_numbers [4]=+27732298848l;
	    //   emp_numbers [5]=+27732298848l;  //runtime error Index out of bound Exception because Size is already fixed


	       for(long phone : emp_numbers ) {

	    	   System.out.println(phone);
	       }



	      String names [] []= { {"venky","mani","tharun"  },
	    		                {"sachin","dhoni","virat"}    };



	      System.out.println(names[0][1]);










	}

}
