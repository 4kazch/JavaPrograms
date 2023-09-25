import java.util.*;
public class hypo
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter side 1 : ");
		double Side1 = sc.nextDouble();
		System.out.print("Enter side 2 : ");
		double Side2 = sc.nextDouble();
		double Hypotenuse = Math.sqrt((Side1 * Side1) + (Side2 * Side2));
		System.out.println("Hypotenuse = " + Hypotenuse);
	}
}
