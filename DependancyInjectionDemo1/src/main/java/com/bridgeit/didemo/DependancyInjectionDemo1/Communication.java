package com.bridgeit.didemo.DependancyInjectionDemo1;

public class Communication {
	MessageImpl messageImpl;
	public void getDisplay(){
		messageImpl.sendMessage();
	}
	//DI via setter method
	public void setOutputGenerator(MessageImpl messageImpl) {
		this.messageImpl=messageImpl;
	}
}
	
	

