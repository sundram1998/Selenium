package mthodOverloading;

public class overidingExample extends methodOverloadingExample{
	
	@Override
	public void add(int a,int b) {
		System.out.println(a+b);
		System.out.println("This is overrinding");
	}
	 
	public static void main(String[] args) {
		overidingExample objExample=new overidingExample();
		objExample.add(33, 44);
		
	}

}
