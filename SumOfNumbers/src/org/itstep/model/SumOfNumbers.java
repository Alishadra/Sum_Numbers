package org.itstep.model;

import java.util.ArrayList;
import java.util.List;

public class SumOfNumbers {

	public static void main(String[] args) {

		int myNumb = 123456;
		
		System.out.println(String.valueOf(getSumOfNumbersByChars(myNumb)));
		System.out.println(String.valueOf(getSumOfNumbersByDiv(myNumb)));
		
		
	}

	private static int getSumOfNumbersByDiv(int myNumb) {
		
		int sum = 0;
		
		for (; myNumb > 0 ; myNumb = myNumb/10) {
			sum += myNumb % 10;
			
		}
		
		
		
		return sum;
	}

	private static int getSumOfNumbersByChars(int myNumb) {
		
		String numbs = String.valueOf(myNumb);
		char[] numbers = numbs.toCharArray();
		
		int result=0;
		
		for(char number:numbers) {
			
				int newNumb = Character.getNumericValue(number);
				result += newNumb;
				
			}
			
		
		return result;
	}

}
