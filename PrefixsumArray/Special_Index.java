package PrefixsumArray;

import java.util.ArrayList;

public class Special_Index {
	/**
	 * 
	 * @author paritoshlambat
	 * Given an array, arr[] of size N, the task is to find the count of array indices such that removing an element from these indices makes the sum of even-indexed and odd-indexed array elements equal.



	Problem Constraints
	1 <= n <= 105
	-105 <= A[i] <= 105


	Input Format
	First argument contains an array A of integers of size N


	Output Format
	Return the count of array indices such that removing an element from these indices makes the sum of even-indexed and odd-indexed array elements equal.



	Example Input
	Input 1:
	A=[2, 1, 6, 4]
	Input 2:

	A=[1, 1, 1]

	 *
	 */
	public class Solution {
	    public int solve(ArrayList<Integer> A) {

	        int evenSum[]=new int[A.size()];
	        int oddSum[]=new int[A.size()];
	        evenSum[0]=A.get(0);
	        oddSum[0]=A.get(0);
	        //even sum
	        for(int i=1;i<A.size();i++){
	      
	if(i%2==1){
	evenSum[i]=evenSum[i-1];
	}else{

	evenSum[i]=A.get(i)+evenSum[i-1];
	}


	        }
	    //odd sum    
	oddSum[1]=A.get(1);
	 for(int i=2;i<A.size();i++){
	      
	if(i%2==0){
	oddSum[i]=oddSum[i-1];
	}else{

	oddSum[i]=A.get(i)+oddSum[i-1];
	}


	        }

	int c=0;
	for(int i=0;i<A.size();i++){

	if(i==0){
	if(evenSum[A.size()-1]==oddSum[A.size()-1]){

	c++;
	}

	}else{

	    int sum_evenmain=evenSum[i-1]+(oddSum[A.size()-1]-oddSum[i]);
	   int  sum_oddmain=oddSum[i-1]+(evenSum[A.size()-1]-evenSum[i]);
	   if(sum_evenmain==sum_oddmain){
	c++;

	   }


	}

	}
	        return c;

	    }
	}


}
