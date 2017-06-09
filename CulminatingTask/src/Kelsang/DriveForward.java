package Kelsang;

import lejos.nxt.Motor;
import lejos.robotics.subsumption.Behavior;
import lejos.util.Delay;

public class DriveForward implements Behavior {
	private boolean suppressed=false;

	@Override
	public boolean takeControl(){
		return true;
	}
		@Override
		public void action(){
			suppressed=false;
			Motor.B.forward();
			Motor.C.forward();
			while(!suppressed)
				Thread.yield();
		
		}
		@Override
		public void suppress(){
			suppressed=true;

	}

}

