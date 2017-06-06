package com.bridgeit.didemo.SpringDISetter;

public class Helper {
	private DemoInterface demoInterface;
	
	
	public void setDemoInterface(DemoInterface demoInterface) {
		this.demoInterface = demoInterface;
	}

	public void communicate()
	{
		demoInterface.Display();
	}
	
}
