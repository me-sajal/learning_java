package practical1;
import java.util.Scanner;
public class assignment {
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		System.out.println("Enter  your name:");
		String name=in.nextLine();
		System.out.println("Enter  your subject name:");
		String subject=in.nextLine();
		
		System.out.println("Enter  your roll no:");
		int roll=in.nextInt();
		System.out.println("Enter  your registration no:");
		int reg=in.nextInt();
		
		System.out.println("hi "+ name + " your roll is : " + roll+ ", and your regitration no is : "+reg+" your subject is: "+ subject);
	in.close();
	}

}
