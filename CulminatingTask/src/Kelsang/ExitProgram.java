package Kelsang;

import lejos.nxt.Button;
import lejos.robotics.subsumption.Behavior;

public class ExitProgram implements Behavior {

	@Override
	public boolean takeControl() {
		return Button.ESCAPE.isDown();
		
	}

	@Override
	public void action() {
		System.exit(0);
		
	}

	@Override
	public void suppress() {
		
		
	}

}
