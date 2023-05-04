package assignment1;
import java.util.Scanner;

public class account {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		int acc;
		float amt;
		String nam;
		System.out.println("Enter enter a account Number: ");
		acc=in.nextInt();
		System.out.println("Enter enter a name: ");
		nam=in.next();
		System.out.println("Enter enter a amount: ");
		amt=in.nextFloat();

		new a(acc,amt,nam );
		
		in.close();
	}
}
class a{
	int accountnumber;
	String name;
	float amount,intrest,irate=8;

	 a(int a1, float b1, String c1) {
		this.accountnumber=a1;
		this.amount=b1;
		this.name=c1;
		System.out.println("Hello "+name+", your account no is: "+accountnumber+", and your amount is : "+amount);
		intrest=amount*irate/100;
		System.out.println("The intrest rate is 8% and amount is "+intrest);
		amount=amount+intrest;
		System.out.println("The final amount is: "+amount);
	}
	
}
