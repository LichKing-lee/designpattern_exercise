package com.pattern.state;

public class GumballMachineTestDrive {
	public static void main(String[] args){
		GumballMachine machine = new GumballMachine(5);
		
		System.out.println(machine);
		
		machine.insertQuarter();
		machine.turnCrack();
		
		System.out.println(machine);
		
		machine.insertQuarter();
		machine.ejectQuarter();
		machine.turnCrack();
		
		System.out.println(machine);
		
		machine.insertQuarter();
		machine.turnCrack();
		machine.insertQuarter();
		machine.turnCrack();
		machine.ejectQuarter();
		
		System.out.println(machine);
		
		machine.insertQuarter();
		machine.insertQuarter();
		machine.turnCrack();
		machine.insertQuarter();
		machine.turnCrack();
		machine.insertQuarter();
		machine.turnCrack();
		
		System.out.println(machine);
	}
}
