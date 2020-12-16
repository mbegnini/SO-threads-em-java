package Threads;

public class ExThread3 extends Thread{

	DataSingleton dataS;
	Data data;
	
	public ExThread3(Data data) {
		super();
		//dataS = DataSingleton.getInstance();
		this.data = data;
	}
	
	@Override
	public void run() {
		int i;
		for(i=0; i<data.rep; i++) {
			data.increment();
			//System.out.println("Thread 3 - "+data.getCont());
		}
		System.out.println("Thread 3 - i = "+i+ " cont="+data.getCont());
	}
}
