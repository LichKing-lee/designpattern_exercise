package com.pattern.state;

public class HasQuarterState implements State {
	GumballMachine machine;
	
	public HasQuarterState(GumballMachine machine){
		this.machine = machine;
	}

	@Override
	public void insertQuarter() {
		// TODO Auto-generated method stub
		System.out.println("동전은 한개만 넣어주세요.");
	}

	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		machine.setState(machine.getNoQuarterState());
		System.out.println("동전이 반환되었습니다.");
	}

	@Override
	public void turnCrack() {
		// TODO Auto-generated method stub
		System.out.println("손잡이를 돌렸습니다.");
		
		int luckyNum = (int)(Math.random() * 10);
		
		if(luckyNum == 1 && machine.getCount() > 1){
			machine.setState(machine.getLuckyState());
		}else{
			machine.setState(machine.getSoldState());
		}
	}

	@Override
	public void dispense() {
		// TODO Auto-generated method stub
		System.out.println("동전은 한개만 넣어주세요.");
	}

	@Override
	public String toString(){
		return "동전이 들어있는 중";
	}
}
