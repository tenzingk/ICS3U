
import lejos.nxt.Button;
import lejos.nxt.Motor;
public class HelloWorld {
	/**
	 * @param args
	 */

	public static void main(String[] args) {
		System.out.println("Program 1");
		Button.waitForAnyPress();
		Motor.B.forward();
		Motor.C.forward();
		System.out.println("FORWARD");
		Button.waitForAnyPress();
		Motor.B.backward();
		Motor.C.backward();
		System.out.println("BACKWARD");
		Button.waitForAnyPress();
		Motor.B.stop();
		Motor.C.stop();

	}

}
