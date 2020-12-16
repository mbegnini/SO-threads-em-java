package Threads;

public class Data {
	
	private int cont;
	public int rep;
	
	public Data() {
		cont = 0;
		rep = 10000;
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
