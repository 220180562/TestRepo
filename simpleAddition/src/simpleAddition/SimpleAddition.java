package simpleAddition;

public class SimpleAddition {
	
	int addValues (int x, int y, int z, int w) {
		System.out.println(x+y+z);
		return x+y+z;
		
	}
	
	public static void main(String[] args) {
		SimpleAddition instance1 = new SimpleAddition();
		int x = instance1.addValues(2,3,3,5);
	}

}
