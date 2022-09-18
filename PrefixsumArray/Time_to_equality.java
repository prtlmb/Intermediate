package PrefixsumArray;

public class Time_to_equality {
	
	/**
	 * Q1. Time to equality
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given an integer array A of size N. In one second, you can increase the value of one element by 1.

Find the minimum time in seconds to make all elements of the array equal.


Problem Constraints
1 <= N <= 1000000
1 <= A[i] <= 1000


Input Format
First argument is an integer array A.
	 */
	public class Solution {
	    public int solve(int[] A) {
	        int max=Integer.MIN_VALUE;
	        for(int i=0;i<A.length;i++){
	max=Math.max(max,A[i]);
	        }
	int c=0;
	         for(int i=0;i<A.length;i++){

	              c+=(max-A[i]);

	        }

	        return c;

	        
	    }
	}
}
