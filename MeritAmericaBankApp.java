package com.meritamerica.assignment5;

public class MeritAmericaBankApp
{
	public static void main(String[] args){
		MeritBank.readFromFile("src/test/testMeritBank_good.txt");
		MeritBank.writeToFile("src/test/writeTest");
	}
}