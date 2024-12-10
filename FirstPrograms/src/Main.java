import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
         System.out.println("enter your name");
         
         String name = scanner.nextLine();
         
         System.out.println("enter your age");
         
         int age = scanner.nextInt();
         
         if(age < 18) {
        	 System.out.println("dear " + name + ", you are not allowed to drive");
         }else {
        	 System.out.println("dear " + name + ", you are  allowed to drive");
         }
         
        
         
         scanner.close();
        
	}

}
