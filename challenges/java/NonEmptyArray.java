package challenges.java;

import java.util.Arrays;

public class NonEmptyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {4,1,2,1,2,5};
		int length = nums.length;
		
		for(int i=0;i<length;i++) {
			int j=0;
			for(j=0;j<length;j++) {
				if(i!=j&&nums[i]==nums[j]) {
					break;
					}
			}
				if(j==length) {
						System.out.println("non-repeating element is "+nums[i]);
					}
			
		}
	}

}
