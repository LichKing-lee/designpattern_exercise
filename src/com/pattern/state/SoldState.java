package com.pattern.state;

public class SoldState implements State {
	GumballMachine machine;
	
	public SoldState(GumballMachine machine){
		this.machine = machine;
	}
	
	@Override
	public void insertQuarter() {
		// TODO Auto-generated method stub
		System.out.println("잠시만 기다려주세요. 알맹이가 나가고있습니다.");
	}

	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		System.out.println("동전을 넣지 않았습니다.");
	}

	@Override
	public void turnCrack() {
		// TODO Auto-generated method stub
		System.out.println("잠시만 기다려주세요. 알맹이가 나가고있습니다.");
	}

	@Override
	public void dispense() {
		// TODO Auto-generated method stub
		System.out.println("알맹이가 나가고있습니다.");
		machine.minusCount();
		
		if(machine.getCount() == 0){
			System.out.println("더 이상 알맹이가 없습니다.");
			machine.setState(machine.getSoldOutState());
		}else{
			machine.setState(machine.getNoQuarterState());
		}
	}

	@Override
	public String toString(){
		return "알맹이가 나가고있는 중";
	}
}
