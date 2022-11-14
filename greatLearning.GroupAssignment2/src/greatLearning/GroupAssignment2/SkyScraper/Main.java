package greatLearning.GroupAssignment2.SkyScraper;

/*Input
First Line: contains the total floors N in the building
Second Line onwards: Contains N inputs in which the ith integer denotes the size of the floor that will be given to architect by factories on the ith day.
Output
You are required to print N lines. Print the size of the floor in descending order, which can be assembled.
If no floor can be assembled on the ith day, leave the line empty.
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.print("\nEnter the total number of floors in the building: ");

		int totalfloor = sc.nextInt();

		int[] floorSizes = new int[totalfloor];

		for (int i = 0; i < floorSizes.length; i++) {

			int day = i + 1;

			System.out.println("Enter the floor size on day : " + day);

			int size = sc.nextInt();

			if (size <= 0) {

				System.out.println("\nFloor size cannot be less than or equal to zero");

				i--;
			}

			else if (size > totalfloor) {

				System.out.println("\nFloor size cannot be greater than totalfloor");

				i--;
			}

			else {

				floorSizes[i] = size;

			}
		}

		Floor fConstruction = new Floor();

		fConstruction.constructFloor(totalfloor, floorSizes);
		sc.close();

	}

}