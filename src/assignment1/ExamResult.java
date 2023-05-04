package assignment1;
import java.util.Scanner;

public class ExamResult {
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		int num1=0;
		int num2=0;
		int num3=0;
		int num4=0;
		int num5=0;
			System.out.println("You are welcome in percentage calculator!!!");
			System.out.println("Enter enter a Number of Java: ");
			num1=in.nextInt();
			System.out.println("Enter enter a Number of C: ");
			num2=in.nextInt();
			System.out.println("Enter enter a Number of Math: ");
			num3=in.nextInt();
			System.out.println("Enter enter a Number of DSA: ");
			num4=in.nextInt();
			System.out.println("Enter enter a Number of DBMS: ");
			num5=in.nextInt();
			if(num1>=45&&num2>=45&&num3>=45&&num4>=45&&num5>=45) {
				int res=num1+num2+num3+num4+num5;
				float total,percentage;
				total=res;
				percentage=(total/500)*100;
				System.out.println("Congrats!!! You are pass and The percentage you got is : "+percentage);
			}
			else
				System.out.println("Sorry, You are fail. ");
			in.close();
			}}