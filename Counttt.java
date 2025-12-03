package Array;

import java.util.*;

public class Count {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number of elements: ");
		int n = scan.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++)
		{
			System.out.println("Enter the element"+(i+1));
			arr[i] = scan.nextInt();
		}
		
		int p = 0, neg = 0, z = 0;
		for(int i = 0; i < n; i++)
		{
			if( arr[i] > 0)
			{
				p++;
			}
			else if( arr[i] < 0)
			{
				neg++;
			}
			else
			{
				z++;
			}
			
		}
		
		System.out.println("Positive numbers count - "+p);
		System.out.println("Negative numbers count - "+neg);
		System.out.println("Zero numbers count - "+z);
		
	}

}
