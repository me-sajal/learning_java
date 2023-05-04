package interfacedemo;
interface nrb{
	String Location="kathmadu";
	public void addBonous();
	public abstract void deductTax();
}
class global implements nrb{
	String name;
	int accno;
	float amt;
	
	global(String name,int accno,float amt){
		this.name=name;
		this.accno=accno;
		this.amt=amt;
	}

	public void addBonous() {
		System.out.println("amount before bonus is :"+ amt);
		amt=(float)(amt+(.06*amt));
		System.out.println("amount for bonus is :"+ amt);
		
	}


	public void deductTax() {
		float bonouss=(float)(.06*amt);
		float tax= bonouss-(.05f * bonouss);
		amt=amt-tax;
		System.out.println("tax amount is "+tax);
	}
	
}

public class interfacedemo {

	public static void main(String[] args) {
		global sajal=new global("ram", 1511540,2022.00f);
sajal.addBonous();
sajal.deductTax();

	}

}
