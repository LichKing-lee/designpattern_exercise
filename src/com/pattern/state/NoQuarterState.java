package com.pattern.state;

public class NoQuarterState implements State {
	GumballMachine machine;
	
	public NoQuarterState(GumballMachine machine){
		this.machine = machine;
	}

	@Override
	public void insertQuarter() {
		// TODO Auto-generated method stub
		machine.setState(machine.getHasQuaterState());
		System.out.println("동전을 넣으셨습니다.");
	}

	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		System.out.println("동전을 넣지 않았습니다.");
	}

	@Override
	public void turnCrack() {
		// TODO Auto-generated method stub
		System.out.println("동전을 넣어주세요.");
	}

	@Override
	public void dispense() {
		// TODO Auto-generated method stub
		System.out.println("동전을 넣어주세요.");
	}

	@Override
	public String toString(){
		return "동전투입 대기중";
	}
}
