package assignment1;
import java.util.Scanner;
public class calculator {
		public static void main(String[] args) {
			Scanner in= new Scanner(System.in);
			int num1=0;
			int num2=0;
			
				for(int i=0;i<=1;i--) {
				
					System.out.println("Enter  1 for addition, 2 for subtraction, 3 for multiplaction and 4 for division:");
					int op=in.nextInt();
				
						if(op==1) {
							System.out.println("Enter enter a Frist Number: ");
							num1=in.nextInt();
						
							System.out.println("Enter enter a Second Number: ");
							num2=in.nextInt();
							int res=num1+num2;
							System.out.println(num1+" + "+num2+" is: "+res);
						}
						else if(op==2) {
							System.out.println("Enter enter a Frist Number: ");
							num1=in.nextInt();
							
							System.out.println("Enter enter a Second Number: ");
							num2=in.nextInt();
							int res=num1-num2;
							System.out.println(num1+" - "+num2+" is: "+res);
						}
						else if(op==3) {
							System.out.println("Enter enter a Frist Number: ");
							num1=in.nextInt();
							
							System.out.println("Enter enter a Second Number: ");
							num2=in.nextInt();
							int res=num1*num2;
							System.out.println(num1+" * "+num2+" is: "+res);
						}
						else if(op==4) {
							System.out.println("Enter enter a Frist Number: ");
							num1=in.nextInt();
							
							System.out.println("Enter enter a Second Number: ");
							num2=in.nextInt();
							float a=num1;
							float b=num2;
							float res=a/b;
							System.out.println(num1+" / "+num2+" is: "+res);
						}
						else {
							System.out.println("The value is error ");
						}
					
						System.out.println("Enter enter a more than 2 for exit, else enter 0 ");
						i=in.nextInt();
					}
					in.close();
				}
	
	
}
