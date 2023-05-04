package practical5;

public class lab1 {
	public static void main(String args[]) {
		int numbers[] ={21,23,33,4,5,44};
		for(int i=0; i<numbers.length;i++) {
			System.out.println(numbers[i]);
			
		}
		
		try {
			System.out.println(numbers[2]);
			System.out.println(numbers[24]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e+"exception is occoured in 1st catch");
		}
		
		catch(Exception e) {
			System.out.println(e+"exception is occoured at eception" );
		}
		
		finally {
			System.out.println("hello");
		}
	
}
}