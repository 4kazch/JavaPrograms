import java.util.*;
public class Sort{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int i,j;
		System.out.print("Enter the no of strings : ");
		int m = sc.nextInt();
		sc.nextLine();
		String[] strings = new String[m]; 
		
		for(i=0; i<m; i++){
			System.out.print("Enter a string : ");
			strings[i] = sc.nextLine();
		}
	
		for(i=0; i<m; i++){
			for(j=i+1; j<m; j++){
				if(strings[i].compareTo(strings[j])>0){
					String temp = strings[i];
					strings[i] = strings[j];
					strings[j] = temp;
				}
			}
		}
		
		for(i=0; i<m; i++){
			System.out.print(strings[i] + "\t");
		}
	}
}

