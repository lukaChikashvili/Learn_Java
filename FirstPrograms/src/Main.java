import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
	
		try {
			 FileWriter writer = new FileWriter("poem.txt");
			 writer.write("this is a poem");
			 writer.close();
			 
			   
		}catch(IOException e ) {
			 e.printStackTrace();
		}
	  
	   
	   
	   
      
	}

}




