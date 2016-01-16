package com.pattern.decorator;

public class BeverageTest {
	public static void main(String[] args) {
		Beverage milkCreamCoffee = new CreamDecorator(new MilkDecorator(new Coffee()));
		Beverage cinnamonCoffee = new CinnamonDecorator(new Coffee());
		Beverage milkTea = new MilkDecorator(new Tea());
		
		System.out.println(milkCreamCoffee.getDescription());
		System.out.println(milkCreamCoffee.getCost());
		System.out.println(cinnamonCoffee.getDescription());
		System.out.println(cinnamonCoffee.getCost());
		System.out.println(milkTea.getDescription());
		System.out.println(milkTea.getCost());
	}
}
