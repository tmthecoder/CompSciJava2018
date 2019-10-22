//  Dice.java
package com.tejasmehta;
/****
 * Name: Tejas Mehta
 * Date: May 15th, 2019
 * Lab Name: LabOOP1-DiceFun
 * Extra: Same as Main File
 */
/**
 * Implements a Dice object (a die)
 * 
 * @author andrianoff
 * @version June 25, 2014
 */
class Dice {
	/**
	 * Constructs a die
	 */
	private int sides;
	Dice(int s) {
		sides = s;
	}	

	/**
	 * Rolls a die - generates a random number in the range 1 .. 6
	 * @return the face value of the die
	 */
	int roll()
	{
		return (int) (Math.random()*sides) + 1;
	}
	//ToString
	public String toString() {
		return "sides = " + sides;
	}
}