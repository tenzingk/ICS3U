import lejos.nxt.Button;
import lejos.nxt.Motor;

public class program3 {

	public static void main(String[] args) {
		System.out.println("Program 3");
		Button.waitForAnyPress();
		Motor.B.rotate(5780);
		int angle=Motor.B.getTachoCount();
		
		System.out.println(angle);
		
		Motor.B.rotateTo(0);
		
		int angle3=Motor.B.getTachoCount();
		
		System.out.println(angle3);
		
		Button.waitForAnyPress();

		
	}

}
