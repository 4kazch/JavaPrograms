import java.util.*;

class Employee{
	String name;
	int age;
	String gender;
	int salary;
	String desg;
	String address;
	
	Employee(String name, int age, String gender, int salary, String desg, String address){
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.salary = salary;
		this.desg = desg;
		this.address = address;
	}
	
	
}

public class TestEmployee{
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of employees: ");
		int n = sc.nextInt();
		
		
		Employee ep[] = new Employee[n];
		
		for(int i=0;i<n;i++){
			System.out.println("enter name of employee "+i+": ");
			String name1 = sc.nextLine();
			
			
			System.out.println("enter age of employee "+i+": ");
			int age1 = sc.nextInt();
			
			System.out.println("enter gender of employee "+i+": ");
			String gender1 = sc.nextLine();
			
			System.out.println("enter salary of employee "+i+": ");
			int salary1 = sc.nextInt();
			
			System.out.println("enter designation of employee "+i+": ");
			String desg1 = sc.nextLine();
			
			System.out.println("enter adderss of employee "+i+": ");
			String address1 = sc.nextLine();
			
			Employee e = new Employee(name1, age1, gender1, salary1, desg1, address1);
			ep[i] = e;
		}
		System.out.println("enter id: ");
		int id = sc.nextInt();
		
		System.out.println("name: "+ ep[id].name);
		int temp = ep[id].age;
		System.out.println("age: "+ temp);
		System.out.println("gender: "+ ep[id].gender);
		temp = ep[id].salary;
		System.out.println("name: "+ temp);
		System.out.println("designation: "+ ep[id].desg);
		System.out.println("adderss: "+ ep[id].address);
		
		
	} 
}
