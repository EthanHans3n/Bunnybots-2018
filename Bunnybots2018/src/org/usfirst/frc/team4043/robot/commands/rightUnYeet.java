package org.usfirst.frc.team4043.robot.commands;

import org.usfirst.frc.team4043.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class rightUnYeet extends Command {

    public rightUnYeet() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.sorter);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
<<<<<<< HEAD:Bunnybots2018/src/org/usfirst/frc/team4043/robot/commands/rightUnYeet.java
    	Robot.Sorter.rightUnYeet();
=======
    	Robot.sorter.actualUnYeet();
>>>>>>> 4067bd194f1697bdad322f294e52245cf0e39926:Bunnybots2018/src/org/usfirst/frc/team4043/robot/commands/actualUnYeet.java
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
<<<<<<< HEAD:Bunnybots2018/src/org/usfirst/frc/team4043/robot/commands/rightUnYeet.java
    	Robot.Sorter.noYeet();
    
=======
    	Robot.sorter.noYeet();
>>>>>>> 4067bd194f1697bdad322f294e52245cf0e39926:Bunnybots2018/src/org/usfirst/frc/team4043/robot/commands/actualUnYeet.java
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
