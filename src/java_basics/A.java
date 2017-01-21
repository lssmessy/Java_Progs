package java_basics;

/**
 * Description of this class
 * 
 * @author PRITESH
 * @version 1.0
 */
public class A {

	// instance variables
	private int x = 8, b, y;

	/**
	 * Constructor for the objects of A class
	 * 
	 */
	public A() {
		// Initializing instance variable
		x = 7;
	}

	/**
	 * Parameterized constructor for the objects of A class
	 * 
	 * @param c
	 *            - A sample parameter for this constructor
	 * 
	 */
	public A(int c) {
		// System.out.print(b);
		b = 8;
	}

	/**
	 * A sample method that returns integer result
	 * 
	 * @param y
	 *            - A sample variable that holds the result for this method
	 * @return this method returns integer result
	 */

	public int viewThis() {
		y = x * x;
		return y;
	} 
	
	

	public static void main(String args[]) {
		A a = new A(4);
		int c = a.viewThis();
		System.out.print("" + c);
	}
}