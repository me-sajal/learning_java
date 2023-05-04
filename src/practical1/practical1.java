package practical1;

public class practical1 {
	public static void main(String[] args) {
		System.out.println("hello world");
		int occ=0;
		int ecc=0;
	for (int i=1; i<=100; i++) {
		System.out.println(i);
		if(i%2==0)
		{
			System.out.println(i+"is an even number");
		ecc++;
		}
		else {
			System.out.println(i+"is an odd number");
		occ++;
		}
	}
	System.out.println("there are"+ecc + " even numbers");	
	System.out.println("there are"+occ + " odd numbers");
	}
}
