/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team4043.robot;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	public static WPI_TalonSRX motorFR = new WPI_TalonSRX(9);
	public static WPI_TalonSRX motorBR = new WPI_TalonSRX(6);
	public static  WPI_TalonSRX motorFL = new WPI_TalonSRX(7);
	public static  WPI_TalonSRX motorBL = new WPI_TalonSRX(5);

	public static WPI_TalonSRX constantIntake = new WPI_TalonSRX(56);
	public static WPI_TalonSRX yeetR = new WPI_TalonSRX(79);
	public static WPI_TalonSRX yeetL = new WPI_TalonSRX(69);
	
}	
