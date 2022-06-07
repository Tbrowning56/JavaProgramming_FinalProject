/* Programmer: Tyler Browning
 * Program: Elevator class extends room. 
 * part of building project. 
 * 
 * Date Modified: 04/17/2022 by Tyler Browning
 */

class Elevator extends Room {
	

	
	public Elevator(){}
	private int floorLevel;

	//constructor that calls for Room
	public Elevator(int area) {
		super(area);
		}
	

	//getter for current
	public int getFloor() {
		return this.floorLevel;
	}
	
	//mutator for floorLevel. Increases level
	public void up(int up) {
		this.floorLevel += up;
		}
	
	//mutator for floorLevel. Decrease level
	public void down(int down) {
		this.floorLevel -= down;
		}
	
	//override method to use superclass, Room for message to main
	@Override
	public String toString() {
		return "Elevator: \n" + super.toString() + " The Current Floor: " + this.floorLevel;
		}
}