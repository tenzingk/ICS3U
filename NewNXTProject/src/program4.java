import lejos.nxt.Button;
import lejos.nxt.Motor;

public class program4 {

	public static void main(String[] args) {
		System.out.println("Program 4");
		Motor.B.rotate(-5780);
		int angle=Motor.B.getTachoCount();
		System.out.println(angle);
		Motor.B.stop();
		Button.waitForAnyPress();
		int angle2=Motor.B.getTachoCount();
		System.out.println(angle2);

	}

}
