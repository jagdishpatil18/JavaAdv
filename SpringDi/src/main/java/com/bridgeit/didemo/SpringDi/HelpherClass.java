package com.bridgeit.didemo.SpringDi;

public class HelpherClass {
	
	DemoInterface demoInterface;
	
	public void getDisplay(){
		demoInterface.Display();
		
	}
	public HelpherClass(DemoInterface demoInterface) {
		this.demoInterface=demoInterface;
		
		
		// TODO Auto-generated constructor stub
	}
	
	

}
