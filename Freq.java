import java.util.*;
public class Freq{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String str = sc.nextLine();
		char[] arr = str.toCharArray();
		int n = str.length();
		int[] freq = new int[n];
		int i, j;
		
		for(i = 0; i < n; i++){
			freq[i] =  1;
			for(j = i+1; j < n; j++){
				if(arr[i] == arr[j]){
					freq[i]++;
					arr[j] = '0';
				}
			}
		}
		
		for(i=0; i<n; i++){
			if(arr[i]!='0'){
				System.out.println(arr[i] + " : " + freq[i]);
			}
		}
	}
}
