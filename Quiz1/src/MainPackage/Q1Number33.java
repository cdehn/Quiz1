package MainPackage;

	import java.util.Scanner;
	
	public class Q1Number33 {

		public static void main(String[] args) {
			
			Scanner input = new Scanner(System.in);
			
			System.out.println("Enter number of touchdowns");
			double td = input.nextDouble();
			
			System.out.println("Enter the total yards");
			double yards = input.nextDouble();
			
			System.out.println("Enter the number of interceptions");
			double interceptions = input.nextDouble();
			
			System.out.println("Enter the number of completions");
			double completions = input.nextDouble();
			
			System.out.println("Enter the number of passes attempted");
			double att = input.nextDouble();
			
			
			double a = a(completions, att);
			double b = b(yards, att);
			double c = c(td, att);
			double d = d(interceptions, att);
			double passer_rating = passer_rating (a, b, c, d);
			
			System.out.print("The rating for this player is " + passer_rating);
		}
		
			public static double a(double completions, double att){
				double a = (((completions / att) - 0.3) * 5);
				return a;
			}
			
			public static double b (double yards, double att) {
				double b = (((yards / att) - 3) * .25);
				return b;
			}
		
			public static double c (double td, double att) {
				double c = ((td / att) * 20);
				return c;
			}
			
			public static double d(double interceptions, double att) {
				double d = (2.375 - ((interceptions / att) * 25));
				return d;
			}
			
			
			public static double passer_rating(double a, double b, double c, double d) {
				if (a < 0)
					a = 0;
				if (a > 2.375)
					a = 2.375;
				
				if (b < 0)
					b = 0;
				if (b > 2.375)
					b = 2.375;
				
				if (c < 0)
					c = 0;
				if (c > 2.375)
					c = 2.375;
				
				if (d < 0)
					d = 0;
				if (d > 2.375)
					d = 2.375;
				
				double passer_rating = (((a + b + c + d) / (6)) * 100);
				return passer_rating;
				
			}
	}
	