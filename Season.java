import java.util.*;
public class Season
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter month : ");
		int Month = sc.nextInt();
		if(Month == 1 || Month == 2 || Month == 12)
		{
			System.out.println("Season is Winter");
		}
		else if(Month == 3 || Month == 4 || Month == 5)
		{
			System.out.println("Season is Spring");
		}
		else if(Month == 6 || Month == 7 || Month == 8)
		{
			System.out.println("Season is Summer");
		}
		else if(Month == 9 || Month == 10 || Month == 11)
		{
			System.out.println("Season is Autumn");
		}
		else
		{
			System.out.println("Bogus Month");
		}
	}
}
