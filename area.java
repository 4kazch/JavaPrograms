import java.util.*;

class Area{
	void area(int l,int b){
		int a = l*b;
		System.out.println(a);
	}
	
	void area(int s){
		int a = s*s;
		System.out.println(a);
	}
	void area(double r){
		double a = 3.14*r*r;
		System.out.println(a);
	}
	
	
}

public class area{
	public static void main(String args[]){
		System.out.println("enter shape: ");
		Scanner sc = new Scanner(System.in);
		
		String x = sc.nextLine();
		Area sh = new Area();
		
		switch(x){
			case "circle":
				System.out.println("enter radius ");
				double n = sc.nextDouble();
				sh.area(n);
				break;
			case "rectangle":
				System.out.println("enter l and b ");
				int l= sc.nextInt();
				int b = sc.nextInt();
				sh.area(l,b);
				break;
			case "square":
				System.out.println("enter side ");
				int s= sc.nextInt();
				sh.area(s);
				break;
		}
	}
}
