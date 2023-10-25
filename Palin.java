import java.util.*;
public class Palin{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String str = sc.nextLine();
		int n = str.length();
		int i, j, count = 0;
		j = n-1;
		for(i = 0; i < n/2; i++){
			if(str.charAt(i) != str.charAt(j)){
				count++;
			}
			j--;
		}
		
		if(count == 0){
			System.out.println("Pallindrome");
		}
		else{
			System.out.println("Not Pallindrome");
		}
	}
}

