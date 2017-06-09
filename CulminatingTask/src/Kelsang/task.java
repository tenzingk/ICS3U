package Kelsang;

import lejos.robotics.subsumption.Arbitrator;
import lejos.robotics.subsumption.Behavior;

public class task {

	public static void main (String[]args){
		Behavior b1=new DriveForward();
		Behavior b4=new lightSensor();
		Behavior b3= new ultrasonicSensor();
		Behavior b2=new ExitProgram();
		
		Behavior[]arby = {b1,b4,b3,b2};
		Arbitrator arbys= new Arbitrator(arby);
		arbys.start();
	}
}
