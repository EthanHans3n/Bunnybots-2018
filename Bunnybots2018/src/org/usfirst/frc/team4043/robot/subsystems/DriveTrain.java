package org.usfirst.frc.team4043.robot.subsystems;

import org.usfirst.frc.team4043.robot.RobotMap;
<<<<<<< HEAD
import org.usfirst.frc.team4043.robot.commands.Drive;
=======
import org.usfirst.frc.team4043.robot.Robot;
>>>>>>> 4067bd194f1697bdad322f294e52245cf0e39926

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
	
	//These get drawn in from the correct driver profile
	double maxSpeed;
	double maxTurn;
	boolean arcadeTank;
	String profileSelected = Robot.selectedProfile;
	
	public DriveTrain() {
		super();
		drive = new DifferentialDrive(RobotMap.motorFL, RobotMap.motorFR);
		RobotMap.motorBL.follow(RobotMap.motorFL);
		RobotMap.motorBR.follow(RobotMap.motorFR);
		
		RobotMap.motorFR.setSafetyEnabled(false);
		RobotMap.motorFL.setSafetyEnabled(false);
		RobotMap.motorBR.setSafetyEnabled(false);
		RobotMap.motorBL.setSafetyEnabled(false);
		drive.setSafetyEnabled(false);
		
		switch (profileSelected) {
		case "ethan" :
			maxSpeed = 1.0;
			maxTurn = 1.0;
			arcadeTank = true;
		}
	}
	
	public void drive(double left, double right) {
//	if (Robot.driveType) {
//	drive.arcadeDrive(left, right);
//	} else { 
//	}
	}
	public void Drive(Joystick joy) {
		inputSpeed = -joy.getRawAxis(1);
		inputTurn = joy.getRawAxis(5);
		drive(inputSpeed, -inputTurn);
	}
	
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new Drive());
    }
<<<<<<< HEAD
    
    
	public void drive(int i, int j) {
		// TODO Auto-generated method stub
		
	}
=======

>>>>>>> 4067bd194f1697bdad322f294e52245cf0e39926
	public void drive(Joystick driveStick) {
		// TODO Auto-generated method stub
		
	}
}

