package base;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a , b , c;
		a = 10; b = 20; c = 30;
		
		metodo();
		metodo(a);
		metodo(a,b);
		metodo(a,b,c);

	}
	
	
	
	public static void metodo(int... x) {
		System.out.println("Io non accetto parametri");
	}
	
	public static void metodo(int x) {
		System.out.println("Io accetto solo un parametro : " + x);
	}
	
	
	public static void metodo(int x, int y) {
		System.out.println("Io accetto due parametri : " + x + " e " + y);
	}
	
	public static void metodo(int x , int y, int z) {
		System.out.println("Io accetto tre parametri : " + x + " , " + y + " e " + z);
	}

}
