import java.util.*;
public class Rev{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String str = sc.nextLine();
		char[] arr = str.toCharArray();
		int n = str.length();
		int i, j;
		j = n-1;
		for(i = 0; i < n/2; i++){
			char temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			j--;
		}
		
		System.out.println(String.copyValueOf(arr));
	}
}

