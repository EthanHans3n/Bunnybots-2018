package org.usfirst.frc.team4043.robot.subsystems;

import org.usfirst.frc.team4043.robot.RobotMap;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;


/**
 *
 */
public class DriveTrain extends Subsystem {
	public DifferentialDrive drive; 
	double inputSpeed;
	double inputTurn; 
	boolean flase = false; 
	
	public DriveTrain() {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	super();
	drive = new DifferentialDrive(RobotMap.motorFL, RobotMap.motorFR);
	RobotMap.motorBL.follow(RobotMap.motorFL);
	RobotMap.motorBR.follow(RobotMap.motorFR);
	
	RobotMap.motorFR.setSafetyEnabled(false);
	RobotMap.motorFL.setSafetyEnabled(false);
	RobotMap.motorBR.setSafetyEnabled(false);
	RobotMap.motorBL.setSafetyEnabled(false);
	drive.setSafetyEnabled(false);
	
	}
	public void drive(double left, double right) {
//	if (Robot.driveType) {
//	drive.arcadeDrive(left, right);
//	} else { 
//	}
	}
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }

	public void drive(int i, int j) {
		// TODO Auto-generated method stub
		
	}
	public void drive(Joystick driveStick) {
		// TODO Auto-generated method stub
		
	}
}

