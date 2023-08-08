package week1.day1;

public class FibonacciAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=0,num2=1,sum=0;
		System.out.println(num1+"\n"+num2);//prints 0 1  

		for(int i = 1;i<=11;i++) {
				sum=num1+num2;
				System.out.println(sum); //prints 0+1=1
				num1=num2;//num1=1;
				num2=sum;//num2=1 //iteration repeats

			}
	}

}
