package practical5;


	class Test{
		void checkage() throws ArithmeticException {
			throw new ArithmeticException();
			
		}
	}
	public class lab2 {
	public static void main(String[] args) {
		Test t1= new Test();
		 try{
			 t1.checkage();
		 }
		 catch(Exception e) {
			 System.out.println("inside catch");
		 }
		 try {
		 Thread.sleep(200);
		 }
		 catch(Exception e){
		 System.out.println("outside catch");
		 }
	}

}
