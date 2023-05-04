//thread qns
package practical8;
class threadhi extends Thread {
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("HI "+i);
			
		}
	}
}

public class lab1 {

	public static void main(String[] args) {
		threadhi t1=new threadhi();
		t1.start();
		
		
	}

}
