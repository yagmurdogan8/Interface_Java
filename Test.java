
public class Test {

	// Do not change anything in this class
	public static void main(String[] args) {
		
		Number n1 = new Number(3);
		Number n2 = new Number(5);
		
		RationalNumber r1 = new RationalNumber(n1, n2);
		
		System.out.println(r1.getValue());
		
		Classifier.doIt(r1);

	}

}
