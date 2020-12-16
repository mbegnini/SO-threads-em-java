package Threads;

public class Main {
	
	static int cont;
	static DataSingleton dataS;
	
	public static void main(String args[]) {
		dataS = DataSingleton.getInstance();
		
		Data data = new Data();
		
		ExThread1 t1 = new ExThread1(data);
		t1.start();
		
		Thread t2 = new Thread(new ExThread2(data));
		t2.start();
		
		ExThread3 t3 = new ExThread3(data);
		t3.start();
		
		Thread t4 = new Thread(new ExThread4(data));
		t4.start();
		
		int i;
		for(i=0; i<data.rep; i++) {
			data.increment();
			//System.out.println("Main Thread - "+data.getCont());
		}
		System.out.println("Main Thread - i = "+i+ " cont="+data.getCont());
		
		try {
			t1.join();
			t2.join();
			t3.join();
			t4.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		System.out.println(data.getCont());
	}
	
	public static class ExThread1 extends Thread{
		
		Data data;
		
		public ExThread1(Data data) {
			super();
			this.data = data;
		}
		
		@Override
		public void run() {
			int i;
			for(i=0; i<data.rep; i++) {
				data.increment();
				//System.out.println("Thread 1 - "+data.getCont());
			}
			System.out.println("Thread 1 - i = "+i+ " cont="+data.getCont());

		}
	}
	
	public static class ExThread2 implements Runnable{
		
		Data data;
		
		public ExThread2(Data data) {
			super();
			this.data = data;
		}
		
		@Override
		public void run() {
			int i;
			for(i=0; i<data.rep; i++) {
				data.increment();
				//System.out.println("Thread 2- "+data.getCont());
			}
			System.out.println("Thread 2 - i = "+i+ " cont="+data.getCont());

		}
	}
	
	
}
