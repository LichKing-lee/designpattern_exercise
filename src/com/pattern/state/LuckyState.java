package com.pattern.state;

public class LuckyState implements State {
	GumballMachine machine;
	
	public LuckyState(GumballMachine machine){
		this.machine = machine;
	}
	
	@Override
	public void insertQuarter() {
		// TODO Auto-generated method stub
		System.out.println("알맹이가 나가고 있어 동전을 넣을 수 없습니다.");
	}

	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		System.out.println("알맹이가 나가고 있어 동전을 반환할 수 없습니다.");
	}

	@Override
	public void turnCrack() {
		// TODO Auto-generated method stub
		System.out.println("알맹이가 나가고 있어 손잡이를 돌릴 수 없습니다.");
	}

	@Override
	public void dispense() {
		// TODO Auto-generated method stub
		System.out.println("축하합니다! 알맹이가 2개 나갑니다.");
		machine.minusCount(2);
		
		if(machine.getCount() == 0){
			System.out.println("더 이상 알맹이가 없습니다.");
			machine.setState(machine.getSoldOutState());
		}else{
			machine.setState(machine.getNoQuarterState());
		}
	}

	@Override
	public String toString(){
		return "축! 당첨!";
	}
}
