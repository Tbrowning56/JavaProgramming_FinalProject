/* Programmer: Tyler Browning
 * Program: Classroom
 * Description: 
 * Classroom part of building project
 * 
 * Last Modified: 04/17/2022 by Tyler Browning
 */
public class Classroom extends Room{
	private int numberOfChairs;
	
	//Constructors
	public Classroom(int area) {
		setSquareFeet(area);
	}
	
	public Classroom(int area, int numberOfChairs) {
		setSquareFeet(area);
		this.numberOfChairs = numberOfChairs;
	}
	
	//accessors
	public int getChairs() {
		return numberOfChairs;
	}
	
	public int getCapacity() {
		return getChairs();
	}
	
	public String toString() {
		return " Area: " + getSquareFeet()+ " Capcity: " + getCapacity() + " Chairs: " + getChairs();
	}
	
	//mutators
	public void setChairs(int newAmountOfChairs) {
		numberOfChairs = newAmountOfChairs;
	}
}
