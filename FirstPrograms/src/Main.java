

public class Main {

	public static void main(String[] args) {
		
        String[][] cars = new String[3][3];
        
        cars[0][0] = "Camaro";
        cars[0][1] = "Corvette";
        cars[0][2] = "silverado";
        
        cars[1][0] = "mustang";
        cars[1][1] = "F-150";
        cars[1][2] = "ferrari";
        
        cars[2][0] = "tesla";
        cars[2][1] = "sfsf";
        cars[2][2] = "sfsfsff";
        
        
          for(int i = 0; i < cars.length; i++) {
        	  System.out.println();
        	  for(int j = 0; j < cars[i].length; j++) {
        		  System.out.print(cars[i][j] + " ");
        	  }
          }
       
        
      
	  
	  
	    
	}

}
