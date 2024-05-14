package hw5;

/*amirah igbara
 * cmp 167
 * Prof. Kelly
 * 11/5/23*/
import java.util.Scanner;

public class PatternTwo {

	public static void main(String[] args) {
		// Enter Scanner
		Scanner sc = new Scanner(System.in);
		
		//Declaring the variables
		int n, outl, inl,o;
		
		// Getting input
		System.out.println("Please enter a number 1...9 : ");
				n = sc.nextInt();
				
		// Loop 
		for (outl = 1; outl <= n; outl++) {
			for (inl = 1; inl <= n-outl; inl++) {
				System.out.print("  ");
			}
			
			for (o = outl; o >= 1; o--) {
				System.out.print(" "+o);
			}
			System.out.println();
		}
		
	}

}
