import java.io.File;

public class Main {

	public static void main(String[] args) {
	
	    File file = new File("text.txt");
	    
	    if(file.exists()) {
	    	System.out.println("this file exists");
	    }else {
	    	System.out.println("this file doesn't exists");
	    }
      
      
	}

}




