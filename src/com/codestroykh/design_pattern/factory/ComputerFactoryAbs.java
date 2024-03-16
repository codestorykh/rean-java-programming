package com.codestroykh.design_pattern.factory;

public class ComputerFactoryAbs {

	public static Computer getComputer(ComputerAbstractFactory factory){
		return factory.createComputer();
	}
	
}
