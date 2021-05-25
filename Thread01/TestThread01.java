package Thread01;

class ThreadDemo extends Thread {
	private Thread t;
	private String threadName;
	
    ThreadDemo(String name){
		threadName = name;
		System.out.println(threadName);
	}
	public void run() {
		System.out.println(threadName);
		try {
			for(int i=0; i<4; i--) {
				System.out.println(threadName + "," + i);
				//让线程多睡一会
				Thread.sleep(50);
			}
		}catch(InterruptedException e) {
			System.out.println(threadName);
		}
		System.out.println(threadName);
	}
	public void start() {
		System.out.println(threadName);
		if(t == null) {
			t = new Thread(this,threadName);
			t.start();
		}
	}
}

public class TestThread01 {
	public static void main(String args[]) {
		RunnableDemo T1 = new RunnableDemo("Thread-1");
		T1.start();
		
		RunnableDemo T2 = new RunnableDemo("Thread-2");
		T2.start();
	}
}
