/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team4043.robot;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Preferences;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
//import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
//import org.usfirst.frc.team4043.robot.commands.ExampleCommand;
import org.usfirst.frc.team4043.robot.subsystems.DriveTrain;
import org.usfirst.frc.team4043.robot.subsystems.Intake;
import org.usfirst.frc.team4043.robot.subsystems.Sorter;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the TimedRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the build.properties file in the
 * project.
 */
public class Robot extends TimedRobot {
	public static DriveTrain driveTrain;
	public static Intake intake;
	public static Sorter sorter;
	
	public static DigitalInput arduinoDIOLeft;
	public static DigitalInput arduinoDIORight;
	
	public static boolean ballColorLeft;
	public static boolean ballColorRight;
	
	public static String selectedProfile;
	
	public static boolean teamColor;
	
	Preferences prefs;
	
	public static OI m_oi; 	//This MUST be declared last
	Command m_autonomousCommand;
	SendableChooser<Command> m_chooser = new SendableChooser<>();

	/**
	 * This function is run when the robot is first started up and should be
	 * used for any initialization code.
	 */
	@Override
	public void robotInit() {
		prefs = Preferences.getInstance();
		selectedProfile = prefs.getString("DriverName", "ethan");
		
		driveTrain = new DriveTrain();
		intake = new Intake(); 
		sorter = new Sorter();
		arduinoDIOLeft = new DigitalInput(0);
		arduinoDIORight = new DigitalInput(1);
		
		m_oi = new OI();	//This MUST be declared last
		
		System.out.println(selectedProfile);
	}

	/**
	 * This function is called once each time the robot enters Disabled mode.
	 * You can use it to reset any subsystem information you want to clear when
	 * the robot is disabled.
	 */
	@Override
	public void disabledInit() {

	}
       
	@Override
	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}

	/**
	 * This autonomous (along with the chooser code above) shows how to select
	 * between different autonomous modes using the dashboard. The sendable
	 * chooser code works with the Java SmartDashboard. If you prefer the
	 * LabVIEW Dashboard, remove all of the chooser code and uncomment the
	 * getString code to get the auto name from the text box below the Gyro
	 *
	 * <p>You can add additional auto modes by adding additional commands to the
	 * chooser code above (like the commented example) or additional comparisons
	 * to the switch structure below with additional strings & commands.
	 */
	@Override
	public void autonomousInit() {
		m_autonomousCommand = m_chooser.getSelected();

		/*
		 * String autoSelected = SmartDashboard.getString("Auto Selector",
		 * "Default"); switch(autoSelected) { case "My Auto": autonomousCommand
		 * = new MyAutoCommand(); break; case "Default Auto": default:
		 * autonomousCommand = new ExampleCommand(); break; }
		 */

		// schedule the autonomous command (example)
		if (m_autonomousCommand != null) {
			m_autonomousCommand.start();
		}
	}

	/**
	 * This function is called periodically during autonomous.
	 */
	@Override
	public void autonomousPeriodic() {
		Scheduler.getInstance().run();
	}

	@Override
	public void teleopInit() {
		// This makes sure that the autonomous stops running when
		// teleop starts running. If you want the autonomous to
		// continue until interrupted by another command, remove
		// this line or comment it out.
		if (m_autonomousCommand != null) {
			m_autonomousCommand.cancel();
		}
		
		prefs = Preferences.getInstance();
		selectedProfile = prefs.getString("DriverName", "ethan");
		teamColor = prefs.getBoolean("ColorPicker", true);
		
		System.out.println(selectedProfile);
	}

	/**
	 * This function is called periodically during operator control.
	 */
	@Override
	public void teleopPeriodic() {
		Scheduler.getInstance().run();
		
		ballColorLeft = arduinoDIOLeft.get();
		ballColorRight = arduinoDIORight.get();
		
		if (teamColor) {				//If the wanted color is red
			if (ballColorLeft){			//If the actual left color is red
				sorter.leftUnYeet();	//Keep the left sorter going up
			} else if (!ballColorLeft) {//If the actual left color is blue
				sorter.leftYeet(); 		//yeet the left side
			}
			
			if (ballColorRight){		//If the actual right color is red
				sorter.rightUnYeet();	//Keep the right sorter going up
			} else if (!ballColorRight) {//If the actual right color is blue
				sorter.rightYeet(); 	//yeet the right side
			}
		}
	}

	/**
	 * This function is called periodically during test mode.
	 */
	@Override
	public void testPeriodic() {
	}
}
