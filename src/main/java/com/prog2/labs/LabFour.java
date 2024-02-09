package com.prog2.labs;

import java.util.Arrays;

/**
 * @author adinashby
 *
 */

public class LabFour {
	
	/**
	 * Write your test code below in the main (optional).
	 *
	 */
	public static void main(String[] args) {
		
	}
	
	/**
	 * Please refer to the README file for question(s) description
	 */
	
   public static int containerWithMostWater(int[] height) {

        int i = 0;
        int j = height.length - 1;
        int ans = 0;
        while(i < j){   
            int temp = Math.min(height[i], height[j]) * (j - i) ;
             ans = Math.max(ans, temp);

             if(height[i] < height[j]){ 
                i++;
             }
             else{  
                j--;
             }
        }
       
        return ans;
    }
    
    public static int threeSumClosest(int[] nums, int target) {

        int ans = 0;
        int temp = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length -2; i++){
                int j = i + 1;
                int k = nums.length -1;
                while(j < k){   
                    int sum = nums[i] + nums[j] + nums[k];
                    if(Math.abs(sum-target) < temp ){   
                        ans = sum;
                        temp = Math.abs(sum-target);
                    }
                    if(sum > target){   
                        k--;
                    }
                    else{   
                        j++;
                    }
                }
        }

        return ans;
    }
}
