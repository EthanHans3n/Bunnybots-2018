/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team4043.robot;

import org.usfirst.frc.team4043.robot.commands.IntakeDown;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	
	public static Joystick driveStick = new Joystick(3);
	public static Joystick coStick = new Joystick(5);
	
	public Button intakeUpButton = new JoystickButton(driveStick, 1);
	public Button intakeDownButton = new JoystickButton(driveStick, 2);
	
	public OI() {
		intakeDownButton.whileHeld(new IntakeDown());
	}

	public Joystick getDriveStick() {
		return driveStick;
	}

	public Joystick getCoStick() {
		return coStick;
	}

}
