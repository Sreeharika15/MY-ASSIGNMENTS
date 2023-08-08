package week1.day2;

public class LearnMethods {
		
		public void windowShopping() {
			System.out.println("scanned through pdts");
		}
		public int orderFood(String foodItem,int count) {
			System.out.println(foodItem);
			return count;
		}
		public boolean orderMore() {
			return true;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LearnMethods table = new LearnMethods();
		table.windowShopping();
		int count = table.orderFood("dosa", 5);
		System.out.println(count);

	}

}
