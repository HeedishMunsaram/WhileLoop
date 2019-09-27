import java.util.Scanner;
/**
 * 
 */

/**
 * @author Andish
 *
 */
public class loopwhile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner keyboard = new Scanner(System.in);
		
        System.out.println("Please enter your mark : ");
        double mark = keyboard.nextDouble();
        
        double total = 0;
        double count = 0;
        double average = 0;
		//progress should stop until mark = -1
		while (mark != -1);
		{
			total = total + mark;
			count++;
			
			System.out.println("Please stop");
			mark = keyboard.nextDouble();
		}
		System.out.println("Your average is : " + (total / count));
	keyboard.close();		
	}

}
