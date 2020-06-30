package com.revature.tier1;

public class SumOverArray {

	public static int IterateAndSum(int[] arr) {
		if (arr == null)
			return 0;
		
		int total =0;
		
		for (int i =0; i <arr.length; i++)
			total += arr[i];
		
		return total;
	}
}
