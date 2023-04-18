package com.Nerchuko.Call;

public class Calls {



	public void call(VoiceCall c) {

		System.out.println("Support voice call");

	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calls c=new Calls();
		c.call(new VoiceCall());



	}
}