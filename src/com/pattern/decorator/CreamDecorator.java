package com.pattern.decorator;

public class CreamDecorator implements Beverage {
	Beverage beverage;
	
	public CreamDecorator(Beverage beverage){
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "크림 " + beverage.getDescription();
	}

	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return 500 + beverage.getCost();
	}

}
