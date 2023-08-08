package challenges.java;

public class SquarerootNumber {
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=72;
		double x;
		double y=num/2;
		
		for(int i=0;i<y;i++) {
			x=y;
			y = (x+(num/x))/2;
		}
		System.out.println(y);
	}

}
