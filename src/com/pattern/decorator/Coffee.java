package com.pattern.decorator;

public class Coffee implements Beverage {

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "커피";
	}

	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return 1000;
	}

}
