package com.tutego.insel.solutions.optim;
public class Basic implements BasicMBean
{
	private String _data = "default";

	public void setData(String data) {
		_data = data;
	}

	public String getData() {
		return _data;
	}
	
	public void doIt()
	{
		System.out.println( "Huhu" );
	}
}