package Kelsang;

import lejos.nxt.Motor;
import lejos.nxt.SensorPort;
import lejos.nxt.UltrasonicSensor;
import lejos.robotics.subsumption.Behavior;
import lejos.util.Delay;

public class ultrasonicSensor implements Behavior {
	private boolean suppressed=false;
	@Override
	public boolean takeControl() {
		
		UltrasonicSensor sonar= new UltrasonicSensor(SensorPort.S4);
		sonar.getDistance();
		System.out.println(sonar.getDistance());
		sonar.continuous();
		if(sonar.getDistance() < 25){
			return true;
		}
		
		return false;
	}

	@Override
	public void action() {
		//robot senses cup and moves towards it
			suppressed=false;
			Motor.C.rotate(-300);
			Delay.msDelay(1200);
			Motor.B.forward();
			Motor.C.forward();
			Delay.msDelay(1200);
			Motor.B.backward();
			Motor.C.backward();
			Motor.B.stop();
			Motor.C.stop();
			Motor.C.rotate(300);
			while(!suppressed){
				Thread.yield();
		}
	}

	

	@Override
	public void suppress() {
		suppressed=true;

	}

}
