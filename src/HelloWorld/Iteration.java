package HelloWorld;

public class Iteration {
	
	public static void numbers() {
		
		int catCount = 0;
	    boolean notEnoughCats = true;

	        while(notEnoughCats) {
	            System.out.println("Another cat");
	            catCount++;

	            if(catCount > 10) {
	                notEnoughCats = false;
	            }
	        }

	        System.out.println("Too many cats what do I do");
	    }

		
		
		
	}

