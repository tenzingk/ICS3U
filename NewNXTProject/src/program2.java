import lejos.nxt.Button;
import lejos.nxt.Motor;
import lejos.util.Delay;

public class program2 {

	public static void main(String[] args) {
		System.out.println("Program 2");
		Motor.B.setSpeed(720);
		Motor.B.forward();
		
		Delay.msDelay(2000);
		int angle2= Motor.B.getTachoCount();
		System.out.println(angle2);
		Motor.B.stop();
		int angle3= Motor.B.getTachoCount();
		System.out.println(angle3);
		Motor.B.rotate(-360);
		
		int angle4= Motor.B.getTachoCount();
		System.out.println(angle4);
		Motor.B.stop();
		int angle5= Motor.B.getTachoCount();
		System.out.println(angle5);
		Button.waitForAnyPress();
	}

}
