//Genna Barge- Programming Assignment #1- Reorganizing Arrays
public class U1L08ProgrammingChallenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//define an original array 
		int [] numbers = {1, 2, 3, 4, 5, 6}; 	
		int length = numbers.length;
		int indexspots = length - 1;
		int times = length/2;
		
		//find the length of that list and set that equal to a value 
		
		//define an another array outside of the loop 
		
		//enter a for loop in which each element of the original array is accessed and then added to a new array
		for (int i = 0; i < times; i++) {
			int tempVar = numbers[indexspots-i];
			numbers[indexspots-i] = numbers[i]; 
			numbers[i] = tempVar;
			
			}
		
		for (int i =0; i < numbers.length; i ++) {
			System.out.print(numbers[i]);
		}
		
		

	}

}
