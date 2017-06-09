import lejos.nxt.Button;
import lejos.nxt.Motor;
import lejos.util.Delay;

public class program5 {

	public static void main(String[] args) {
		System.out.println("Program 5");
		Motor.B.setSpeed(720);
		Motor.B.forward();
		Motor.C.setSpeed(720);
		Motor.C.forward();
		Button.waitForAnyPress();
		for(int i = 0; i < 8; i++);
		{
		Delay.msDelay(200);
		int angle=Motor.B.getTachoCount();
		System.out.println(angle);
		
		Delay.msDelay(200);
		int angle2=Motor.C.getTachoCount();
		System.out.println(angle2);
		Button.waitForAnyPress();
		}
		
		
	}

}
