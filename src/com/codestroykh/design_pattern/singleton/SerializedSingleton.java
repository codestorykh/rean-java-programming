package com.codestroykh.design_pattern.singleton;

import java.io.Serializable;

public class SerializedSingleton implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7879560787590305078L;


    private SerializedSingleton(){}
    
    private static class SingletonHelper{
        private static final SerializedSingleton instance = new SerializedSingleton();
    }
    
    public static SerializedSingleton getInstance(){
        return SingletonHelper.instance;
    }
}
