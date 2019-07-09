package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
	Robot BB8 = new Robot();
	BB8.setSpeed(100);
	BB8.penDown();
	for (int i = 0; i < 4 ; i++) {
	BB8.move(100);
	BB8.turn(90);

	}
		
	}
}
