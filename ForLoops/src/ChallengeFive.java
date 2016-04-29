import java.util.Scanner;

public class ChallengeFive 
	{
		public static void main(String[] args) 
			{
				Scanner userInput = new Scanner(System.in);
				System.out.println("Plug in a number.");
				int sum= 0;
				System.out.println("What is the lowerbound?");
				int lowerBound = userInput.nextInt();
				System.out.println("What is the upperbound?");
				int upperBound = userInput.nextInt();
				for (int i = lowerBound; i<= upperBound; i = i + 1)
			{
					sum = sum + i;
					System.out.println(sum);
				}
			}
		}