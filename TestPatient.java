import java.util.*;

class Patient{
	int id;
	int age;
	int data;
	
	Patient(){
		id =0;
		age =0;
		data = 0;
	}
	Patient(int id,int age, int data){
		this.id = id;
		this.age=age;
		this.data = data;
	}
	
	int getId(){
		return id;
	}
	int getAge(){
		return age;
	}
	int getData(){
		return data;
	}
	
}

public class TestPatient{
	public static void main(String args[]){
		System.out.println("enter id: ");
		Scanner sc =  new Scanner(System.in);
		int id = sc.nextInt();
		
		System.out.println("enter age: ");
		int age = sc.nextInt();
		
		System.out.println("enter Blood data: ");
		int data = sc.nextInt();
		
		Patient p1 = new Patient(id,age,data);
		
		System.out.println("id: "+ p1.getId());
		System.out.println("age: "+ p1.getAge());
		System.out.println("data: "+ p1.getData());
		
		
	}

}
