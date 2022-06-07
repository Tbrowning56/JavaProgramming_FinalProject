/**
 * Tyler Browning
 * Lab 13b
 *
 */
public class ClassroomTester {

	public static void main(String[] args) {
		Classroom NewClass = new Classroom(5);
		
		
		System.out.println("The number of chairs in the classroom is: "+NewClass.getChairs());
		System.out.println("The capacity of the classroom is: "+NewClass.getCapacity());

	}

}
