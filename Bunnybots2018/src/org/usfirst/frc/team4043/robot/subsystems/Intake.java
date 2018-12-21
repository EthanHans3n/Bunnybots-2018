package org.usfirst.frc.team4043.robot.subsystems;

import org.usfirst.frc.team4043.robot.RobotMap;
import org.usfirst.frc.team4043.robot.commands.IntakeStop;
import org.usfirst.frc.team4043.robot.commands.SlowDown;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Intake extends Subsystem {

	// Put methods for controlling this subsystem
	// here. Call these from Commands.
	
	double intakeSpeed = .95;
	
	public void setIntakeSpeed(double speed) {
		RobotMap.intakeLeft.set(speed);
		RobotMap.intakeRight.set(speed * -1);
	}

	public void intakeUp() {
		RobotMap.intakeLeft.set(-intakeSpeed);
		RobotMap.intakeRight.set(intakeSpeed);
	}
	public void stopAll () {
		RobotMap.intakeLeft.set(0);
		RobotMap.intakeRight.set(0);
	}

	public void intakeDown() {
		RobotMap.intakeLeft.set(intakeSpeed);
		RobotMap.intakeRight.set(-intakeSpeed);
	}
	public void slowDown() {
		RobotMap.intakeLeft.set(.3);
		RobotMap.intakeRight.set(-.3);
	}

	public void initDefaultCommand() {

		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
		setDefaultCommand(new SlowDown());
	}

}
