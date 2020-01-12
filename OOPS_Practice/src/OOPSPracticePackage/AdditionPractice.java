package OOPSPracticePackage;

public class AdditionPractice {
	/*Write a function that takes list of numbers and target sum and returns true if the list contains-
	-two numbers that sum to target.
	Example
	numbers:[7,2,6,2]
	target:4
	output:-true
	
	numbers:[7,2,6,2]
	target:7
	output: false
	*/

	public boolean addTarget(long numbers[],int target)
	{
		System.out.println("Entered numbers are:");
		for(int i=0;i<numbers.length;i++)
		{
			System.out.print(numbers[i]);
		}
		
		System.out.println("\nEntered Target is"+target);
		if(numbers[0]+numbers[1]==target||numbers[0]+numbers[2]==target||numbers[0]+numbers[3]==target)
		{
			System.out.println("True");
			return true;
		}
		else if((numbers[1]+numbers[2]==target||numbers[1]+numbers[3]==target))
		{
			System.out.println("True");
			return true;
		}
		else if((numbers[2]+numbers[3]==target))
		{
			System.out.println("True");
			return true;
		}
		else
		{
			System.out.println("False");
			return false;
		}
	}
}
