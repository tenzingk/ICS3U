import lejos.nxt.Button;
import lejos.nxt.LightSensor;
import lejos.nxt.Motor;
import lejos.nxt.SensorPort;
import lejos.util.Delay;

public class lightSensor {

	public static void main(String[] args) {
		LightSensor light=new LightSensor(SensorPort.S3);
		int lightdigit = light.getLightValue();
		Motor.B.forward();
		Motor.C.forward();
		while( lightdigit >50){
			Motor.B.backward();
			Motor.C.backward();
			
			
		}
			Motor.B.forward();
			Motor.C.forward();
			Button.waitForAnyPress();

	}

}
