package section2;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	
	// 2. Create a new Robot
Robot BB8 = new Robot();

	void go() {
		BB8.setSpeed(100);
		// 4. Make the robot move as fast as possible

		// 5. Set the pen width to 5
		BB8.setPenWidth(5);
		BB8.penDown();
		// 6. Use a for loop to repeat steps #7 to #8, four times...
		for (int i = 0; i < 4; i++) {
		BB8.setRandomPenColor();
		
			
		
			// 7. Set the pen color to random
	
			// 1. Call the drawSquare() method
	drawSquare();
			// 8. Turn the robot 90 degrees to the right
		BB8.turn(90);
		}
		
	}

	
	void drawSquare() {
		//JOptionPane.showMessageDialog(null, "yay! you called the drawSquare() method!");
		/* 3. Fill in the code to draw a square inside the method below. */
		for (int i = 0; i < 4; i++) {
			BB8.move(100);
			BB8.turn(90);
			
		}
		
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}



