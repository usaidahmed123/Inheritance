package inheritance;


public class overriding extends abc{//child
	
	int a=50;
	int b=50;
	int c;
	
	void sum() {
		c=a+b;
		System.out.println("Result: " + c);
	}
		void multiplication(int a, double b) {//parent
			System.out.println("overriding Result of Multiplication: " +(a*b));
			System.out.println("adding into parent class = Hello Child");
		}
		void display() {
			System.out.println("Hello CHild");
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		overriding over = new overriding();
		over.sum();
		over.multiplication(3, 2.5);
		abc par = new abc();
		par.display();
		over.display();
		//iufopd.multiplication(3, 4.0);// declare in class A which is parent class
	}

}

class abc{
	void multiplication(int a, double b) {//parent
		System.out.println("Parent Result of Multiplication: " +(a*b));
	}
	void display() {
		System.out.println("Hello PArent");
	}
	
}
