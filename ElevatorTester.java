import java.util.Scanner;

/**
 * Tyler Browning
 *Lab 13b
 */
public class ElevatorTester {

	public static void main(String[] args) {
		Scanner kybd = new Scanner(System.in);
		Elevator floor = new Elevator();
		
		int choice;
		do {
			System.out.println("The elevator is on the floor: "+floor.getFloor());
			System.out.println("Enter 1 to go up a floor");
			System.out.println("Enter 2 to go down a floor");
			System.out.println("Enter 0 to exit the elevator");
			choice = kybd.nextInt();
			switch (choice) {
			case 1:
					floor.up(1);
					break;
			case 2:
					floor.down(1);
					break;
			case 0:
					System.exit(0);
					break;
		} 
		}while (choice != 0);
	}
}

	


