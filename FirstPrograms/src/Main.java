

public class Main {

	public static void main(String[] args) {
      int x = add(1, 2, 10);
	   System.out.println(x);
	}
	
	// overloaded methods
	
     static int add(int a, int b) {
    	 return a + b;
     }
     
 	
     static int add(int a, int b, int c) {
    	 return a + b + c;
     }
}
