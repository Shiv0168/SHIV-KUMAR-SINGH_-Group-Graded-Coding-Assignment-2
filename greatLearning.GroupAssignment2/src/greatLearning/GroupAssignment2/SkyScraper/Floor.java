package greatLearning.GroupAssignment2.SkyScraper;

/*Your friend is a chief architect, who is working on building a skyscraper, in Mumbai. 
The construction is in such a way that the floors will be constructed in other factories and they will be assembled. 
All the sizes will be distinct.
The skyscraper needs to be constructed in N days with the following conditions :
	•	Every day a floor is constructed in a separate factory of distinct size.
	•	The floor with the larger size must be placed at the bottom of the building.
	•	The floor with the smaller size must be placed at the top of the building.
Note: A floor cannot be assembled in the building until all floors larger in size are placed.
As a friend he wants you to build a small program that will help him analyze the construction process, 
to avoid manual work and errors.
 */

import java.util.Stack;

public class Floor {

	private Stack<Integer> floorSizesStack = new Stack<>();

	public Floor() {

		System.out.println("\nThe order of construction is as follows :");

	}

	public void constructFloor(int requiredFloorSize, int[] floorSizes)

	{

		for (int i = 0; i < floorSizes.length; i++) {

			int day = i + 1;

			System.out.println("\n\nDay: " + day);

			if (floorSizes[i] != requiredFloorSize) {

				System.out.print(" ");

				floorSizesStack.push(floorSizes[i]);

			} else {

				requiredFloorSize -= 1;

				System.out.print(floorSizes[i] + " ");

				while (!floorSizesStack.isEmpty() && requiredFloorSize == floorSizesStack.peek())

				{

					requiredFloorSize -= 1;

					System.out.print(floorSizesStack.pop() + " ");

				}

			}

		}

	}

}
