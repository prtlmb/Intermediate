package PrefixsumArray;

import java.util.ArrayList;

public class Pick_from_both_sides {
	
	/**
	 * Problem Description
You are given an integer array A of size N.

You have to pick B elements in total. Some (possibly 0) elements from left end of array A and some (possibly 0) from the right end of array A to get the maximum sum.

Find and return this maximum possible sum.

NOTE: Suppose B = 4, and array A contains 10 elements, then

You can pick the first four elements or can pick the last four elements, or can pick 1 from front and 3 from the back, etc. You need to return the maximum possible sum of elements you can pick.


Problem Constraints
1 <= N <= 105

1 <= B <= N

-103 <= A[i] <= 103



Input Format
First argument is an integer array A.

Second argument is an integer B.



Output Format
Return an integer denoting the maximum possible sum of elements you picked.


	 */
	
	
	public class Solution {
	    public int solve(ArrayList<Integer> A, int B) {
	int maxSum=0;
	int sum=0;

	        for(int i=0;i<B;i++){
	sum+=A.get(i);

	        }
	        maxSum=sum;
	        
	        int k=B-1;
	        int j=A.size()-1;
	        while(k>=0 ){
	//System.out.println("j & j-val "+j+" & "+A.get(j));
	              sum=sum+A.get(j)-A.get(k);
	              
	maxSum=Math.max(sum,maxSum);
	k--;
	j--;
	        }

	        return maxSum;
	    }
	}


}
