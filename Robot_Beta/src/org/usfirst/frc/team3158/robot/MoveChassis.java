package org.usfirst.frc.team3158.robot;

import org.usfirst.frc.team3158.robot.commands.DriveCommand;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;

public class MoveChassis extends Subsystem {

	TalonSRX m1;	TalonSRX m3;
	TalonSRX m2;	TalonSRX m4;


    public void initDefaultCommand() {
    	this.setDefaultCommand(new DriveCommand());
    }
    
    public void drive(double turn, double speed){
		double l = speed + turn;
		double r = speed - turn;
		
		m1.set(ControlMode.PercentOutput, l);
		m2.set(ControlMode.PercentOutput, l);
		m3.set(ControlMode.PercentOutput, r);
		m4.set(ControlMode.PercentOutput, r);
		
	}
	public void stop(){
		
		m1.set(ControlMode.PercentOutput, 0);
		m2.set(ControlMode.PercentOutput, 0);
		m3.set(ControlMode.PercentOutput, 0);
		m4.set(ControlMode.PercentOutput, 0);
		
	}

}

