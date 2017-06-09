import lejos.nxt.Button;
import lejos.nxt.Motor;
import lejos.nxt.SensorPort;
import lejos.nxt.TouchSensor;
import lejos.util.Delay;

public abstract class touchSensor {

	public static void main(String[] args) {
		TouchSensor touch=new TouchSensor(SensorPort.S2);
		
		
		while(touch.isPressed()==false){
			Motor.B.forward();
		}
		Motor.B.backward();
		
	}


}
