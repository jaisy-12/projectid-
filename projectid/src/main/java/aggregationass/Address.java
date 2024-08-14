package aggregationass;

public class Address {
	
	Student agr;
	String address;
	String name;
	public Address(Student agr,String address) {
	this.agr =agr;
	this.address=address;
	this.name=name;
	}
	public void display() {
	System.out.println(agr.roll);
	System.out.println(address);
	System.out.println(agr.name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student agr=new Student(10,"jaisy");
		Address ag=new Address(agr,"justinvilla");
          ag.display();
		

	}

}
