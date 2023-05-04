package practical1;
import java.util.Scanner;
public class practical2 {
public static void main(String args[]) {
		Scanner in =new Scanner(System.in);
		System.out.println("enter a text");
		String name=in.nextLine();
		System.out.println(name);
		
		System.out.println("enter a number");
		double roll=in.nextDouble();
		System.out.println(roll);
		
		in.close();
		
}
}