package com.pattern.templatemethod;

public class BeverageTest {
	public static void main(String[] args){
		Beverage coffee = new Coffee();
		Beverage tea = new Tea();
		
		System.out.println("========커피=========");
		coffee.prepareRecipe();
		
		System.out.println("========홍차=========");
		tea.prepareRecipe();
	}
}
