package Week1;

import java.util.Arrays;

public class GCD {
	
	public static void main(String [] args) {
		
		/*
		 * 2) Create a function that takes an array of numbers and returns 
		 * the greatest common factor of those numbers. 
		
		Examples 
		gcd({84, 70, 42, 56}) --> 14 
		
		gcd({19, 38, 76, 133}) --> 19 
		
		gcd({120, 300, 95, 425, 625}) --> 5 
		Notes 
		The GCD is the largest factor that divides all numbers in the array. 

		 */
		int arr[]={84, 70, 42, 56};
		
		
		for(int i=0;i<arr.length;i++) {
			int array[]= {80};
			
			for(int j=1; j<1000;j++){
				if(arr[i]%j == 0 ) {
					
				array[j]=j;
//				if(arr[0]==array[j] && arr[1]==array[j] && arr[2]==array[j] && arr[3]==array[j]) {
//					System.out.println(array[j]+"YEEEEEEEEEEEEEEEEEEBOIIIIIII");
//				}
				Arrays.sort(array);
				System.out.println(array[j]);
			}
			
			}
			
		}

	}

}
