package tuan.com.studyandshare;

public class UnitThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread myTR = new MyThread();
		
		Thread thread1 = new Thread(myTR);
		
//		Thread thread2 = new Thread() {
//			public void run() {
//				try {
//					Thread.sleep(20000);
//					System.out.println("Day la thread 2");
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//				
//			}
//		};
		
		Thread th3 = new Thread();
		th3.currentThread().setName("Th3");
		
		
		
//		thread1.setName("Thread1");
//		System.out.println(thread1.currentThread().getName());
		System.out.println(th3.currentThread().getName());
		
		thread1.start();
		th3.start();
		
		
//		System.out.println("tuan123");

	}

}

class MyThread implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			for (int i = 0; i < 10; i++) {
				Thread.sleep(300);
				System.out.println(Thread.currentThread().getName() + " " + i);
			}
			
		}catch (Exception e) {
			
		}
		
		
	}
	
}