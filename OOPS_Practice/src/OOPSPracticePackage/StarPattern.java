package OOPSPracticePackage;

public class StarPattern {

	public void leftAlignedStarPattern()
	{
		/*
		 ---------
		 * 
		 * *
		 * * *
		 * * * *
		 * * * * *
		 ------------
		 */
		
		System.out.println("\n\t Printing Left Aligned Star Pattern");
		
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void rightAlignedStarPattern()
	{
		/*
		 -----------
		 		*
		 	  * *
		 	* * *
		  * * * *
		* * * * * 
		 -----------
		 */

		System.out.println("\n\t Printing Right Aligned Star Pattern");
		
		for(int i=0;i<5;i++)
		{
			for(int j=5;j>i;j--)
			{
				System.out.print(" ");
			}
				for(int k=0;k<=i;k++)
				{
					System.out.print("*");
				}
				System.out.println();
		}
		
	}
	
	public void triangleStarPattern()
	{
		/*
		---------
		 * 
		* *
	   * * *
	  * * * *
	 * * * * *  
	 -------------  
	*/
		
   System.out.println("\n\t Printing Triangle Star Pattern");
		
		for(int i=0;i<5;i++)
		{
			for(int j=5;j>i;j--)
			{
				System.out.print(" ");
			}
				for(int k=0;k<=i;k++)
				{
					System.out.print(" *");
				}
				System.out.println();
		}
		
	}
}
