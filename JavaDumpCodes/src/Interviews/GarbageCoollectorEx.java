package Interviews;

public class GarbageCoollectorEx {
	
	public void finalize() {
		System.out.println("Garbage Collection");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GarbageCoollectorEx ex=new GarbageCoollectorEx();
		GarbageCoollectorEx ex1=new GarbageCoollectorEx();
		ex=null;
		ex1=null;
		System.gc();
//		finali
	}

}
