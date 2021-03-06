/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team4043.robot;

import org.usfirst.frc.team4043.robot.commands.DumpLeft;
import org.usfirst.frc.team4043.robot.commands.DumpRight;
import org.usfirst.frc.team4043.robot.commands.IntakeDown;
import org.usfirst.frc.team4043.robot.commands.IntakeStop;
import org.usfirst.frc.team4043.robot.commands.IntakeUp;
import org.usfirst.frc.team4043.robot.commands.SlowDown;
import org.usfirst.frc.team4043.robot.commands.StopDumpLeft;
import org.usfirst.frc.team4043.robot.commands.StopDumpRight;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	
	public static Joystick driveStick = new Joystick(0);
	public static Joystick coStick = new Joystick(1);
	
	public Button upButton = new JoystickButton(driveStick, 4);
	public Button downButton = new JoystickButton(driveStick, 1);
	public Button intakeStopButton = new JoystickButton(driveStick, 2);
	public Button slowDownButton = new JoystickButton(driveStick, 3);
	
	public Button leftDump = new JoystickButton(driveStick, 5);
	public Button rightDump = new JoystickButton(driveStick, 6);
	
	public OI() {
		upButton.whileHeld(new IntakeUp());
		upButton.whenReleased(new SlowDown());
		
		downButton.whileHeld(new IntakeDown());
		downButton.whenReleased(new SlowDown());
		
		intakeStopButton.whenPressed(new IntakeStop());
		
		leftDump.whileHeld(new DumpLeft());
		leftDump.whenReleased(new StopDumpLeft());
		rightDump.whileHeld(new DumpRight());
		rightDump.whenReleased(new StopDumpRight());
		
		slowDownButton.whenPressed(new SlowDown());
	}

	public Joystick getDriveStick() {
		return driveStick;
	}

	public Joystick getCoStick() {
		return coStick;
	}

}
