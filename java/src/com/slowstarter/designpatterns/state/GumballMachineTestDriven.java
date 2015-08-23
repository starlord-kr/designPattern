package com.slowstarter.designpatterns.state;

public class GumballMachineTestDriven {

	public static void main(String[] args) {
		GumballMachine gumballMachine = new GumballMachine(5);
		
		System.out.println("!! " + gumballMachine);
		
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		
		System.out.println("!! " + gumballMachine);
		
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		
		System.out.println("!! " + gumballMachine);
		
		gumballMachine.releaseBall();
		System.out.println("!! " + gumballMachine);
		gumballMachine.turnCrank();
		System.out.println("!! " + gumballMachine);
		gumballMachine.releaseBall();
		System.out.println("!! " + gumballMachine);
		gumballMachine.turnCrank();
		System.out.println("!! " + gumballMachine);
		gumballMachine.releaseBall();
		System.out.println("!! " + gumballMachine);
		gumballMachine.turnCrank();
		System.out.println("!! " + gumballMachine);
	}
}
