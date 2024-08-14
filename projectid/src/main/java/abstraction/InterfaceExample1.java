package abstraction;

public class InterfaceExample1 implements  InterfaceExample{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceExample1 ob=new InterfaceExample1 ();
		ob.display();
//interface name in =new className();//
		InterfaceExample oc=new InterfaceExample1();
		oc.display();
		
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		int c=a+b;
		System.out.println(c);
		
	}

}
