package OOPSPracticePackage;

import java.util.Scanner;

public class Palindrome {
	
	Scanner sc=new Scanner(System.in);
	
	public void checkPalindromeNumber()
	{
		/*
		 e.g.424 reverse 424
		*/
		
		System.out.println("\n\t Enter number for palindrome checking");
		int palindromeNumber=sc.nextInt();
		System.out.println(palindromeNumber);
		int hundrenthPlaceValue=(palindromeNumber)/100;
		int decimalPlaceValue=(palindromeNumber)%100;
		int firstPlaceValue= decimalPlaceValue%10;
	
		if(hundrenthPlaceValue==firstPlaceValue)
		{
			System.out.println("\n\t Entered number is palindrome number");
		}
		else
		{
			System.out.println("\n\t Entered number is not palindrome number");
		}
	}

}
