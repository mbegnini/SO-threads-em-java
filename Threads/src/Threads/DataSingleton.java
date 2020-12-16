package Threads;

public class DataSingleton {
	
	private static DataSingleton instance;
	
	private static int cont;
	
	private DataSingleton() {
		instance = this;
		cont = 0;
	}
	
	public static DataSingleton getInstance() {
		if (instance == null){
			instance = new DataSingleton();
		}
		return instance;
	}
	
	public void increment() {
		cont ++;
	}
	
	public void reset() {
		cont =0;
	}
	
	public int getCont() {
		return cont;
	}

}

