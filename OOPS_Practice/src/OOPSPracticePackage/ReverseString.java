package OOPSPracticePackage;

import java.util.Scanner;

public class ReverseString {
	
	Scanner sc=new Scanner(System.in);
	
	public void reverseString()
	{
		System.out.println("Enter String For Reverse");
		String stringForReverse=sc.nextLine();
		System.out.println("Entered String is= "+stringForReverse);
	
		String[] splitString=stringForReverse.split(" ");
	
		/*for(String splitedString: splitString)
		{
			System.out.println(splitedString);
		}*/
		
		int StringLength=splitString.length;
		System.out.println("String Length Is"+StringLength);
		
		for(int i=StringLength-1;i<=StringLength;i--)
		{
				System.out.println(splitString[i]);
				
		}
		System.out.println(splitString[0]);
	}
}
