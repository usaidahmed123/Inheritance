package inheritance;


public class overloading {
	
	
	void addition(int a, int b, int c) {//m1
		System.out.println("Result: "+ (a+b));
	}
	void addition(int a, int b, double c) {//m2
		System.out.println("Result:"+ (a+b+c));
	}
	void addition(int a, int b, int c,int d) {//m3
		System.out.println("Result: "+ (a+b+c+d));
	}
	void addition(int a, int b, int c, int d, int e) {//m4
		System.out.println("Result: "+ (a+b+c+d+e));
	}
	void addition(int a, int b) {//m5
		System.out.println("Result: "+ (a+b));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		overloading poly =new overloading();
		poly.addition(4, 5);//m5
		poly.addition(1, 5, 5,9,5);//m4
		poly.addition(2, 3,5,6);//m3
		poly.addition(4, 2, 4.5);
	}

}
