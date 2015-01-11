/**
 * Name: Tom Peacock
 * Date: 7 Apr 2013
 * Lab8 Program4
 * Description: Create a sorter that examines all adjacent elements of an array.  
 * 		If the adjacent elements are out of order swap them.
 * 		Continue running the sorter until the array is sorted
 */
public class BasicArraySorter 
{

	public static void main(String[] args) 
	{
		int[] testArray = {4, 2, 7, 1, 5};
		int[] sortArray = new int[2];
		int testCount;
		
		//Print out the initial testArray
		System.out.println("The initial array is:");
		for(int i = 0; i < testArray.length; i++)
		{
			System.out.print(testArray[i] +" ");
		}
		System.out.println();	
		
		//sort testArray
		do
		{
			testCount = 0;
			for(int i = 0; i < testArray.length - 1; i++)
			{
				if(testArray[i] > testArray[i + 1])
					testCount++;
			}
			
			for(int i = 0; i < testArray.length - 1; i++)
			{
				if(testArray[i] > testArray[i + 1])
				{
					sortArray[0] = testArray[i + 1];
					sortArray[1] = testArray[i];
					
					testArray[i] = sortArray[0];
					testArray[i + 1] = sortArray[1];
				}
			}	
		}while(testCount > 0);		
			
		//print sorted testArray
		System.out.println("The sorted array is:");
		for(int i = 0; i < testArray.length; i++)
		{
			System.out.print(testArray[i] +" ");
		}		
		
	}

}
