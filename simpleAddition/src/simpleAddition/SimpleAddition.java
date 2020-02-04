package simpleAddition;

public class SimpleAddition {
	
	int addValues (int x, int y) {
		System.out.println(x+y);
		return x+y;
		
	}
	
	public static void main(String[] args) {
		SimpleAddition instance1 = new SimpleAddition();
		int x = instance1.addValues(2,3);
	}

}
