/* Programmer: Tyler Browning
 * Program: Room Class 
 * Description: 
 * superclass for classroom and elevator
 * 
 * Last Modified: 04/17/2022 by Tyler Browning
 */

public class Room {
	
	public Room(){
	}
	private int squareFeet;
	
	//arg-constructor takes int value of square feet
	public Room(int squareFeet){
		this.squareFeet = squareFeet;
		}
	//getter method for squarefeet divided by 9
	public int getCapacity() {
		return getSquareFeet()/9;
		}
	//mutator method for squareFeet
	public void setSquareFeet(int squareFeet) {
		this.squareFeet = squareFeet;
	}
	//getter method for squareFeet
	public int getSquareFeet() {
		return squareFeet;
		}
	//override for toString method. Both Classroom and Elevator use toString to form a data Line
	@Override
	public String toString() {
		return "The Area: " + squareFeet + ", The Capacity: "+getCapacity() + ",";
		} 
}
