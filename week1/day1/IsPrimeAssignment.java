package week1.day1;

public class IsPrimeAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =19,count=0;
		for(int i =2;i<num-1;i++) {
			if(num%i==0) {
				count++;
			}
		}
		if(count==0) {
		System.out.println(num+" is prime number");
		}else {
			System.out.println(num+" is not a prime number");
		}
			
		
		
		
		
	}
}