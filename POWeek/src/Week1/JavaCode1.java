package Week1;
import java.util.Arrays;

public class JavaCode1 {

	
/*
 * Java: 

1) Given an array of integers representing stock price on single day, 
find max profit that can be earned by 1 transaction. 
So you need to find pair (buyDay,sellDay) where buyDay < = sellDay and it should maximise the profit. 
For example : 

int arr[]={14, 12, 70, 15, 99, 65, 21, 90}; 
Max profit can be gain by buying at 1st day(0 based indexing) and sell at 4th day. 
Max profit = 99-12 =87 
 */
	public static void main(String [] args) {
		
		int arr[]={14, 12, 70, 15, 99, 65, 21, 90}; 
		
		Arrays.sort(arr);
		int max=0;
		for(int i=0;i<arr.length; i++) {
			max=Math.abs(arr[0]-arr[arr.length-1]);
		}
		System.out.println(max);
	}
	
}
