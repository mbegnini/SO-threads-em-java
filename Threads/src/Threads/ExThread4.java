package Threads;

public class ExThread4 implements Runnable {

	DataSingleton dataS;
	Data data;
	
	public ExThread4(Data data) {
		super();
		//dataS = DataSingleton.getInstance();
		this.data = data;
	}
	
	@Override
	public void run() {
		int i;
		for(i=0; i<data.rep; i++) {
			data.increment();
			//System.out.println("Thread 4 - "+data.getCont());
		}
		System.out.println("Thread 4 - i = "+i+ " cont="+data.getCont());
	}
}
