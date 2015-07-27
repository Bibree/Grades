import java.util.Scanner;


public class Grades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double input;
		double newNumbers = 1;
		int i = 1;
		double avg;
		double originalInput;
		double Max;
		double Min;
		int A = 0;
		int B = 0;
		int C = 0;
		int D = 0;
		int F = 0;
		double numA;
		double numB;
		double numC;
		double numD;
		double numF;
		double perA ;
		double perB ;
		double perC;
		double perD;
		double perF;
		double sum;
		
//
		System.out.println("Enter the grades you want to use");
		System.out.println("After the last grade, type in a -1");
//
		Scanner keyboard = new Scanner(System.in);
		input = keyboard.nextDouble();
		
		originalInput = input; 
		Max = originalInput;
		Min = originalInput;
	
	if ((input >= 90 && input <= 100))  {
		A++;
		
	}else if
	((input >= 80 && input <= 89)) {
	B++;
	}else if
	((input >= 70 && input <= 79)) {
	C++;
	
	}else if
	( (input >= 60 && input <= 69)) {
	D++;
	
	}else if
	( (input >= 0 && input <= 59)) {
	F++;
	
}
	
		while (input >= 0 && newNumbers > 0)
		{
			

			newNumbers = keyboard.nextDouble();
			if ((newNumbers >= 90 && newNumbers <= 100) ) {
				A++;
			
				
			}else if
				((newNumbers >= 80 && newNumbers <= 89)) {
				B++;
				
			}else if
			((newNumbers >= 70 && newNumbers <= 79) ) {
			C++;
			
			}else if
			((newNumbers >= 60 && newNumbers <= 69)) {
			D++;
			
			}else if
			((newNumbers >= 0 && newNumbers <= 59)) {
			F++;
			
		}
			
			if (newNumbers > Max)
				Max = newNumbers;
	
			if (newNumbers < Min && newNumbers > 0)
				Min = newNumbers;
		
			if (i >0)
			i = i + 1;
			
			
			
			if (newNumbers == -1)
			{
				newNumbers++;
				i = i - 1;
		

			}
			
			input = input + newNumbers;
			
			
		}
	//
		System.out.println("Calculating...");
		System.out.println("The total number of grades placed is " + i );
		
		System.out.println("The number of A's = " + A);
		System.out.println("The number of B's = " + B);
		System.out.println("The number of C's = " + C);
		System.out.println("The number of D's = " + D);
		System.out.println("The number of F's = " + F);

		
		System.out.println("The highest grade is " + Max);	
		System.out.println("The lowest grade is  " + Min);
	//
		
		avg = input / i;
		System.out.println("Grade Average is " + avg);
	//
		sum = A + B + C + D + F;
	
		numA = A;
		numB = B;
		numC = C;
		numD = D;
		 numF = F;
	
	
	perA = (numA / sum) * 100;
	perB = (numB / sum) * 100 ;
	perC = (numC / sum) * 100 ;
	perD = (numD / sum) * 100 ;
	perF = (numF / sum) * 100 ;
	System.out.println("The percentage of A's " + perA + "%");
	System.out.println("The percentage of B's " + perB + "%");
	System.out.println("The percentage of C's " + perC + "%");
	System.out.println("The percentage of D's " + perD + "%");
	System.out.println("The percentage of F's " + perF + "%");
		
	}

	}
