// synchronized method 
package practical9;
class increase{
	int count;
	public synchronized void increaseby1()
	{
		count++;
	}
}
public class lab1 {
	public static void main(String[] args) throws InterruptedException  {
		increase i1 =new increase();
		Thread th1 =new Thread(new Runnable() {
			public void run() {
				for(int i=0;i<1000;i++) {
					i1.increaseby1();
				}
			}
	
		});
		
		Thread th2 =new Thread(new Runnable() {
			public void run() {
				for(int i=0;i<1000;i++) {
					i1.increaseby1();
				}
			}
	
		});
		
		th1.start();
		th2.start();
		th1.join();
		th2.join();
		System.out.println("the total count is :"+i1.count);
		
	}
}
