import java.util.*;

class Shirt{
	int sleeve;
	int collar;
	String material = "cotton";
	Shirt(int sleeve, int collar){
		this.sleeve = sleeve;
		this.collar = collar;
	}
	
	
}

public class TestShirt{

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter collar size: ");
		int col = sc.nextInt();
		
		System.out.println("enter sleeve length: ");
		int sl = sc.nextInt();
		
		Shirt s1 = new Shirt(sl,col);
		
		System.out.println("enter collar size: ");
		col = sc.nextInt();
		
		System.out.println("enter sleeve length: ");
		sl = sc.nextInt();
		
		Shirt s2 = new Shirt(sl,col);
		
		System.out.println("enter collar size: ");
		col = sc.nextInt();
		
		System.out.println("enter sleeve length: ");
		sl = sc.nextInt();
		
		Shirt s3 = new Shirt(sl,col);
		
		int temp1 = s1.collar;
		int temp2 = s1.sleeve;
		
		System.out.println("collar: "+temp1+" sleeve: "+temp2+" material: "+s1.material);
		
		temp1 = s2.collar;
		temp2 = s2.sleeve;
		
		System.out.println("collar: "+temp1+" sleeve: "+temp2+" material: "+s2.material);
		
		temp1 = s3.collar;
		temp2 = s3.sleeve;
		
		System.out.println("collar: "+temp1+" sleeve: "+temp2+" material: "+s3.material);
	}
}
