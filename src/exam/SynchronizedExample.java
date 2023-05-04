package exam;
class Increment{
int count;
public synchronized void increaseby1() {
count ++;
}
}
public class SynchronizedExample {
public static void main(String[] args) throws
InterruptedException {

Increment i1 = new Increment();
Thread th1 = new Thread(new Runnable() {
public void run() {
for(int i = 0;i<100;i++) {
i1.increaseby1();
}
}
});
Thread th2 = new Thread(new Runnable() {
public void run() {
	for(int i = 0;i<100;i++) {
		i1.increaseby1();
	}
}
});
th1.start();
th2.start();
th1.join();
th2.join();
System.out.println("The total count is :: "+ i1.count);
}
}