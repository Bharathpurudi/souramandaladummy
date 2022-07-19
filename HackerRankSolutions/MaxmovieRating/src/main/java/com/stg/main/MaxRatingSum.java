package com.stg.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaxRatingSum {
	public static long maximumSum(List<Integer> arr) {
		int size = arr.size();
		long max_so_far = Integer.MIN_VALUE, max_ending_here=0;
		for(int i=0; i< size; i++){
			max_ending_here = max_ending_here + arr.get(i);
			if(max_so_far < max_ending_here){
				max_so_far = max_ending_here;
			}
			if(max_ending_here < 0){
				max_ending_here = 0;	
			}
		}
		return max_so_far;
	}

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the no of elements in the array");
		int no_of_elements=scanner.nextInt();
		List<Integer> arr=new ArrayList<Integer>();
		System.out.println("Enter the elements");
		for (int i = 0; i < no_of_elements; i++) {
			int eachElement=scanner.nextInt();
			arr.add(eachElement);
		}
		long Result=maximumSum(arr);
		System.out.println(Result);
		scanner.close();
		
	}

}
