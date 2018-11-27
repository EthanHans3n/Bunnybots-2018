package org.usfirst.frc.team4043.robot.subsystems;

import org.usfirst.frc.team4043.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Sorter extends Subsystem {

	// Put methods for controlling this subsystem
	// here. Call these from Commands.

	public void actSualYeet() {
		RobotMap.yeetR.set(1);
	}

	public void actualUnYeet() {
		RobotMap.yeetL.set(-1);
	}
	
	public void noYeet() {
		RobotMap.yeetR.set(0);
		RobotMap.yeetL.set(0);
	}
	public void rightYeet() {
		RobotMap.yeetR.set(1);
	}
	public void rightUnYeet() {
		RobotMap.yeetR.set(-1);
	}
	public void leftYeet() {
		RobotMap.yeetL.set(1);
	}
	public void leftUnYeet() {
		RobotMap.yeetL.set(-1);
	}
	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
	}
}
