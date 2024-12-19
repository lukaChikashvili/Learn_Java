import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try {
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("enter the whole number to divide by:");
			int x = scanner.nextInt();
			
			System.out.println("enter the whole number to divide by:");
			int y = scanner.nextInt();
			
			int z = x/y;
			
			System.out.println("result " + z);
			
			scanner.close();
		}catch(ArithmeticException e) {
			 System.out.println("you can't divide by 0");
			 
		}
        
	
		
		
      
      
	}

}




