
package com.Nerchuko.Array;

public class AlphabetPattern {

	// alphabet letters ASCHII chart
	public void alphabet() {

		for (int i = 65; i <= 90; i++) {

			for (int j = 1; j <= 5; j++) {

				char i1 = (char) i;
				System.out.print(i1+"\t");
			}

			System.out.println(" ");
		}




	}


	public void patter4() {


	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AlphabetPattern alph = new AlphabetPattern();
		alph.alphabet();

	}

}
