package week1.day2;

public class Mobile {
		
		public void sendSms() {
			System.out.println("Oppo");
		}
		public long makeCall(long phoneNum) {
			return phoneNum;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile table = new Mobile();
		table.sendSms();
		long phno=table.makeCall(123456789);
		System.out.println(phno);
	}

}
