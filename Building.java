/* Programmer: Tyler Browning
 * Program: Lab13B
 * Date Created: 04/16/2022
 * Description: 
 * 
 * Program implements superclass room and subclasses classroom 
 * and elevator to use common methods for each elevator and classroom.
 * Building class was provided by professor, 
 * but modified to work with Room class.
 * 
 * Date Modified: 04/17/2022 by Tyler Browning
 */

	import java.util.ArrayList;
	import java.util.Random;
	import java.util.Scanner;

	public class Building {

		public static void main(String[] args) {
			Scanner kybd = new Scanner(System.in);

			ArrayList<Room> roomElements = new ArrayList<Room>();
			Random rand = new Random();

			System.out.println("Enter \n\t1: create classroom\n\t2: create elevator" + "\n\t3: exit (will display results)");
			int inp = kybd.nextInt();
			while (inp != 3) {
				if (inp == 1) {
					System.out.println("How many chairs? ");
					int ch = kybd.nextInt();
					Room current = new Classroom(rand.nextInt(1000) + 100, ch);
					roomElements.add(current);
				} else if (inp == 2) {
					Elevator current = new Elevator(rand.nextInt(100) + 10);
					if (rand.nextInt(2) == 0) {
						current.up(rand.nextInt(10));
					} else {
						current.down(rand.nextInt(10));
					}
					roomElements.add(current);
				}
				System.out.println("Enter \n\t1: create classroom\n\t2: create elevator" + "\n\t3: exit (will display results)");
				inp = kybd.nextInt();
			}
			kybd.close();
			for (Room room : roomElements) {
		           System.out.println(room);
		       }
		}

	}
