package hw5;

import java.util.Scanner;
public class Grades {

	public static void main(String[] args) {
		// entering scanner
		Scanner sc = new Scanner(System.in);
		//declaring variables
		int A = 0;
		int Ami = 0;
		int Bpl = 0;
		int B = 0;
		int Bmi = 0;
		int Cpl = 0;
		int C = 0;
		int Cmi = 0;
		int D = 0;
		int F = 0;
		int gradeCount = 0;
		//getting input
		System.out.println("Enter a grade: ");
		int grade = sc.nextInt();
		
		// loop
		while (grade !=100) {
			if (100 <= grade && 93 >= grade)
				A++;
			if (93 <= grade && 90 > grade)
				Ami++;
			if (90 <= grade && 87 > grade)
				Bpl++;
			if (87 <= grade && 83 > grade)
				B++;
			if (83 <= grade && 80 > grade)
				Bmi++;
			if (80 <= grade && 77 > grade)
				Cpl++;
			if (77 <= grade && 73 > grade)
				C++;
			if (73 <= grade && 70 > grade)
				Cmi++;
			if (70 <= grade && 60 > grade)
				D++;
			if (60 <= grade && 0 > grade)
				F++;
			
			gradeCount++;
			System.out.println("Enter a grade: ");
			grade = sc.nextInt();
				}
		System.out.println("Total number of grades = "+ gradeCount);
		System.out.println("Number of A's = " + A);
		System.out.println("Number of A-'s = " + Ami);
		System.out.println("Number of B+'s = " + Bpl);
		System.out.println("Number of B's = " + B );
		System.out.println("Number of B-'s = " + Bmi );
		System.out.println("Number of C+'s = " + Cpl );
		System.out.println("Number of C's = " + C );
		System.out.println("Number of C-'s = " + Cmi );
		System.out.println("Number of D's = " + D);
		System.out.println("Number of F's = " + F);
	
	}
	}


