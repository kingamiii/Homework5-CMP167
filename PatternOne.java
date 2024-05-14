package hw5;

/*amirah igbara
 * CMP 167
 * Prof. Kelly
 * 10/18/23*/
import java.util.Scanner;

public class PatternOne {

	public static void main(String[] args) {
		// Enter Scanner
		Scanner sc = new Scanner(System.in);
		
		//Declaring the variables
		int n, outl, inl;
		
		// Getting input
		System.out.println("Please enter a number 1...9 : ");
				n = sc.nextInt();
				
		// Loop 
		for (outl = 1; outl <= n; outl ++) {
			for (inl = 1; inl <= outl; inl ++) {
				System.out.printf("%d ", inl);
				
			}
			System.out.println("");
		}
	
	}

}
