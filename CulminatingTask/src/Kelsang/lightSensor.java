package Kelsang;

import lejos.nxt.LightSensor;
import lejos.nxt.Motor;
import lejos.nxt.SensorPort;
import lejos.robotics.subsumption.Behavior;
import lejos.util.Delay;

public class lightSensor implements Behavior {
	private boolean suppressed=false;
	private LightSensor light =new LightSensor(SensorPort.S2);

	@Override
	public boolean takeControl() {
		 light.getLightValue();
			if( light.getLightValue() < 50){
			return true;
		}
		
		return false;
		
	}

	@Override
	public void action() {
		//robot moves towards cup and senses if it is dark enough to push away
		suppressed=false;
		Delay.msDelay(1200);
		Motor.B.forward();
		Motor.C.forward();
		Delay.msDelay(1200);
		Motor.B.backward();
		Motor.C.backward();
		Motor.B.stop();
		Motor.C.stop();
		Motor.C.rotate(300);
		while(!suppressed)
		{
		Thread.yield();
		}
	}
	

	@Override
	public void suppress() {
		suppressed=true;

	}

}
