package com.pattern.state;

public class SoldOutState implements State {
	GumballMachine machine;
	
	public SoldOutState(GumballMachine machine){
		this.machine = machine;
	}

	@Override
	public void insertQuarter() {
		// TODO Auto-generated method stub
		System.out.println("상품이 매진되었습니다. 다음 기회에 이용해주세요.");
	}

	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		System.out.println("동전을 넣지 않았습니다.");
	}

	@Override
	public void turnCrack() {
		// TODO Auto-generated method stub
		System.out.println("상품이 매진되었습니다. 다음 기회에 이용해주세요.");
	}

	@Override
	public void dispense() {
		// TODO Auto-generated method stub
		System.out.println("상품이 매진되었습니다. 다음 기회에 이용해주세요.");
	}

	@Override
	public String toString(){
		return "매진";
	}
}
