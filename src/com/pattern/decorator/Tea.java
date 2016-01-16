package com.pattern.decorator;

public class Tea implements Beverage {

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "차";
	}

	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return 1500;
	}

}
