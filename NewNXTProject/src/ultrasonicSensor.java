import lejos.nxt.Button;
import lejos.nxt.Motor;
import lejos.nxt.SensorPort;
import lejos.nxt.UltrasonicSensor;
import lejos.util.Delay;

public class ultrasonicSensor {

	public static void main(String[] args) {
		UltrasonicSensor sonar= new UltrasonicSensor(SensorPort.S4);
		sonar.continuous();
		
		Motor.B.forward();
		Motor.C.forward();
		System.out.println( sonar.getDistance());
		if(sonar.getDistance() < 100){
			Delay.msDelay(1000);
			Motor.C.rotate(-320);
			Motor.C.stop();
			Motor.B.stop();
			Motor.B.forward();
			Motor.C.forward();
			Delay.msDelay(2000);
			Motor.C.stop();
			Motor.B.stop();
			
			
		}
		Button.waitForAnyPress();
	}

}
