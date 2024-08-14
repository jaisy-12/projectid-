package abstraction;

public class Abstract1 extends Abstract{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstract1 ab=new Abstract1();
		ab.add();
		ab.sub();
		ab.display();
		ab.print();
		

	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("Java is fun");
		
	}
	public void sub() {
		System.out.println("Haiii alll");
	}

}
