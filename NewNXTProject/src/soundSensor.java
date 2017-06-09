import lejos.nxt.Button;
import lejos.nxt.Motor;
import lejos.nxt.SensorPort;
import lejos.nxt.SoundSensor;

public class soundSensor {

	public static void main(String[] args) {
		SoundSensor sound= new SoundSensor(SensorPort.S3);
		sound= new SoundSensor(SensorPort.S3, true);
	
		sound.readValue();

		while(){
			
			Motor.B.rotate(1040);
			
		}
		
			Motor.B.backward();
			Button.waitForAnyPress();
		}
	
	}




