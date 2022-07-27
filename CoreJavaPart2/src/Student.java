

class MainStudent {
	int rollno=1;
	String name="Meghana";
	
	void display() {
		System.out.println("RollNo" +rollno);
	}
	
	int add(int a ,int b) {
		System.out.println("add" +(a+b)); 
		return a+b;
		 
		
	}
	String displayMsg() {
		
		System.out.println("Hello");
		return "Hello";
	}
	
}
public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				MainStudent s=new MainStudent();
				s.display();
				s.add(5,6);
				s.displayMsg();
	}

}
