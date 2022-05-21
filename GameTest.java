package trying;

public class GameTest {
	
		
	
	   public static void main(String[] args) throws Exception {
	      //Game myGame = new Game();
		   
		   System.out.println(is_divisible(75));
	   }
	   public static boolean is_divisible (int input) {
		   
		   int temp_input = input;
		   int x=0;
		   while(input!=0) {
			   
			   
			   x+=input%10;
			   input = input -(input%10); 
			   input = input/10;
			   
		   }
		   if (temp_input%x==0) {
			return true;
			}
		   else {
			return false;
		}
		
		   
		   
		   
			
		
		   
	   }
	}


