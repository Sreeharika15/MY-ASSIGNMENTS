package week1.day2;

import java.util.Arrays;

public class DuplicateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[] nums = {2,5,7,7,5,9,2,3,9};
			int length = nums.length;
			Arrays.sort(nums);
			
			for(int i=0;i<length;i++) {
				for(int j=i+1;j<length;j++) {
					if(nums[i]==nums[j]) {
						System.out.println(nums[j]);
					}
				}
			}
	}

}
