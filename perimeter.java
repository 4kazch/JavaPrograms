import java.util.*;
 class Abc{
 	int length;
 	int bredth;
 	Abc(int l, int b){
 		this.length = l;
 		this.bredth = b;
 	}
 	int peri(){
 		int p = 2*(length+bredth);
 		return p;
 	}
 }
 
 public class perimeter{
 	public static void main(String args[]){
 		Scanner sc = new Scanner(System.in);
 		System.out.println("enetr length and breadth");
 		int l = sc.nextInt();
 		int b = sc.nextInt();
 		Abc rect1 = new Abc(l,b);
 		int p1 = rect1.peri();
 		System.out.println(p1);
 		
 		System.out.println("enetr length and breadth");
 		l = sc.nextInt();
 		b = sc.nextInt();
 		Abc rect2 = new Abc(l,b);
 		p1 = rect2.peri();
 		System.out.println(p1);
 		
 	}
 }
