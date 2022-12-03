package com.learningjava.pattern.factory;

public class ComputerFactoryAbs {

	public static Computer getComputer(ComputerAbstractFactory factory){
		return factory.createComputer();
	}
	
}
