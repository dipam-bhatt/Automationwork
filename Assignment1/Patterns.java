package Assignment1;

/* 1	      
12       
123       
1234       
12345 */    

public class Patterns {
	public static void main(String[] args) {
		  for(int r=1;r<=5;r++) {
		    	 for(int c=1;c<=r;c++) {
		    		 System.out.print(c);
		    	 }
		    	     System.out.println();
		      }
		  /* 1
		   01
		   101
		   0101
		   10101 */
		  for(int r=1;r<=5;r++) {
		    	 for(int c=1;c<=r;c++) {
		    		  if((r+c)%2 == 0) {
		    			System.out.print("1");
		    		  }
		    		  else {
		    			System.out.print("0");  
		    		  }
		    	  }
		    	        System.out.println();
		      }
		  /*  1
		   2 2
		  3 3 3            
		 4 4 4 4 */
		   for(int r=1;r<=4;r++) {
		    	 for(int c=1;c<=4-r;c++) {
		    		 System.out.print(" ");
		    	 }
		    	 for(int c=1;c<=r;c++) {
		    	 System.out.print(r + " ");
		      }
		    	 System.out.println();
	}
		  
		  
	}

}
