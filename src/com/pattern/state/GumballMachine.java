package com.pattern.state;

public class GumballMachine {
	State hasQuarter;
	State noQuarter;
	State soldOut;
	State sold;
	State lucky;
	
	private State state;
	private int count = 0;
	
	public GumballMachine(int count){
		this.count = count;
		
		hasQuarter	= new HasQuarterState(this);
		noQuarter	= new NoQuarterState(this);
		soldOut		= new SoldOutState(this);
		sold		= new SoldState(this);
		lucky		= new LuckyState(this);
		
		if(count > 0){
			state = noQuarter;
		}else{
			state = soldOut;
		}
	}
	
	public void insertQuarter(){
		state.insertQuarter();
	}
	
	public void ejectQuarter(){
		state.ejectQuarter();
	}
	
	public void turnCrack(){
		state.turnCrack();
		state.dispense();
	}
	
	public void dispense(){
		state.dispense();
	}
	
	public void setState(State state){
		this.state = state;
	}
	
	public State getState(){
		return this.state;
	}
	
	public void minusCount(){
		this.count--;
	}

	public void minusCount(int count){
		this.count -= 2;
	}
	
	public int getCount(){
		return this.count;
	}
	
	public State getSoldState(){
		return sold;
	}
	
	public State getSoldOutState(){
		return soldOut;
	}
	
	public State getNoQuarterState(){
		return noQuarter;
	}
	
	public State getHasQuaterState(){
		return hasQuarter;
	}
	
	public State getLuckyState(){
		return lucky;
	}
	
	@Override
	public String toString(){
		StringBuilder builder = new StringBuilder();
		
		builder.append("현재 상태 : ").append(this.getState()).append("\n");
		builder.append("남은 갯수 : ").append(this.getCount());
		
		return builder.toString();
	}
}
