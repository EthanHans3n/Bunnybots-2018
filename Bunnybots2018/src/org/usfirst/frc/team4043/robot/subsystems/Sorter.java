package org.usfirst.frc.team4043.robot.subsystems;

import org.usfirst.frc.team4043.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Sorter extends Subsystem {

	// Put methods for controlling this subsystem
	// here. Call these from Commands.
	public void yeet() {
		RobotMap.yeet.set(1);
	}
	public void actualYeet() {
		RobotMap.actualYeet.set(1);
	}

	public void actualUnYeet() {
		RobotMap.actualUnYeet.set(-1);
	}
	public void noYeet() {
		RobotMap.yeet.set(0);
		RobotMap.actualYeet.set(0);
		RobotMap.actualUnYeet.set(0);
	}
	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
	}
}
