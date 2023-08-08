package week1.day2;

import java.util.Arrays;

public class LearnArary {
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] age= {23,32,12,24,11,10};
		int length2=age.length;//property =length
		int[] score =  {65,23,21,43,45,22};
		int length = score.length;
	/*	System.out.println(length);
		System.out.println(score[2]);
		System.out.println(score[length-1]);
		System.out.println(score);*/
		
		System.out.println("-------------------------");
		for(int i=0;i<=length-1;i++) {
			System.out.println(age[i]);
			Arrays.sort(age);
		}
		System.out.println("------------------------");
		for(int i=length-1;i>0;i--) {
			System.out.println(score[i]);

		}
	}

}
