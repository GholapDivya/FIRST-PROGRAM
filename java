package Staff;

		import java.util.Scanner;

		public class AreaofCircle {
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        // Ask the user to enter the radius
		        System.out.print("Enter the radius of the circle: ");
		        double radius = scanner.nextDouble();

		        // Calculate the area (Area = π * r * r)
		        double area = Math.PI * radius * radius;

		        // Display the result
		        System.out.println("The area of the circle is: " + area);

		        scanner.close();
		    }
		}

		
