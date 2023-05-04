package practical6;
import java.util.Scanner;
interface NRB{
	void intrest();
	void depositerDetails();
	void coustomersdetails();
}
class nabil implements NRB{
	Scanner in=new Scanner(System.in);
	String name;
	long accno;
	double blcamt;
	String bname;
	long cnum;
	String name_of_depositor;
	String deopsited_branch;
	nabil(String name, double blcamt, long accno, long cnum, String deopsited_branch){
		this.name= name;
		this.blcamt=blcamt;
		this.accno= accno;
		this.cnum=cnum;
		this.deopsited_branch=deopsited_branch;		
	}
	public void intrest(){
		double intrestamt;
		if (blcamt >= 100000) {
		intrestamt=blcamt*6/100;
		System.out.println("The Intrest amount is: "+intrestamt);
		blcamt=blcamt+intrestamt;
		System.out.println("The Total amount is: "+blcamt);
		}
		else {
			intrestamt=blcamt*4.5/100;
			System.out.println("The Intrest amount is: "+intrestamt);
			blcamt=blcamt+intrestamt;
			System.out.println("The Total amount is: "+blcamt);
		}
				}
	public void depositerDetails(){
		String newname;
		double newblcamt;
		System.out.println("Enter your name");
		newname=in.nextLine();
		System.out.println("Enter your depositing amount");
		newblcamt=in.nextDouble();
		System.out.println("The amount is deposited By: "+newname);
		blcamt=blcamt+newblcamt;
	}	
	public void coustomersdetails() {
		System.out.println("Name   : "+name);
		System.out.println("Accno  : "+accno);
		System.out.println("blcAmt : "+blcamt);
		System.out.println("C No   : "+cnum);
		System.out.println("bname  : "+deopsited_branch);	
	}
}
public class lab_1_account {
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		String name;
		double blcamt;
		long accno;
		long cnum;
		String deopsited_branch;
		System.out.println("Enter your name : ");
		name=in.nextLine();
		System.out.println("Enter your Innital Amount : ");
		blcamt=in.nextDouble();
		System.out.println("Enter the deposited branch name : ");
		deopsited_branch=in.nextLine();
		System.out.println("Enter your account number : ");
		accno=in.nextLong();
		System.out.println("Enter your Contact number : ");
		cnum=in.nextLong();
		nabil n1=new nabil(name,blcamt,accno,cnum,deopsited_branch);
		n1.intrest();
		n1.depositerDetails();
		n1.coustomersdetails();	
	in.close();
	}	
	
}