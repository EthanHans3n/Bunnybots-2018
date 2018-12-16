package org.usfirst.frc.team4043.robot.subsystems;

import org.usfirst.frc.team4043.robot.RobotMap;
import org.usfirst.frc.team4043.robot.commands.IntakeUpDown;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Intake extends Subsystem {

	// Put methods for controlling this subsystem
	// here. Call these from Commands.
	public void setIntakeSpeed(double speed) {
		RobotMap.intakeLeft.set(speed);
		RobotMap.intakeRight.set(speed * -1);
	}

	public void intakeUp() {
		RobotMap.intakeLeft.set(1);
		RobotMap.intakeRight.set(-1);
	}
	public void stopAll () {
		RobotMap.intakeLeft.set(0);
		RobotMap.intakeRight.set(0);
	}

	public void intakeDown() {
		RobotMap.intakeLeft.set(-1);
		RobotMap.intakeRight.set(1);
	}

	public void initDefaultCommand() {

		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());

		setDefaultCommand(new IntakeUpDown());
	}

}
