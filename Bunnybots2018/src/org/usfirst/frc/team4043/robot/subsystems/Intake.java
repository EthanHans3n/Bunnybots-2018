package org.usfirst.frc.team4043.robot.subsystems;

import org.usfirst.frc.team4043.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Intake extends Subsystem {

	// Put methods for controlling this subsystem
	// here. Call these from Commands.
	public void setIntakeSpeed(double speed) {
		RobotMap.constantIntake.set(speed);
	}

	public void intakeUp() {
		RobotMap.constantIntake.set(1);

	}
	public void stopAll () {
		RobotMap.constantIntake.set(0);
	}

	public void intakeDown() {
		RobotMap.constantIntake.set(-1);
	}

	public void initDefaultCommand() {

		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());

	}

}
