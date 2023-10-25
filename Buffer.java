import java.util.*;
public class Buffer{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String string = sc.nextLine(); 
		StringBuffer str = new StringBuffer(string);
		System.out.println("Enter a to append \nEnter r to replace \nEnter i to insert");
		char inp = sc.next().charAt(0);
		System.out.println(inp+"z");
		 
		if(inp == 'a'){
			System.out.print("Enter the string to append: ");
			String temp = sc.nextLine();
			str.append(temp);
			System.out.println(str);
		}
		else if(inp == 'r'){
			System.out.println("Enter the starting index: ");
			int start = sc.nextInt();
			System.out.println("Enter the ending index: ");
			int end = sc.nextInt();
			System.out.println("Enter the string: ");
			String temp = sc.nextLine();
			str.replace(start,end,temp);
		}
		else if(inp =='i'){
			System.out.println("Enter the index: ");
			int ind = sc.nextInt();
			System.out.println("Enter the string: ");
			int temp = sc.nextInt();
			str.insert(ind,temp);
		}
		

	}
}
